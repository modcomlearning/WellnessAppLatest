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

This File is where your UI/User Interface is created, We use a language known as XML , Its a markup language that uses tags like HTML

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

Switch from code to UI using icons sourrounded in red in below image

![image(2).png](../../Downloads/image%282%29.png)


#### TODO XML in detail in Chapter 2


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

XML only shows them, it does NOT control logic, like what to do when clicked , touched etc

Above XML would display the TextView and Button as below

![img_5.png](img_5.png)


## Views in Android
What is a View?

In Android, a View is any element that you can see on the screen.

Examples:
Text

Buttons

Images

A View = a building block of the user interface (UI)

### Common Types of Views in Android
1. TextView – Displays text on the screen.
2. Button – Clickable element for actions.
3. ImageView – Displays images or icons.
4. EditText – Lets the user input text.
5. CheckBox – Allows multiple selections.
6. RadioButton – Allows single selection from a group.
7. Switch – Toggle between on/off states.
8. ProgressBar – Shows progress of tasks.
9. SeekBar – Slider for selecting values.
10. Spinner – Drop-down menu for choosing options.
11. ListView – Displays a scrollable list of items.
12. RecyclerView – Advanced, efficient list for large data.
13. WebView – Displays web pages inside the app.
14. etc.


## What is a ViewGroup?

A ViewGroup is a special type of View that holds other Views (or ViewGroups).

Think of it as a container or layout.

It organizes how child Views appear on the screen.

Examples: arranging buttons, text, and images.

### Example:
Views = furniture (chair, table, TV)
ViewGroup = the room holding the furniture.

### Common ViewGroups in Android

LinearLayout – Arranges child Views in a single row or column (horizontal or vertical).

ConstraintLayout – Flexible layout that positions Views relative to each other or the parent, ideal for complex designs.

ScrollView – Makes its child scrollable vertically (or horizontal with HorizontalScrollView).

GridLayout – Arranges child Views in a grid of rows and columns.

TableLayout – Organizes Views in table-like rows and columns.

CoordinatorLayout – Special layout for coordinating animations or interactions (used with Material Design).

RecyclerView – Advanced container for efficiently displaying large scrollable lists.

These ViewGroups are the containers that organize UI elements, and each has a specific way of arranging the Views inside it.


### An Example of LinearLayout View Group

```xml
   <LinearLayout
       xmlns:android="http://schemas.android.com/apk/res/android"
       android:layout_width="match_parent"
       android:layout_height="match_parent"
       android:orientation="vertical">
   
       <TextView
           android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:text="Hello Student!" />
   
       <Button
           android:layout_width="wrap_content"
           android:layout_height="wrap_content"
           android:text="Click Me" />
   
   </LinearLayout>
```

Above shows a LinearLayout ViewGroup holding two views namely TextView and Button.
The LinearLayout has a property orientation that makes the views inside it, show vertically.

![img_6.png](img_6.png)

Now that we know what are Views and ViewGroup, Lets now understand common properties using in views

### Common Properties of Android Views

Every View in Android has some basic properties that control its size, appearance, and behavior.

1. android:id
   Gives a unique name to the View
   Used to reference it in Kotlin

2. android:layout_width & android:layout_height
   Control the size of the View
   Common values:
   wrap_content → size fits the content
   match_parent → fills the available space

3. android:text
   Text displayed by Views like TextView or Button

4. android:hint
   Placeholder text in EditText fields

5. android:src
   Image source for ImageView

6. android:background
   Sets background color or image

7. android:visibility
   Controls if the View is visible, invisible, or gone.

8. android:padding
   Space inside the View (between content and border)

9. android:margin
   Space outside the View (distance from other Views).

10. android:textSize
    Changes text size.

## Chapter 3
In this chapter, we will use XML to design the user interface (UI) for a simple Health and Wellness App.
The app will help users understand:

Health Information

Wellness Information

Simple interactive elements like buttons and text.

XML will be used for what the user sees.

So, Open your XML Code under res->layout->activity_main.xml

Below is your current XML code.

