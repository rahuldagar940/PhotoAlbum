package com.example.PhotoAlbum.resource;

import com.example.PhotoAlbum.model.Photo;
import com.example.PhotoAlbum.model.User;
import com.example.PhotoAlbum.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PhotoResource
{
    @Autowired
    private PhotoService photoService;
    @GetMapping("/photo")
    private Photo getPhoto()
    {
        return photoService.getPhoto();
    }
    @PostMapping("/photo")
    public Photo savePhoto(@RequestBody Photo photo)
    {
        return photoService.savePhoto(photo);
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
    }
}
