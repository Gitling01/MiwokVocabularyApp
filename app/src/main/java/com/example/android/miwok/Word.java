package com.example.android.miwok;

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private String mMiwokTranslation;
    private String mEnglishTranslation;
    private int mImageResourceId;
    private int mSoundResourceId;

    //constructor (creating a word object with these two translations)
    public Word(String miwokTranslation, String defaultTranslation, int SoundResourceId) {
        mMiwokTranslation = miwokTranslation;
        mEnglishTranslation = defaultTranslation;
        mImageResourceId = NO_IMAGE_PROVIDED;
        mSoundResourceId = SoundResourceId;
    }

    public Word(String miwokTranslation, String defaultTranslation, int ImageResourceId, int SoundResourceId) {
        mMiwokTranslation = miwokTranslation;
        mEnglishTranslation = defaultTranslation;
        mImageResourceId = ImageResourceId;
        mSoundResourceId = SoundResourceId;
    }

    //retrieving the translations
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mEnglishTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getSoundResourceId() {
        return mSoundResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mEnglishTranslation='" + mEnglishTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mSoundResourceId=" + mSoundResourceId +
                '}';
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
