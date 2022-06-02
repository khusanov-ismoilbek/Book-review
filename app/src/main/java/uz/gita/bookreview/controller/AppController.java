package uz.gita.bookreview.controller;

import java.util.ArrayList;
import java.util.List;

import uz.gita.bookreview.R;
import uz.gita.bookreview.model.ModelData;

public class AppController {
    private static AppController appController;
    private List<ModelData> data = new ArrayList<>();
    private AppController(){
        loadData();
    }

    public static AppController getInstance(){
        if (appController == null){
            appController = new AppController();
        }
        return appController;
    }

    private void loadData(){
        data.add(new ModelData(R.drawable.image1_1, R.drawable.image1_2, R.drawable.image1_3, R.drawable.image1_4, R.drawable.image1_5, R.string.name1, R.string.text1_1, R.string.text1_2, R.string.text1_3, R.string.text1_4, R.string.text1_5, R.string.text1_6, R.string.text1_7, R.string.text1_8, R.string.xulosa1, R.string.kadr1, R.string.fact1, R.string.quote1, R.raw.otgan_kunlar));
        data.add(new ModelData(R.drawable.image2_1, R.drawable.image2_2, R.drawable.image2_3, R.drawable.image2_4, R.drawable.image2_5, R.string.name2, R.string.text2_1, R.string.text2_2, R.string.text2_3, R.string.text2_4, R.string.text2_5, R.string.text2_6, R.string.text2_7, R.string.text2_8, R.string.xulosa2, R.string.kadr2, R.string.fact2, R.string.quote2, R.raw.gonewiththewind_music));
        data.add(new ModelData(R.drawable.image3_1, R.drawable.image3_2, R.drawable.image3_3, R.drawable.image3_4, R.drawable.image3_5, R.string.name3, R.string.text3_1, R.string.text3_2, R.string.text3_3, R.string.text3_4, R.string.text3_5, R.string.text3_6, R.string.text3_7, R.string.text3_8, R.string.xulosa3, R.string.kadr3, R.string.fact3, R.string.quote3, R.raw.godfather_music));
        data.add(new ModelData(R.drawable.image4_1, R.drawable.image4_2, R.drawable.image4_3, R.drawable.image4_4, R.drawable.image4_5, R.string.name4, R.string.text4_1, R.string.text4_2, R.string.text4_3, R.string.text4_4, R.string.text4_5, R.string.text4_6, R.string.text4_7, R.string.text4_8, R.string.xulosa4, R.string.kadr4, R.string.fact4, R.string.quote4, R.raw.gatsby_music));
        data.add(new ModelData(R.drawable.image5_1, R.drawable.image5_2, R.drawable.image5_3, R.drawable.image5_4, R.drawable.image5_5, R.string.name5, R.string.text5_1, R.string.text5_2, R.string.text5_3, R.string.text5_4, R.string.text5_5, R.string.text5_6, R.string.text5_7, R.string.text5_8, R.string.xulosa5, R.string.kadr5, R.string.fact5, R.string.quote5, R.raw.chaliqushi_music));
        data.add(new ModelData(R.drawable.image6_1, R.drawable.image6_2, R.drawable.image6_3, R.drawable.image6_4, R.drawable.image6_5, R.string.name6, R.string.text6_1, R.string.text6_2, R.string.text6_3, R.string.text6_4, R.string.text6_5, R.string.text6_6, R.string.text6_7, R.string.text6_8, R.string.xulosa6, R.string.kadr6, R.string.fact6, R.string.quote6, R.raw.robinson_music));
        data.add(new ModelData(R.drawable.image7_1, R.drawable.image7_2, R.drawable.image7_3, R.drawable.image7_4, R.drawable.image7_5, R.string.name7, R.string.text7_1, R.string.text7_2, R.string.text7_3, R.string.text7_4, R.string.text7_5, R.string.text7_6, R.string.text7_7, R.string.text7_8, R.string.xulosa7, R.string.kadr7, R.string.fact7, R.string.quote7, R.raw.ustvamargarita_sound));
        data.add(new ModelData(R.drawable.image8_1, R.drawable.image8_2, R.drawable.image8_3, R.drawable.image8_4, R.drawable.image8_5, R.string.name8, R.string.text8_1, R.string.text8_2, R.string.text8_3, R.string.text8_4, R.string.text8_5, R.string.text8_6, R.string.text8_7, R.string.text8_8, R.string.xulosa8, R.string.kadr8, R.string.fact8, R.string.quote8, R.raw.yolyoypijama_music));
        data.add(new ModelData(R.drawable.image9_1, R.drawable.image9_2, R.drawable.image9_3, R.drawable.image9_4, R.drawable.image9_5, R.string.name9, R.string.text9_1, R.string.text9_2, R.string.text9_3, R.string.text9_4, R.string.text9_5, R.string.text9_6, R.string.text9_7, R.string.text9_8, R.string.xulosa9, R.string.kadr9, R.string.fact9, R.string.quote9, R.raw.donkixot_music));
        data.add(new ModelData(R.drawable.image10_1, R.drawable.image10_2, R.drawable.image10_3, R.drawable.image10_4, R.drawable.image10_5, R.string.name10, R.string.text10_1, R.string.text10_2, R.string.text10_3, R.string.text10_4, R.string.text10_5, R.string.text10_6, R.string.text10_7, R.string.text10_8, R.string.xulosa10, R.string.kadr10, R.string.fact10, R.string.quote10, R.raw.kitobogrisi_music));
        data.add(new ModelData(R.drawable.image11_1, R.drawable.image11_2, R.drawable.image11_3, R.drawable.image11_4, R.drawable.image11_5, R.string.name11, R.string.text11_1, R.string.text11_2, R.string.text11_3, R.string.text11_4, R.string.text11_5, R.string.text11_6, R.string.text11_7, R.string.text11_8, R.string.xulosa11, R.string.kadr11, R.string.fact11, R.string.quote11, R.raw.andisha_music));
        data.add(new ModelData(R.drawable.image12_1, R.drawable.image12_2, R.drawable.image12_3, R.drawable.image12_4, R.drawable.image12_5, R.string.name12, R.string.text12_1, R.string.text12_2, R.string.text12_3, R.string.text12_4, R.string.text12_5, R.string.text12_6, R.string.text12_7, R.string.text12_8, R.string.xulosa12, R.string.kadr12, R.string.fact12, R.string.quote12, R.raw.andisha_music));
        data.add(new ModelData(R.drawable.image13_1, R.drawable.image13_2, R.drawable.image13_3, R.drawable.image13_4, R.drawable.image13_5, R.string.name13, R.string.text13_1, R.string.text13_2, R.string.text13_3, R.string.text13_4, R.string.text13_5, R.string.text13_6, R.string.text13_7, R.string.text13_8, R.string.xulosa13, R.string.kadr13, R.string.fact13, R.string.quote13, R.raw.shaxmat_music));
    }

    public ModelData getDataByPosition(int position){
        return data.get(position);
    }
}
