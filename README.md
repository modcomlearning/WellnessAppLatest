## Introduction to Android App Development

Android app development is the process of creating applications that run on the Android operating system, developed by Google. These apps can run on smartphones, tablets, smart TVs, and other Android-powered devices.

Android apps are built using specific tools, programming languages, and frameworks provided in the Android ecosystem.

### Advantages of Developing Android Apps
1. Wide User Base
   Android is the most widely used mobile OS globally.
   Millions of potential users across different devices.

2. Open Source Platform
   Android is based on open-source technologies.
   Developers have flexibility to customize apps.

3. Multiple Distribution Channels
   Apps can be distributed via:
   Google Play Store
   Third-party app stores
   Direct APK sharing

4. Rich Development Tools
   Official support from Google
   Powerful IDE and libraries

5. High Customization
   UI/UX can be fully customized
   Supports different screen sizes and devices

6. Monetization Opportunities
   Ads, subscriptions, in-app purchases
   
### Tools Used in Android Development
1. Android Studio
   Official IDE for Android development
   Developed by Google
   Features:
   Code editor with smart suggestions
   Emulator for testing apps
   Built-in debugging tools
   Drag-and-drop UI designer

### Programming Languages for Android
1. Kotlin (Recommended)
   Official language for Android development
   Fully supported by Google

### Follow these steps to create your first Android app:

Step 1: Open Android Studio
Launch Android Studio

Step 2: Click "File Menu"  then "New Project"

Choose "Empty Views Activity"

Step 3: Configure Your Project

![img_2.png](img_2.png)


### Fill in the following:

Name: Your app name (e.g., Class_WellnessApp)

Package Name: com.example.myfirstapp

Save Location: Choose folder

Language: Select Kotlin

Minimum SDK: Choose API level (e.g., API 21+)

Step 4: Click "Finish"

![img_1.png](img_1.png)

### Android Studio will:

Set up project structure

Download dependencies

Build your app

### Project Structure Overview

![img.png](img.png)

### Explanation
The image shows a part covered in;

1. Black line(Android Manifest)
2. Orange - Kotlin
3. Blue - XML

#### More explanations;

MainActivity.kt → Main logic of the app -  inside SRC

activity_main.xml → UI layout - inide res folder

AndroidManifest.xml → App configuration -  inside app 

Gradle Scripts → Dependency management - inside app.


### Lets briefly customize the app we created before running in our phones!

In your app, navigate to res Folder -> layout -> Open activity_main.xml

Thi File is where your UI/User Interface is created, We use a language known as XML , Its a markup language that uses tags ike HTML

![img_3.png](img_3.png)

Now, we want to change the background color of our app, in above code we see the whole code is enclosed in a Constraint layout

ConstraintLayout is the main container (layout) of your app screen.

It helps you position items anywhere on the screen.

Think of it as a board where you place your components.

xmlns:android - This tells Android: “I am using standard Android features” like texts, widths, height etc.

android:id="@+id/main"    - gives our layout a unique identification

android:layout_width="match_parent"  - specifies the layout width to fill entire width

android:layout_height="match_parent" - specifies the layout height to fill entire height

tools:context=".MainActivity" - “This layout belongs to MainActivity” a kotlin file located in src

To change background color, add below code to your ConstraintLayout.

```xml
  android:background="#448AFF"
```
Above code changes the Layout background to #448AFF cutomize to your color, check more on https://m2.material.io/design/color/the-color-system.html

![img_4.png](img_4.png)

Switch from code to UI using icons sourrou8nded in red in below image

![image(2).png](../../Downloads/image%282%29.png)

### Running Your App
Option 1: Emulator

Built-in virtual Android device in Android Studio

Option 2: Physical Device

Enable Developer Options

Turn on USB Debugging

Connect phone via USB

### Summary

Android development allows you to build apps for millions of users.

Android Studio is the main tool.

Kotlin is the preferred language.

Apps are built using Activities, Intents, and XML layouts.



## Chapter 2
XML vs Kotlin in Android Development

When building Android apps in Android Studio, you use two main parts:

### 1. XML → The User Interface (What the User Sees)
XML (eXtensible Markup Language) is used to design the layout of your app.(Same family with HTML)

### It controls:

Text on the screen

Buttons

Images

Arrangement of elements

### Simple Example (XML Layout)
```xml
   <TextView
       android:id="@+id/textView"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:text="Hello Student!" />
   
   <Button
       android:id="@+id/button"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"
       android:text="Click Me" />
```

### Explanation:

TextView → Displays text

Button → A clickable button

XML only shows them, it does NOT control logic, like what to o when clicked , touched etc


