package com.example.PhotoAlbum.model;

import org.springframework.data.annotation.Id;

public class User
{
    @Id
    private String id;
    private String name;
    private String email;
    private String profilePhotoURL;

    public User(String name, String email, String profilePhotoURL) {
        this.name = name;
        this.email = email;
        this.profilePhotoURL = profilePhotoURL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
