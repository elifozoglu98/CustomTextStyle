# CustomTextStyle

This library aims to custom style the textview. Such as, genericly making a specific text (or all of the text) inside a textview bold . Applying gradient colors to textview. Or underlying a specific word (or all of the textview).
# DEMO
<img src= "https://github.com/elifozoglu98/CustomTextStyle/blob/main/app/src/main/res/drawable/demo2.png" width=50% height=50%>
# Dependency
-minSdk should be at least 23

# Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  # Step 2. Add the dependency
```
	dependencies {
	        implementation 'com.github.elifozoglu98:CustomTextStyle:1.0.0'
	}
  ```
  
  # Usage & Steps
  
  There are 4 different types of custom text styler. 
  
  # Custom Font Styler
  With custom font styler you can use your own font to make your text such as bold, italic etc.
   ```
 -function itself is: CustomTextStyle.customFontStyler(Context context, TextView sentence, String  searchWord, Typeface face);
// the first parameter is the context, for fragments use getContext(), the second paramter must be a textview.
```
 # Usage
 ```
TextView textCustomFont; // let's say this is the textview you want to style.
String searchWord="World!"; // and this is the word you want to make bold/italic with your own Font.
Typeface typeface = ResourcesCompat.getFont(MainActivity.this, R.font.poppins_bolditalic); //put the desired font in here
CustomTextStyle.customFontStyler(MainActivity.this,textCustomFont,searchWord,typeface);
 
```
  # Default Font Styler
  
    With this font styler you can use your a default font to make your text such as bold, italic etc.
     
 ```
 -function itself is: CustomTextStyle.defaultFontStyler(Context context, TextView sentence, String  searchWord, int face);
// the first parameter is the context, for fragments use getContext(), the second paramter must be a textview.
//int face is for the Typeface.
```
# Usage:
```
TextView textDeafultFont;    // let's say this is the textview you want to style.
String searchWord="World!"; // and this is the word you want to make bold/italic with your own Font.
int face= Typeface.BOLD;   //put the desired style in here such as italic,bold or bolditalic.
CustomTextStyle.defaultFontStyler(MainActivity.this,textDeafultFont,searchWord,face);   
 
```

  # Text Underline Styler
 
With this styler, you can make a specific word or the whole word underlined.

 ```
-function itself is: CustomTextStyle.underlineStyler(Context context, TextView sentence, String  searchWord);
// the first parameter is the context, for fragments use getContext(), the second paramter must be a textview.
  ```
# Usage:
```
TextView underlineText;   // let's say this is the textview you want to style.
String searchWord="World!";    // and this is the word you want to make bold/italic with your own Font.
CustomTextStyle.underlineStyler(MainActivity.this,underlineText,searchWord);    
 
```

  # Gradient Styler
  
  With this styler, you can make a your textview gradient (linear).

  ```
  -function itself is: CustomTextStyle.gradientStyler(TextView text, String textGradient, String gradientStart, String gradientEnd);
  // the first parameter is the context, for fragments use getContext(), the second paramter must be the text of the textview.
  ```
  # Usage:
    ```
TextView textGradient;   // let's say this is the textview you want to style.
CustomTextStyle.gradientStyler(textGradient,textGradient.getText().toString(),"#cc6877","#fc969b");
    ```
  
  
