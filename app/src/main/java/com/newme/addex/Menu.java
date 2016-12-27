package com.newme.addex;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Menu extends ListActivity{

    String classes[] = {"MainActivity" , "example1" , "example2" , "example3" , "example4"  };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classes));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String Chese = classes[position];
        try {
            Class ourClass = Class.forName("android.intent.action.MainActivity" + Chese);
            Intent ourIntent = new Intent(Menu.this, ourClass);
            startActivity(ourIntent);
            } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
