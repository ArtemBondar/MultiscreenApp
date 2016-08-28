package com.example.android.miwok;

public class Word {

    private String miwokTranslation;
    private String defaultTranslation;
    private int imageResourceID = NO_IMAGE_PROVIDED;
    private final static int NO_IMAGE_PROVIDED = -1;
    private int audioResourceID;

    public Word(String miwokTranslation, String defaultTranslation, int audioResourceID) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.audioResourceID = audioResourceID;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResourceID, int audioResourceID) {

        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageResourceID = imageResourceID;
        this.audioResourceID = audioResourceID;
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

    public int getAudioResourceID() {
        return audioResourceID;
    }

    public boolean hasImage() {
        return imageResourceID != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "miwokTranslation='" + miwokTranslation + '\'' +
                ", defaultTranslation='" + defaultTranslation + '\'' +
                ", imageResourceID=" + imageResourceID +
                ", audioResourceID=" + audioResourceID +
                '}';
    }
}
