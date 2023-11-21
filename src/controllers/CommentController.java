package controllers;

import models.entity.Comment;
import services.CommentService;
import services.impl.CommentServiceImpl;

import java.util.List;

public class CommentController {
    CommentService commentService = new CommentServiceImpl();
    public void save(Comment comment){
        commentService.save(comment);
    }
    public void saveAll(List<Comment> comments){
        commentService.saveAll(comments);
    }
    public Comment getCommentById(Long id){
        return commentService.getCommentById(id);
    }
    public List<Comment> getAll(){
        return commentService.getAll();
    }
    public void deleteById(Long id){
        commentService.deleteById(id);
    }
}
