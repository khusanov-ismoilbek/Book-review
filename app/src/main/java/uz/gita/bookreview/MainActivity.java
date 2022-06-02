package uz.gita.bookreview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import uz.gita.bookreview.local.MySharedPref;

public class MainActivity extends AppCompatActivity {
    private static final int TIME_INTERVAL = 2000;
    private long back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MySharedPref mySharedPref = MySharedPref.getInstance(this);
        ImageView soundBtn = findViewById(R.id.sound_btn);

        if (mySharedPref.getSound()){
            soundBtn.setImageResource(R.drawable.ic_baseline_music_note);
        }else {
            soundBtn.setImageResource(R.drawable.ic_baseline_music_off);
        }

        soundBtn.setOnClickListener(view ->{
            if (mySharedPref.getSound()){
                soundBtn.setImageResource(R.drawable.ic_baseline_music_off);
                mySharedPref.saveSound(false);
            }else {
                soundBtn.setImageResource(R.drawable.ic_baseline_music_note);
                mySharedPref.saveSound(true);
            }
        });

        findViewById(R.id.about).setOnClickListener(view -> {
            View v = LayoutInflater.from(this).inflate(R.layout.activity_dialog_about, null);
            AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
                    .setCancelable(false)
                    .setView(v).create();
            v.findViewById(R.id.okBtn).setOnClickListener(view1 -> {
                alertDialog.dismiss();
            });

            alertDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            alertDialog.show();


        });

        findViewById(R.id.book1).setOnClickListener(view -> {
            openInfoActivity(0);
        });

        findViewById(R.id.book2).setOnClickListener(view -> {
            openInfoActivity(1);
        });

        findViewById(R.id.book3).setOnClickListener(view -> {
            openInfoActivity(2);
        });

        findViewById(R.id.book4).setOnClickListener(view -> {
            openInfoActivity(3);
        });
        findViewById(R.id.book5).setOnClickListener(view -> {
            openInfoActivity(4);
        });
        findViewById(R.id.book6).setOnClickListener(view -> {
            openInfoActivity(5);
        });

        findViewById(R.id.book7).setOnClickListener(view -> {
            openInfoActivity(6);
        });

        findViewById(R.id.book8).setOnClickListener(view -> {
            openInfoActivity(7);
        });

        findViewById(R.id.book9).setOnClickListener(view -> {
            openInfoActivity(8);
        });

        findViewById(R.id.book10).setOnClickListener(view -> {
            openInfoActivity(9);
        });

        findViewById(R.id.book11).setOnClickListener(view -> {
            openInfoActivity(10);
        });

        findViewById(R.id.book12).setOnClickListener(view -> {
            openInfoActivity(11);
        });

        findViewById(R.id.book13).setOnClickListener(view -> {
            openInfoActivity(12);
        });
    }

    private void openInfoActivity(int code){
        Intent intent = new Intent(MainActivity.this, InfoActivity.class);
        intent.putExtra("CODE", code);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {

        if (back + TIME_INTERVAL > System.currentTimeMillis()) {
            super.onBackPressed();
            return;
        } else {
            Toast.makeText(getBaseContext(), "Press exit again", Toast.LENGTH_SHORT).show();
        }
        back = System.currentTimeMillis();
    }
}