package com.example.mylib;

import android.content.Context;
import android.widget.Toast;

public class Demo {
    public static void simpleDemo(Context context,String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
