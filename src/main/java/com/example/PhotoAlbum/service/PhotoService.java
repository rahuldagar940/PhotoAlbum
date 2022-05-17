package com.example.PhotoAlbum.service;

import com.example.PhotoAlbum.model.Photo;
import com.example.PhotoAlbum.model.User;
import com.example.PhotoAlbum.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {
    @Autowired
    private PhotoRepository photoRepository;
    public Photo savePhoto(Photo photo)
    {
        return photoRepository.save(photo);
    }
    public List<Photo> getallPhotos() {
        return photoRepository.findAll();
    }

    public Photo updatePhoto(Photo photo)
    {
        return photoRepository.save(photo);
    }

    public void deletePhoto(String photoID)
    {
        photoRepository.deleteById(photoID);
    }
    /*
    public Photo getPhoto()
    {
        return photoRepository.getPhoto();
    }



    public List<Photo> getallPhotos() {
        return photoRepository.getallPhotos();
    }

    public Photo getPhotobyID(int photoID) {
        return photoRepository.getPhotobyID(photoID);
    }

    public Photo updatePhoto(int photoID, Photo photo)
    {
        return photoRepository.updatePhoto(photoID, photo);
    }

    public Photo deletePhoto(int photoID)
    {
        return photoRepository.deletePhoto(photoID);
    }*/
}
