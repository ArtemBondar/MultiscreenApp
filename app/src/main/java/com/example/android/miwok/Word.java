package com.example.android.miwok;

public class Word {
    private String miwokTranslation;
    private String defaultTranslation;
    private int imageResourceID = NO_IMAGE_PROVIDED;
    private final static int NO_IMAGE_PROVIDED = -1;

    public Word(String miwokTranslation, String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResourceID) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceID = imageResourceID;
    }


    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public boolean hasImage() {
        return imageResourceID != NO_IMAGE_PROVIDED;
    }

}
