package com.example.android.Spanish;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation, a Spanish translation, and an image for that word.
 */
public class Word {

    /**
     * Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /** Default translation for the word */
    private String mDefaultTranslation;

    /**
     * Spanish translation for the word
     */
    private String mSpanishTranslation;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Audio resource ID for the playback
     */
    private int mAudioResourceID;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param spanishTranslation is the word in the Spanish language
     */
    public Word(String defaultTranslation, String spanishTranslation, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mSpanishTranslation = spanishTranslation;
        mAudioResourceID = audioResourceID;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param spanishTranslation is the word in the Spanish language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     *
     */
    public Word(String defaultTranslation, String spanishTranslation, int imageResourceId, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mSpanishTranslation = spanishTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceID = audioResourceID;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {

        return mDefaultTranslation;
    }

    /**
     * Get the Spanish translation of the word.
     */
    public String getSpanishTranslation() {

        return mSpanishTranslation;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {

        return mImageResourceId;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceID() {
        return mAudioResourceID;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {

        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
