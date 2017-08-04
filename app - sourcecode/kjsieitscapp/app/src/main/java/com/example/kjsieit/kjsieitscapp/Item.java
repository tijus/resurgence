package com.example.kjsieit.kjsieitscapp;
public class Item {
    private String title, thumbnailUrl, desc;


    public Item() {
    }

    public Item(String name, String thumbnailUrl, String desc) {
        this.title = name;
        this.thumbnailUrl = thumbnailUrl;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
