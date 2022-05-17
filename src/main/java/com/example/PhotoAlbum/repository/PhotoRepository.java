package com.example.PhotoAlbum.repository;

import com.example.PhotoAlbum.model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo, String> {
}
