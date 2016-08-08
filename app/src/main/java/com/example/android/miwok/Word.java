package com.example.android.miwok;

public class Word {
    private String miwokTranslation;
    private String defaultTranslation;

    public Word(String miwokTranslation, String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }


    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }
}
