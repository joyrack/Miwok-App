package com.example.miwok;

public class Word {
    private final String engWord, miwokWord;
    private final int imageResourceId;

    public Word(String eng, String miwok) {
        engWord = eng;
        miwokWord = miwok;
        imageResourceId = -1;
    }
    public Word(String eng, String miwok, int imageId){
        engWord = eng;
        miwokWord = miwok;
        imageResourceId = imageId;
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
}
