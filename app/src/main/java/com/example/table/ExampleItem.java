package com.example.table;

public class ExampleItem {

    private String mCreator;
    private String mLikes;
    private String msys_id;

    public ExampleItem(String creator, String likes ,String sys_id) {

        mCreator = creator;
        mLikes = likes;
        msys_id = sys_id;
    }

    public String getCreator() {
        return mCreator;
    }

    public String getLikeCount() {
        return mLikes;
    }

    public String getSysid(){
        return msys_id;
    }
}