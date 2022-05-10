package com.example.PhotoAlbum.model;

public class Comment
{
    private int photoID;
    private int commentID;
    private String message;
    private String createdBy;
    private String dateCreated;

    public Comment(String message, String createdBy, String dateCreated) {
        this.message = message;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
