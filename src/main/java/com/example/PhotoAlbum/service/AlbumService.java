package com.example.PhotoAlbum.service;

import com.example.PhotoAlbum.model.Album;
import com.example.PhotoAlbum.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {
    @Autowired
    private AlbumRepository albumRepository;
    public Album saveAlbum(Album album)
    {
        return albumRepository.save(album);
    }

    public List<Album> getallAlbum() {
        return albumRepository.findAll();
    }

    public Album updateAlbum(Album album)
    {
        return albumRepository.save(album);
    }

    public void deleteAlbum(String albumID)
    {
        albumRepository.deleteById(albumID);
    }

/*
    public Album getAlbum()
    {

        return albumRepository.getAlbum();
    }


    public List<Album> getallAlbum() {
        return albumRepository.getallAlbum();
    }

    public Album getAlbumbyID(int albumID)
    {
        return albumRepository.getAlbumbyID(albumID);
    }

    public Album updateAlbum(int albumID, Album album)
    {
        return albumRepository.updateAlbum(albumID, album);
    }

    public Album deleteAlbum(int albumID)
    {
        return albumRepository.deleteAlbum(albumID);
    }
*/
}
