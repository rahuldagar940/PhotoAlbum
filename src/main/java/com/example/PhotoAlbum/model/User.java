package com.example.PhotoAlbum.model;

public class User
{
    private int userID;
    private String name;
    private String email;
    private String profilePhotoURL;

    public User(String name, String email, String profilePhotoURL) {
        this.name = name;
        this.email = email;
        this.profilePhotoURL = profilePhotoURL;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePhotoURL() {
        return profilePhotoURL;
    }

    public void setProfilePhotoURL(String profilePhotoURL) {
        this.profilePhotoURL = profilePhotoURL;
    }
}
