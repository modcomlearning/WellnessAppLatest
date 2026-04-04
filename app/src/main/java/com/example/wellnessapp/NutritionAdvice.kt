package com.example.wellnessapp

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback

class NutritionAdvice : AppCompatActivity() {

    var rewardedAd: RewardedAd? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_nutrition_advice)
        //Load rewarded ads
        loadRewardedAd(this)
        //Show rewarded ad on Button Click
        val reward = findViewById<Button>(R.id.reward)
        reward.setOnClickListener{
            showRewardedAd(this)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


    fun loadRewardedAd(context: Context) {
        val adRequest = AdRequest.Builder().build()

        RewardedAd.load(context,
            "ca-app-pub-3940256099942544/5224354917",
            adRequest,
            object : RewardedAdLoadCallback() {

                override fun onAdLoaded(ad: RewardedAd) {
                    rewardedAd = ad
                }

                override fun onAdFailedToLoad(error: LoadAdError) {
                    rewardedAd = null
                }
            })
    }

    fun showRewardedAd(activity: Activity) {
        if (rewardedAd != null) {
            rewardedAd?.show(activity) { rewardItem ->
                // Give reward to user
                val rewardAmount = rewardItem.amount
                val rewardType = rewardItem.type

                println("User earned: $rewardAmount $rewardType")
                Toast.makeText(applicationContext, "Rewarded", Toast.LENGTH_SHORT).show()
                Toast.makeText(applicationContext, "Navigate a New Content Activity", Toast.LENGTH_SHORT).show()

            }
        } else {
            println("Ad not ready")
            Toast.makeText(applicationContext, "Not Rewarded", Toast.LENGTH_SHORT).show()
        }
    }
}