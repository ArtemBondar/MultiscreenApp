package com.example.android.miwok;

/**
 * {@link Word}represents a vocabulary word that the user wants to learn.
 * It contains a default translation,a Miwok translation,and an image for that word.
 */
public class Word {
    /**
     * Miwok translation for the word
     */
    private String miwokTranslation;
    /**
     * Default translation for the word
     */
    private String defaultTranslation;
    /**
     * Image resource ID for the word
     */
    private int imageResourceID = NO_IMAGE_PROVIDED;
    /**
     * Constant value that represents no image was provided for this word
     */
    private final static int NO_IMAGE_PROVIDED = -1;
    /**
     * Audio resource ID for the word
     */
    private int audioResourceID;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param audioResourceID    is the resource ID for the audio file associated with this word
     */
    public Word(String miwokTranslation, String defaultTranslation, int audioResourceID) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.audioResourceID = audioResourceID;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageResourceID    is the drawable resource ID for the image associated with the word
     * @param audioResourceID    is the resource ID for the audio file associated with this word
     */
    public Word(String miwokTranslation, String defaultTranslation, int imageResourceID, int audioResourceID) {

        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageResourceID = imageResourceID;
        this.audioResourceID = audioResourceID;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceID() {
        return imageResourceID;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceID() {
        return audioResourceID;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
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
