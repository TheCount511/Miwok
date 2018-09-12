package com.example.android.miwok;

/**
 * Created by SON-OF-A3 on 10/8/2017.
 * {@link Word} reprsents a vocabulary word that the user wants to learn
 * it contains a DefaultTranslation and a MiwokTranslation
 */

public class Word {
    private static final int HAS_NO_IMAGE = -1;
    /**
     * default translation for the word
     **/
    private String mDefaultTranslation;
    /**
     * miwok translation for the word
     **/
    private String mMiwokTranslation;
    /**
     * image representation for the word
     **/
    private int mImageResourceId = HAS_NO_IMAGE;
    private int mAudioResourceId;

    /**
     * @param defaultTranslation this is the english translation for each word
     * @param miwokTranslation   this is used to hold the miwok translation for each word
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * @param defaultTranslation this is the english translation for each word
     * @param miwokTranslation   this is used to hold the miwok translation for each word
     * @param imageResourceId    this is used to hold the image representation for each word
     * @param audioResourceId    this is used to hold the audio pronunciation for each word in the miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }
    /**
     * get the default translation of the word
     **/
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * get the miwok translation of the word
     **/
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != HAS_NO_IMAGE;
    }

    public int getmAudioResourceId() {return mAudioResourceId;}

}


