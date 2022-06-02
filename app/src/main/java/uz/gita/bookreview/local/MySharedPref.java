package uz.gita.bookreview.local;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.core.content.ContextCompat;

public class MySharedPref {
    private static MySharedPref mySharedPref;
    private SharedPreferences sharedPreferences;
    private Context context;

    private MySharedPref(Context context){
        this.context = context;
        sharedPreferences = context.getSharedPreferences("sharedPrefForVolume", Context.MODE_PRIVATE);
    }

    public static MySharedPref getInstance(Context context){
        if (mySharedPref == null){
            mySharedPref = new MySharedPref(context);
        }
        return mySharedPref;
    }

    public boolean getSound(){
        return sharedPreferences.getBoolean("SOUND", true);
    }
    public void saveSound(boolean bool){
        sharedPreferences.edit().putBoolean("SOUND", bool).apply();
    }
}
