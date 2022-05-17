package com.example.PhotoAlbum.repository;

import com.example.PhotoAlbum.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
   List<User> findAllByAddress(String address);
}
