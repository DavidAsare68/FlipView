CENG 319-OND
Homework 2 Assignment
David Asare

Flip View


![image](https://user-images.githubusercontent.com/55444089/170802510-a23416d3-a757-48fa-a6f7-b6a7de8cb3ab.png)


![image](https://user-images.githubusercontent.com/55444089/170802545-c7f078a6-b316-46f2-be21-8d8536969552.png)


Introduction

This blog will be a tutorial covering the purpose and the functions of a Flipping View. The View Flipper attribute can perform animations for the android phone when making apps. It is also an extension of the view animator class, which is responsible for animating two or more views that have been added.

 History
 
The View Flipper was introduced to the API level 1. API stands for Application Programming Interface used to set functions or procedures. It allows the creation of applications to access features or data of an operating system. The View Flipper is meant to tolerate API level 1 and higher.

The Major Methods/Attributes

The major attributes that I used in the code are the Image Views and the Button. There are a lot of different attributes and ways you can use to make a flip view animation in android. The View Flipper can be setup to be performed in either xml or the Java code. I made the mechanism of the View Flipper using the Java code in the mainActivity.java file.  

In order to make a Flip View animation in the code, I first had to use sniping tool to take a picture of the front and back end of the credit card sample I found on google images. I right clicked on drawable and clicked “Show in Explorer” to open the folder. I copied and pasted the snapshots of the card that were saved as “PNG” into the drawable folder. You can then drag an “ImageView” attribute or manually type it in XML to display on the android phone screen when you open and import the PNG of the card.

The ID name of the “ImageView” is “@+id/image_front”. The source of this view is called “@drawable/front_card”. The ID and source referenced in the Java code. The XML also has a “button” attribute which you can drag to the phone screen or type in the process of making a button. This “button” attribute is used to setup the card flipping animation after being clicked. The ID name of the “button” attribute is called “@+id/flip_click”. I gave this attribute a text name and called it Flip Card. The name can be found in the strings.xml since I extracted the hardcoded text.
	
In the “mainActivity.Java” file, I declared 3 variables of an object as private. I named the variables “flip”, “im”, and “rand”. The variable “flip” is setup to find a view by id of the button object, which I named “flip_click”. The variable “im” for the ImageView object is set to find the view by ID called “image_front”. This is to get the front part of the credit card to function.
	
The “flip” variable uses a setOnclickListner() object for the button. Inside the onclick method, I call my own flipping method that I have created in the code named “flipCard ()”. I had setup the “flipCard()” method to be private, and used a built in object called Random. I named of the object variable “rand” and initialized variable “a” to the “rand” variable, getting the next integer at the number of 2. I used an “if ” statement to set the variable “a” to 1, and an “else if” statement to set variable “a” to 0. Inside the if else statement I used the variable “im” to set the image resource of getting the front and back of the card to display. The mechanism will allow the card to flip when the button is clicked whether it goes to integer 1 or 0, and will also display a toast message displaying which side of the card shows on the screen.

Java  also has predefined public methods you can use to make a Flip View animation such as “getFlipInterval()” to get delay before flipping to next view, “setFlipInterval()” to see how long to wait before flipping to next view,“startFLipping() to cycle through child views”, “stopFlipping() “to terminate the flips and more.

The code

The code has comments that explain what each line of code does in both the mainActivity file and the XML. When you launch the app, you should be able to click the flip button a few times flipping the card back and forth during the animation.

The references

https://developer.android.com/reference/android/widget/ViewFlipper#isAutoStart()
https://tutorialwing.com/android-viewflipper-tutorial-with-example/
https://www.ssaurel.com/blog/learn-to-create-a-flip-coin-application-on-android/
http://nbasercode.com/android/android-how-to-develop-simple-coin-flip-application/




