package com.example.miwok;

public class Word {
    private final String engWord, miwokWord;
    private final int imageResourceId, audioResourceId;

    public Word(String eng, String miwok, int audioId) {
        engWord = eng;
        miwokWord = miwok;
        imageResourceId = -1;
        audioResourceId = audioId;
    }
    public Word(String eng, String miwok, int imageId, int audioId){
        engWord = eng;
        miwokWord = miwok;
        imageResourceId = imageId;
        audioResourceId = audioId;
    }
    public String getEngWord() {
        return engWord;
    }
    public String getMiwokWord() {
        return miwokWord;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }
    public int getAudioResourceId(){
        return audioResourceId;
    }
}

