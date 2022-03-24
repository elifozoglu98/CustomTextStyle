package com.example.customtextstyle;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

import androidx.core.content.res.ResourcesCompat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomTextStyle {
    public static void customFontStyler(Context context, TextView sentence, String  searchWord, Typeface face){
        SpannableString s = new SpannableString(sentence.getText().toString());

        Pattern p = Pattern.compile(searchWord);
        Matcher m = p.matcher(s);
        while (m.find()) {
            int start = m.start();
            int end = m.end();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                s.setSpan(new TypefaceSpan(face),start,end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }

        sentence.setText(s);

    }
    public static void defaultFontStyler(Context context, TextView sentence, String  searchWord, int face){
        SpannableString s = new SpannableString(sentence.getText().toString());

        Pattern p = Pattern.compile(searchWord);
        Matcher m = p.matcher(s);
        while (m.find()) {
            int start = m.start();
            int end = m.end();

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                s.setSpan(new StyleSpan(face),start,end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }

        sentence.setText(s);

    }
    public static void underlineStyler(Context context, TextView sentence, String  searchWord){
        SpannableString s = new SpannableString(sentence.getText().toString());

        Pattern p = Pattern.compile(searchWord);
        Matcher m = p.matcher(s);
        while (m.find()) {
            int start = m.start();
            int end = m.end();

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                s.setSpan(new UnderlineSpan(),start,end, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

            }

        }
        sentence.setText(s);
    }

    public static void gradientStyler(TextView text, String textGradient, String gradientStart, String gradientEnd){
        TextPaint paint= text.getPaint();
        String textString= text.getText().toString();
        float width= paint.measureText(textString);
        Shader shader=new LinearGradient(0,0, width,text.getTextSize(),
                new int[] {
                        Color.parseColor(gradientStart),
                        Color.parseColor(gradientEnd),


                }, null ,Shader.TileMode.CLAMP);
        text.getPaint().setShader(shader);
    }
}
