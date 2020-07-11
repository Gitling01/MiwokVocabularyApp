package com.example.android.miwok;

public class Word {

    private String mMiwokTranslation;
    private String mEnglishTranslation;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId;

   //constructor (creating a word object with these two translations)
   public Word(String miwokTranslation, String defaultTranslation) {
       mMiwokTranslation = miwokTranslation;
       mEnglishTranslation = defaultTranslation;
       mImageResourceId = NO_IMAGE_PROVIDED;
   }

    public Word(String miwokTranslation, String defaultTranslation, int ImageResourceId) {
        mMiwokTranslation = miwokTranslation;
        mEnglishTranslation = defaultTranslation;
        mImageResourceId = ImageResourceId;
    }

    //retrieving the translations
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public String getDefaultTranslation(){
        return mEnglishTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }


    /**
     * Returns whether or not there is an image for this word
     *
     * @return
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
