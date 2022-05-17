package com.example.PhotoAlbum.resource;

import com.example.PhotoAlbum.model.Photo;
import com.example.PhotoAlbum.model.User;
import com.example.PhotoAlbum.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/photos")
public class PhotoResource
{
    @Autowired
    private PhotoService photoService;
    @PostMapping
    public Photo savePhoto(@RequestBody Photo photo)
    {
        return photoService.savePhoto(photo);
    }

    @GetMapping
    public List<Photo> getallPhotos()
    {
        return photoService.getallPhotos();
    }
    @PutMapping("/photo/{photoID}")
    public Photo updatePhoto(@RequestBody Photo photo)
    {
        return photoService.updatePhoto(photo);
    }

    @DeleteMapping
    public void deletePhoto(@RequestParam(name = "PhotoID") String photoID)
    {
        photoService.deletePhoto(photoID);
    }

    /*
    @GetMapping("/photo")
    private Photo getPhoto()
    {
        return photoService.getPhoto();
    }
    @GetMapping("/allphotos")
    public List<Photo> getallPhotos()
    {
        return photoService.getallPhotos();
    }

    @GetMapping("/photo/{photoID}")
    public Photo getPhotobyID(@PathVariable("photoID") int photoID, @RequestBody Photo photo)
    {
        return photoService.getPhotobyID(photoID);
    }
    @PutMapping("/photo/{photoID}")
    public Photo updatePhoto(@PathVariable("photoID") int photoID,@RequestBody Photo photo)
    {
        return photoService.updatePhoto(photoID, photo);
    }

    @DeleteMapping("/photo")
    public Photo deletePhoto(@RequestParam(name = "PhotoID") int photoID)
    {
        return photoService.deletePhoto(photoID);
    }*/
}
