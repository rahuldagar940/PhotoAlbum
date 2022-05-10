package com.example.PhotoAlbum.repository;

import com.example.PhotoAlbum.model.Photo;
import com.example.PhotoAlbum.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PhotoRepository {
    List<Photo> photoList = new ArrayList();

    public Photo getPhoto()
    {
        Photo photo = new Photo("MyPC/E", "Rahul", "June");
        return photo;
    }

    public Photo savePhoto(Photo photo)
    {

        photo.setPhotoID(photoList.size()+1);
        photo.setAlbumID(photoList.size()+1);
        photoList.add(photo);
        return photo;
    }

    public List<Photo> getallPhotos() {
        return photoList;
    }

    public Photo getPhotobyID(int photoID)
    {
        for (Photo photo : photoList)
        {
            if(photo.getPhotoID() == photoID)
            {
                return photo;
            }
        }
        return null;
    }

    public Photo updatePhoto(int photoID, Photo photo)
    {
        for (Photo p:photoList)
        {
            if(p.getPhotoID() == photoID)
            {
                p.setPhotoURL(photo.getPhotoURL());
                p.setAlbumID(photo.getAlbumID());
                p.setCreatedBy(photo.getCreatedBy());
                p.setDateCreated(photo.getDateCreated());
                return p;
            }
        }
        return null;
    }


    public Photo deletePhoto(int photoID)
    {
        Photo deletedPhoto = null;
        for(Photo p:photoList)
        {
            if(p.getPhotoID() == photoID)
            {
                deletedPhoto = p;
                photoList.remove(p);
            }
        }
        return deletedPhoto;
    }
}
