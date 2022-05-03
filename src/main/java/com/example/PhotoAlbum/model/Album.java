package com.example.PhotoAlbum.model;

public class Album
{
    private int albumID;
    private String name;
    private String coverPhotoURL;
    private String createBy;
    private String date;

    public Album(String name, String coverPhotoURL, String createBy, String date) {
        this.name = name;
        this.coverPhotoURL = coverPhotoURL;
        this.createBy = createBy;
        this.date = date;
    }

    public int getAlbumID() {
        return albumID;
    }

    public void setAlbumID(int albumID) {
        this.albumID = albumID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverPhotoURL() {
        return coverPhotoURL;
    }

    public void setCoverPhotoURL(String coverPhotoURL) {
        this.coverPhotoURL = coverPhotoURL;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
