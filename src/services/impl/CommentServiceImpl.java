package services.impl;

import models.entity.Comment;
import models.entity.Post;
import repositroies.CommentRepository;
import services.CommentService;

import java.util.List;

public class CommentServiceImpl implements CommentService {
    CommentRepository commentDB = new CommentRepository();
    @Override
    public void save(Comment comment) {
        commentDB.save(comment);
    }

    @Override
    public void saveAll(List<Comment> comments) {
        commentDB.saveAll(comments);
    }

    @Override
    public Comment getCommentById(Long id) {
        return commentDB.findCommentById(id);
    }

    @Override
    public List<Comment> getAll() {
        return commentDB.findAll();
    }

    @Override
    public void deleteById(Long id) {
        commentDB.deleteById(id);
    }
}
