package com.example.hamed.login;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        final FormInfo forminfo = new FormInfo(this,R.id.linear_sign);
        forminfo.getBtnlogin().setScaleX(50);
        forminfo.getBtnlogin().setScaleY(50);
        forminfo.getBtnlogin().setRotation(0);
        forminfo.getInputName().setAlpha(0);
        forminfo.getInputpass().setAlpha(0);
        forminfo.getInputpass1().setAlpha(0);

        forminfo.getBtnlogin().animate().rotationBy(3600).scaleX(1).scaleY(1).setDuration(4000);

        forminfo.getInputName().animate().alpha(1).setDuration(2000);
        forminfo.getInputpass().animate().alpha(1).setDuration(2000);
        forminfo.getInputpass1().animate().alpha(1).setDuration(2000);

        forminfo.getInputName().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String name = forminfo.getInputName().getText().toString().trim();
                if(name.length() <3)
                {
                    forminfo.getInputName().setTextColor(Color.rgb(255,0,0));

                }
                if(name.length()>=3)
                {
                    forminfo.getInputName().setTextColor(Color.rgb(0,255,0));
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        forminfo.getInputpass().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String pass =forminfo.getInputpass().getText().toString().trim();

                if(pass.length()<4)
                {
                    forminfo.getInputpass().setTextColor(Color.rgb(255,0,0));
                }
                if(pass.length()>=4)
                {
                    forminfo.getInputpass().setTextColor(Color.rgb(0,255,0));
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        forminfo.getInputpass1().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String pass1 = forminfo.getInputpass1().getText().toString().trim();
                String pass = forminfo.getInputpass().getText().toString().trim();

                if(!pass.equals(pass1))
                {
                    forminfo.getInputpass1().setTextColor(Color.rgb(255,0,0));
                }

                if(pass.equals(pass1))
                {
                    forminfo.getInputpass1().setTextColor(Color.rgb(0,255,0));
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}
