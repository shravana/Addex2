package com.newme.addex;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    EditText editText,editText2;
    TextView textView;
    Button add , sub ;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = 0;
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
       textView = (TextView) findViewById(R.id.textView);
        add = (Button) findViewById(R.id.button);
        sub = (Button) findViewById(R.id.button2);
        add.setOnClickListener(new View.OnClickListener() {
            public void onClick
               (View view){
                onClikadd();
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            public void onClick
                    (View view){
                onCliksub();
            }
        });

    }

    public void onClikadd()
    {
            counter++;
            textView.setText("Your Total is " + counter);
    }
    public void onCliksub()
    {
      counter--;
        textView.setText("Your Total is " + counter);

    }




}
