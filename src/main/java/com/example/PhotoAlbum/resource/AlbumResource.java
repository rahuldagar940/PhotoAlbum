package com.example.PhotoAlbum.resource;

import com.example.PhotoAlbum.model.Album;
import com.example.PhotoAlbum.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumResource
{
    @Autowired
    private AlbumService albumService;
    @GetMapping("/album")
    private Album getAlbum()
    {
        return albumService.getAlbum();
    }
    @PostMapping("/album")
    public Album saveAlbum(@RequestBody Album album)
    {
        return albumService.saveAlbum(album);
    }
    @GetMapping("/allalbum")
    public List<Album> getallAlbum()
    {
        return albumService.getallAlbum();
    }
    @GetMapping("/album/{albumID}")
    public Album getAlbumbyID(@PathVariable("albumID") int albumID)
    {
        return albumService.getAlbumbyID(albumID);
    }

    @PutMapping("/album/{albumID}")
    public Album updateAlbum(@PathVariable("albumID") int albumID,@RequestBody Album album )
    {
        return albumService.updatelbum(albumID, album);
    }

    @DeleteMapping("/album")
    public Album deleteAlbum(@RequestParam(name = "albumID") int albumID)
    {
        return albumService.deleteAlbum(albumID);
    }

}