```xml
<?xml version="1.0" encoding="utf-8"?>
   <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
           xmlns:app="http://schemas.android.com/apk/res-auto"
           xmlns:tools="http://schemas.android.com/tools"
           android:id="@+id/main"
           android:layout_width="match_parent"
           android:layout_height="match_parent"
           android:background="#448AFF"
           tools:context=".MainActivity">
   
      <TextView
              android:layout_width="wrap_content"
              android:layout_height="wrap_content"
              android:text="Hello World!"
              app:layout_constraintBottom_toBottomOf="parent"
              app:layout_constraintEnd_toEndOf="parent"
              app:layout_constraintStart_toStartOf="parent"
              app:layout_constraintTop_toTopOf="parent" />
   
   </androidx.constraintlayout.widget.ConstraintLayout>
```
Next, we will add new Views and ViewGroups, here, we create TextViews to display health and wellness information.
Add Buttons for user interaction and navigation.

So we change the Constraint Layout to Linear Layout to allow views arrangement on screen.
modify your code as shown below.

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:id="@+id/main"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#448AFF"
        android:orientation="vertical"
        tools:context=".MainActivity">
   

</LinearLayout>
```

Above image, we have changed the Layout to Linear, added an Orientation property in the Linear Layout.
We have also removed the TextView View. So we have an empty Linear Layout(It's a ViewGroup).

Now inside the LinearLayout, we add 
1. TextView  - For App heading
2. ImageView - For Displaying a from Image
3. Buttons - To provide users withoption to click on a Button and navigate on another screen


Add below TextView

```xml
  <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Health and Wellness"
        android:textSize="30sp"
        android:padding="20dp"
        android:textAlignment="center"
        android:textStyle="bold"
        android:layout_marginTop="30dp"
        android:textColor="#ffffff"
/>
```

### Explanation of Attributes

android:layout_width="match_parent" → TextView stretches across the full width of the screen

android:layout_height="wrap_content" → Height adjusts automatically to fit the text

android:text="Health and Wellness" → The text displayed

android:textSize="30sp" → Makes the text large and readable

android:padding="20dp" → Adds space inside the TextView (around the text)

android:textAlignment="center" → Centers the text horizontally

android:textStyle="bold" → Makes the text bold

android:layout_marginTop="30dp" → Adds space above the TextView from other elements

android:textColor="#ffffff" → Makes the text white



### Full Code 
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:id="@+id/main"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#448AFF"
        android:orientation="vertical"
        tools:context=".MainActivity">

   <TextView
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:text="Health and Wellness"
           android:textSize="30sp"
           android:padding="20dp"
           android:textAlignment="center"
           android:textStyle="bold"
           android:layout_marginTop="30dp"
           android:textColor="#ffffff"
   />
   
   
</LinearLayout>

```

#### Output

![img_8.png](img_8.png)


#### Add an ImageView

First copy and paste provided images in res-drawable folder

#### Add an ImageView

```xml
    <ImageView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:src="@drawable/image2"
        android:layout_margin="10dp"
        android:scaleType="fitCenter"/>
```
Above ImageView, we specify the width and height, then we load the image we pasted in drawable, we make the image fit properly at the center.  

#### Add Buttons, Below is an example of one button UI.

```xml
     <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Healthy Recipes"
        android:layout_margin="10dp"
        android:id="@+id/healthy_tips"/>
```


### Full XML Code

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:id="@+id/main"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#448AFF"
        android:orientation="vertical"
        tools:context=".MainActivity">

   <TextView
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:text="Health and Wellness"
           android:textSize="30sp"
           android:padding="20dp"
           android:textAlignment="center"
           android:textStyle="bold"
           android:layout_marginTop="30dp"
           android:textColor="#ffffff"
   />

   <ImageView
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:src="@drawable/image2"
           android:layout_margin="10dp"
           android:scaleType="fitCenter"/>

   <Button
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:text="Healthy Recipes"
           android:layout_margin="10dp"
           android:id="@+id/healthy_tips"/>

   <Button
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:text="Nutrition Advice"
           android:layout_margin="10dp"
           android:id="@+id/nutrition_advice"/>

   <Button
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:text="Meditation"
           android:layout_margin="10dp"
           android:id="@+id/meditation"/>

   <Button
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:text="Hydration Alert"
           android:layout_margin="10dp"
           android:id="@+id/hydration_alert"/>

   <Button
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:text="Start Exercise"
           android:layout_margin="10dp"
           android:id="@+id/start_exercise"/>

   <Button
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:text="Daily Motivation"
           android:layout_margin="10dp"
           android:id="@+id/daily_motivation"/>

   <Button
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:text="Weekly Goals"
           android:layout_margin="10dp"
           android:id="@+id/weekly_goals"/>

   <Button
           android:layout_width="match_parent"
           android:layout_height="wrap_content"
           android:text="Check Progress"
           android:layout_margin="10dp"
           android:id="@+id/wcheck_progress"/>


