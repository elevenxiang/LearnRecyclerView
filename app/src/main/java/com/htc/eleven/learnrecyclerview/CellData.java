package com.htc.eleven.learnrecyclerview;

/**
 * Created by eleven on 17-8-14.
 */

public class CellData {

    private String mTitle ="default_title";
    private String mContent = "default_content";

    public CellData(String title, String contet){
        this.mTitle = title;
        this.mContent = contet;
    }
    public String getmContent() {
        return mContent;
    }

    public String getmTitle() {
        return mTitle;
    }
}
