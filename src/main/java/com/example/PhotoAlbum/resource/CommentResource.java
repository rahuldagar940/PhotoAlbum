package com.example.PhotoAlbum.resource;

import com.example.PhotoAlbum.model.Comment;
import com.example.PhotoAlbum.model.User;
import com.example.PhotoAlbum.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentResource {
    @Autowired
    private CommentService commentService;
    @PostMapping
    private Comment saveComment(@RequestBody Comment comment)
    {
        return commentService.saveComment(comment);

    }
    @GetMapping
    public List<Comment> getallComments()
    {
        return commentService.getallComments();
    }

    @PutMapping
    public Comment updateComment(@RequestBody Comment comment)
    {
        return commentService.updateComment(comment);
    }

    @DeleteMapping
    public void deleteComment(@RequestParam(name = "commentID") String commentID)
    {
        commentService.deleteComment(commentID);
    }

    @GetMapping
    public List<Comment> getByMessage(@RequestParam(name = "message") String message)
    {
        return commentService.getByMessage(message);
    }


    /*
    @GetMapping("/comment")
    private Comment getComment()
    {
        return commentService.getComment();
    }



    @GetMapping("/allcomments")
    public List<Comment> getallComments()
    {
        return commentService.getallComments();
    }

    @GetMapping("/comment/{commentID}")
    public Comment getCommentbyID(@PathVariable("commentID") int commentID, @RequestBody Comment comment)
    {
        return commentService.getCommentbyID(commentID);
    }

    @PutMapping("/comment/{commentID}")
    public Comment updateComment(@PathVariable("commentID") int commentID,@RequestBody Comment comment)
    {
        return commentService.updateComment(commentID, comment);
    }
    @DeleteMapping("/comment")
    public Comment deleteComment(@RequestParam(name = "commentID") int commentID)
    {
        return commentService.deleteComment(commentID);
    }
*/
}
