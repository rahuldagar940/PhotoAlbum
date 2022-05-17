package com.example.PhotoAlbum.resource;

import com.example.PhotoAlbum.model.Album;
import com.example.PhotoAlbum.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/albums")
public class AlbumResource
{
    @Autowired
    private AlbumService albumService;
    @PostMapping
    public Album saveAlbum(@RequestBody Album album)
    {
        return albumService.saveAlbum(album);
    }

    @GetMapping
    public List<Album> getallAlbum()
    {
        return albumService.getallAlbum();
    }
    @PutMapping
    public Album updateAlbum(@RequestBody Album album )
    {
        return albumService.updateAlbum(album);
    }

    @DeleteMapping
    public void deleteAlbum(@RequestParam(name = "albumID") String albumID)
    {
        albumService.deleteAlbum(albumID);
    }

    /*@GetMapping("/album")
    private Album getAlbum()
    {
        return albumService.getAlbum();
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
    }*/
}