</LinearLayout>
```

### Running Your App
Option 1: Emulator

Built-in virtual Android device in Android Studio

Option 2: Physical Device

Enable Developer Options

Turn on USB Debugging

Connect phone via USB
uers
### Output

![img_9.png](img_9.png)

Since we have several buttons, they might extend outiside the screen height being invisible to users this depends on screen size of the smartphone you are using, users might need to scroll up and down for that reason we need to wrap our Views with a ScrollView.

Wrap your Views with a ScrollView, First lets look at ScrollView Syntax

```xml
 <ScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent">
        
        //Other Views Goes here
</ScrollView>
```

#### Full Code activity_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<ScrollView
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
<LinearLayout 
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#448AFF"
    android:orientation="vertical"
    tools:context=".MainActivity">
    
        
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Health and Wellness"
        android:textSize="30sp"
        android:padding="20dp"
        android:textAlignment="center"
        android:textStyle="bold"
        android:layout_marginTop="30dp"
        android:textColor="#ffffff"
        />

    <ImageView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:src="@drawable/image2"
        android:layout_margin="10dp"
        android:scaleType="fitCenter"/>

     <Button
         android:layout_width="match_parent"
         android:layout_height="wrap_content"
         android:text="Healthy Recipes"
         android:layout_margin="10dp"
         android:id="@+id/healthy_tips"/>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Nutrition Advice"
        android:layout_margin="10dp"
        android:id="@+id/nutrition_advice"/>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Meditation"
        android:layout_margin="10dp"
        android:id="@+id/meditation"/>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Hydration Alert"
        android:layout_margin="10dp"
        android:id="@+id/hydration_alert"/>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Start Exercise"
        android:layout_margin="10dp"
        android:id="@+id/start_exercise"/>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Daily Motivation"
        android:layout_margin="10dp"
        android:id="@+id/daily_motivation"/>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Weekly Goals"
        android:layout_margin="10dp"
        android:id="@+id/weekly_goals"/>

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Check Progress"
        android:layout_margin="10dp"
        android:id="@+id/wcheck_progress"/>
    
 
</LinearLayout>
</ScrollView>

```

### Explanation
In Above Code, we have a ScrollView as the main ViewGroup to enable scrolling capabilities.

Then we have a LinearLayout that specifies the Views arrangement - Vertical in this case, Inside the Linear Layout, We put our Views.

Now if you run the application, you will be able to have a Scrolling Up and down capabilities.

Below screenshot shows scrolling has been enabled by addng a ScrollView ViewGroup.

### Output after scrollview implementation

![img_10.png](img_10.png)


## Chapter 4

What is an Intent?

An Intent is like a messenger in Android that tells the app to do something or go somewhere.

Example: When a user clicks a button, the app can open another screen using an Intent.

Button click
Intent = Go to another screen
## Two Types of Intents
### Explicit Intent
Tells Android exactly which Activity (screen) to open
Example: Clicking “Start Exercise” button → Opens ExerciseActivity
### Implicit Intent
Android decides which app or activity can handle the action
Example: Clicking a “Share” button → Opens a list of apps (WhatsApp, Email, etc.)

### Focus in This Chapter: Explicit Intents
When the user clicks a button, they are taken to a specific screen or Activity

#### Example of Explicit Intents

![Gemini_Generated_Image_cf71uzcf71uzcf71.png](../../Downloads/Gemini_Generated_Image_cf71uzcf71uzcf71.png)
   