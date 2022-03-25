package com.example.customstyle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import com.example.customtextstyle.CustomTextStyle;

public class MainActivity extends AppCompatActivity {
    TextView textCustomFont,textGradient,textDeafultFont,underlineText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textDeafultFont=findViewById(R.id.defaultFontText);
        textCustomFont=findViewById(R.id.customFontText);
        textGradient=findViewById(R.id.gradientText);
        underlineText=findViewById(R.id.underlineText);
        String searchWord="World!";

        Typeface typeface = ResourcesCompat.getFont(MainActivity.this, R.font.poppins_bolditalic); //put the desired font in here
        int face= Typeface.BOLD; //this could be Typeface.ITALIC or BOLD_ITALIC etc.


        CustomTextStyle.underlineStyler(MainActivity.this,underlineText,searchWord);
        CustomTextStyle.customFontStyler(MainActivity.this,textCustomFont,searchWord,typeface);
        CustomTextStyle.defaultFontStyler(MainActivity.this,textDeafultFont,searchWord,face);
        CustomTextStyle.gradientStyler(textGradient,searchWord,"#0000FF","#fc969b");
    }

}