package com.example.PhotoAlbum.repository;

import com.example.PhotoAlbum.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommentRepository extends MongoRepository<Comment, String> {
    List<Comment> findAllByMessage(String message);
}
