package com.example.PhotoAlbum.repository;

import com.example.PhotoAlbum.model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {
    List<Album> albumList = new ArrayList();
    public Album getAlbum()
    {
        Album album = new Album("Trip", "MyPC", "Rahul", "July");
        return album;
    }

    public Album saveAlbum(Album album)
    {
        album.setAlbumID(albumList.size() + 1);
        albumList.add(album);
        return album;
    }

    public List<Album> getallAlbum()
    {
        return albumList;
    }

    public Album getAlbumbyID(int albumID)
    {
        for (Album album:albumList)
        {
            if(album.getAlbumID() == albumID)
            {
                return album;
            }
        }
        return null;
    }

    public Album updateAlbum(int albumID, Album album)
    {
        for (Album a:albumList)
        {
            if(a.getAlbumID() == albumID)
            {
                a.setName(album.getName());
                a.setCoverPhotoURL(album.getCoverPhotoURL());
                a.setCreateBy(album.getCreateBy());
                a.setDate(album.getDate());
                return a;
            }
        }
        return null;
    }

    public Album deleteAlbum(int albumID)
    {
        Album deletedAlbum = null;
        for(Album a:albumList)
        {
            if(a.getAlbumID() == albumID)
            {
                deletedAlbum = a;
                albumList.remove(a);
            }
        }
        return deletedAlbum;

    }
}
