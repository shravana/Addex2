package com.newme.addex;

import android.content.Intent;
import android.os.Bundle;


public class Splash extends MainActivity{

    @Override
    protected void onCreate(Bundle Smokers) {
        super.onCreate(Smokers);
        setContentView(R.layout.splash);

        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
            }finally {
                    Intent openMainactivity = new Intent("android.intent.action.MAIN");
                     startActivity(openMainactivity);
                }
                }

        };
        timer.start();

    }

    @Override
    protected void onPause() {
        super.onPause();

        finish();
    }
}
