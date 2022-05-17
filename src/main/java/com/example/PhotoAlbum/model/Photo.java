package com.example.PhotoAlbum.model;

import org.springframework.data.annotation.Id;

public class Photo
{
    @Id
    private String photoID;
    private int albumID;
    private String photoURL;
    private String createdBy;
    private String dateCreated;

    public Photo(String photoURL, String createdBy, String dateCreated) {
        this.photoURL = photoURL;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
    }

    public int getAlbumID() {
        return albumID;
    }

    public void setAlbumID(int albumID) {
        this.albumID = albumID;
    }

    public String getPhotoID() {
        return photoID;
    }

    public void setPhotoID(String photoID) {
        this.photoID = photoID;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
