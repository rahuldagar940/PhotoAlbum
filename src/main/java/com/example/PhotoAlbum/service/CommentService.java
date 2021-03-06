package com.example.PhotoAlbum.service;

import com.example.PhotoAlbum.model.Comment;
import com.example.PhotoAlbum.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    public Comment saveComment(Comment comment)
    {
        return commentRepository.save(comment);
    }
    public List<Comment> getallComments() {
        return commentRepository.findAll();
    }
    public Comment updateComment(Comment comment) {
        return commentRepository.save(comment);
    }


    public void deleteComment(String commentID)
    {
        commentRepository.deleteById(commentID);
    }

    public List<Comment> getByMessage(String message)
    {
        return commentRepository.findAllByMessage(message);
    }

    /*
    public Comment getComment()
    {
        return commentRepository.getComment();
    }



    public List<Comment> getallComments() {
        return commentRepository.getallComments();
    }

    public Comment getCommentbyID(int commentID) {
        return commentRepository.getCommentbyID(commentID);
    }

    public Comment updateComment(int commentID, Comment comment) {
        return commentRepository.updateComment(commentID, comment);
    }

    public Comment deleteComment(int commentID)
    {
        return commentRepository.deletedComment(commentID);
    }
    */

}
