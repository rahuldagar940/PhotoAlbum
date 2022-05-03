package com.example.PhotoAlbum.repository;

import com.example.PhotoAlbum.model.Comment;
import com.example.PhotoAlbum.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CommentRepository {
    List<Comment> commentList = new ArrayList();
    public Comment getComment()
    {
        Comment comment = new Comment("Good", "Rahul", "June");
        return comment;
    }

    public Comment saveComment(Comment comment)
    {
        comment.setCommentID(commentList.size() + 1);
        commentList.add(comment);
        return comment;
    }

    public List<Comment> getallComments() {
        return commentList;
    }

    public Comment getCommentbyID(int commentID)
    {
        for (Comment comment : commentList)
        {
            if(comment.getCommentID() == commentID)
            {
                return comment;
            }
        }
        return null;
    }

    public Comment updateComment(int commentID, Comment comment)
    {
        for (Comment c:commentList)
        {
            if(c.getCommentID() == commentID)
            {
                c.setMessage(comment.getMessage());
                c.setCreatedBy(comment.getCreatedBy());
                c.setDateCreated(comment.getDateCreated());
                return c;
            }
        }
        return null;
    }

    public Comment deletedComment(int commentID)
    {
        Comment deletedComment = null;
        for(Comment c:commentList)
        {
            if(c.getCommentID() == commentID)
            {
                deletedComment = c;
                commentList.remove(c);
            }
        }
        return deletedComment;

    }
}
