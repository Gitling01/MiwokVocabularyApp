package com.example.android.miwok;
import android.content.Context;

public class Word {

    private String mMiwokTranslation;
    private String mEnglishTranslation;

   //constructor (creating a word object with these two translations)
    public Word(String miwokTranslation, String defaultTranslation){
        mMiwokTranslation = miwokTranslation;
        mEnglishTranslation = defaultTranslation;
    }

    //retrieving the translations
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public String getDefaultTranslation(){
        return mEnglishTranslation;
    }

}
