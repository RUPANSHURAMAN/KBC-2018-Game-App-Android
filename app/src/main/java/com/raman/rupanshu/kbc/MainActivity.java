package com.raman.rupanshu.kbc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {

    Animation A;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Next three lines for Full Screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //set volume key control
        //for rating count visits
        ImageView kbc = (ImageView) findViewById(R.id.kbc);
        A = AnimationUtils.loadAnimation(this, R.anim.animation_button_play);
        kbc.startAnimation(A);
        Thread timerThread = new Thread() {

            public void run() {             /* change time of sleep when changing alpha animation of kbc icon */
                try {
                    int i = 0;
                    while (i <= 1) {
                        sleep(1000);
                        i++;
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(MainActivity.this, output.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        timerThread.start();
    }
}