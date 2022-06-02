package uz.gita.bookreview;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import uz.gita.bookreview.controller.AppController;
import uz.gita.bookreview.local.MySharedPref;
import uz.gita.bookreview.model.ModelData;

public class InfoActivity extends AppCompatActivity {
    AppController appController = AppController.getInstance();
    MySharedPref mySharedPref;
    MediaPlayer mediaPlayer;
    ModelData modelData;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        mySharedPref = MySharedPref.getInstance(this);

        int code = getIntent().getIntExtra("CODE", 0);
        ModelData data = appController.getDataByPosition(code);
        loadData(data);

        findViewById(R.id.back_btn).setOnClickListener(view ->{
            if (mySharedPref.getSound()){
                mediaPlayer.stop();
            }
            finish();
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (mySharedPref.getSound()){
            mediaPlayer = MediaPlayer.create(this, modelData.getMusic());
            mediaPlayer.start();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mySharedPref.getSound()){
            mediaPlayer.stop();
        }
    }

    private void loadData(ModelData data){
        modelData = data;

        TextView textContent = findViewById(R.id.text_content);
        textContent.setText(data.getName());

        TextView text1 = findViewById(R.id.text1);
        text1.setText(data.getText1());

        TextView text2 = findViewById(R.id.text2);
        text2.setText(data.getText2());

        TextView text3 = findViewById(R.id.text3);
        text3.setText(data.getText3());

        TextView text4 = findViewById(R.id.text4);
        text4.setText(data.getText4());

        TextView text5 = findViewById(R.id.text5);
        text5.setText(data.getText5());

        TextView text6 = findViewById(R.id.text6);
        text6.setText(data.getText6());

        TextView text7 = findViewById(R.id.text7);
        text7.setText(data.getText7());

        TextView text8 = findViewById(R.id.text8);
        text8.setText(data.getText8());

        TextView xulosa = findViewById(R.id.xulosa);
        xulosa.setText(data.getXulosa());

        ImageView image1 = findViewById(R.id.image1);
        image1.setImageResource(data.getImage1());

        ImageView image2 = findViewById(R.id.image2);
        image2.setImageResource(data.getImage2());

        ImageView image3 = findViewById(R.id.image3);
        image3.setImageResource(data.getImage3());

        ImageView image4 = findViewById(R.id.image4);
        image4.setImageResource(data.getImage4());

        ImageView image5 = findViewById(R.id.image5);
        image5.setImageResource(data.getImage5());

        TextView kadr2 = findViewById(R.id.kadr2);
        kadr2.setText(data.getKadr());
        TextView kadr3 = findViewById(R.id.kadr3);
        kadr3.setText(data.getKadr());
        TextView kadr4 = findViewById(R.id.kadr4);
        kadr4.setText(data.getKadr());
        TextView kadr5 = findViewById(R.id.kadr5);
        kadr5.setText(data.getKadr());

        TextView fact1 = findViewById(R.id.fact);
        fact1.setText(data.getFact());

        TextView quote1 = findViewById(R.id.quote);
        quote1.setText(data.getQuote());
    }
}
