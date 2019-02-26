package com.example.hamed.login;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btnsign = findViewById(R.id.btnsign);


        btnsign.setRotation(0)                 ;
        final Handler handler = new Handler()  ;



        //-----onclick------
        btnsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                btnsign.setText("");
                btnsign.animate().rotationBy(4600).scaleX(50).scaleY(50).setDuration(1500);

                Runnable runnable = new Runnable()
                {
                    @Override
                    public void run()
                    {
                        Intent intent = new Intent(MainActivity.this, login.class);
                        finish();
                        startActivity(intent);
                    }
                };
                handler.postDelayed(runnable,300);
            }
        });


    }
}
