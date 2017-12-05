package com.example.salah.math;

import android.util.Log;

public class Util {

    public static String logTag = "FunTimes";
    public static boolean debugging = true;

    public static void Log(String s){
        if(debugging){
            Log.i(logTag, s);
        }

    }
}
