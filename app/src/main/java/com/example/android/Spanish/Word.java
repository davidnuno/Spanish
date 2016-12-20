package com.example.android.Spanish;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Spanish translation for the word */
    private String mSpanishTranslation;

    /** Image Resource ID */
    private int mImageResourceID;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param spanishTranslation is the word in the Spanish language
     */
    public Word(String defaultTranslation, String spanishTranslation) {
        mDefaultTranslation = defaultTranslation;
        mSpanishTranslation = spanishTranslation;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param spanishTranslation is the word in the Spanish language
     */
    public Word(String defaultTranslation, String spanishTranslation, int imageResourceID) {
        mDefaultTranslation = defaultTranslation;
        mSpanishTranslation = spanishTranslation;
        mImageResourceID    = imageResourceID;
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
     * Get the image resource ID of the word.
     */
    public int getmImageResourceID() {

        return mImageResourceID;
    }

}

