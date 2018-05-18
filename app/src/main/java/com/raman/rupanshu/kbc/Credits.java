package com.raman.rupanshu.kbc;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Credits extends Activity {

    TextView tv_credits, tv_credits_details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Next three lines for Full Screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
        tv_credits = (TextView) findViewById(R.id.tv_credits);
        tv_credits_details = (TextView) findViewById(R.id.tv_credits_details);
        String display_credits = "App version-v1.0<br> <b><center>Contact</center></b><br> Name-Rupanshu Raman <br>[FB][https://www.facebook.com/rupanshu.raman] <br>[LinkedIn][https://www.linkedin.com/in/rupanshu-raman-4327a6125]" +
                "<br>" +
                "Email-rupanshuraman@hotmail.com" +
                "<br>" +
                "Address-BH 1, Lovely Professional University, Phagwara, Punjab, India <br><br>" +
                "<b><center> Credits</center></b>" +
                "<br>" +
                "A big thanks to- <br>" +
                "\u2022 My mother and specially my father to give me a brand new and fast laptop to run Android™ Studio." +
                "<br>" +
                "\u2022 Siddhartha Myneni for taking out free time and testing my apps many times.Thanks.:)\n" +
                "<br>" +
                "\u2022 Jaswinder Singh for testing the app\n" +
                "<br>" +
                "\u2022 Biswajit Rout for testing the app\n" +
                "<br>" +
                "\u2022 Ekagra Singh for testing the app\n" +
                "<br>" +
                "\u2022 and many websites in below link";

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N)
            tv_credits_details.setText(Html.fromHtml(display_credits, Html.FROM_HTML_MODE_LEGACY));
        else tv_credits_details.setText(Html.fromHtml(display_credits));
        Animation A = AnimationUtils.loadAnimation(this, R.anim.anim_accelerate_x_overshoot);
        tv_credits.startAnimation(A);

        A = AnimationUtils.loadAnimation(this, R.anim.anim_accelerate_x_overshoot);
        A.setStartOffset(1000);
        tv_credits_details.startAnimation(A);
    }
}
