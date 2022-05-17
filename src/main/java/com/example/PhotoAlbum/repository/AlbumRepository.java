package com.example.PhotoAlbum.repository;

import com.example.PhotoAlbum.model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlbumRepository extends MongoRepository<Album, String>
{

}
