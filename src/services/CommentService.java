package services;

import models.entity.Comment;
import models.entity.Post;
import repositroies.CommentRepository;

import java.util.List;

public interface CommentService {
    void save(Comment comment);
    void saveAll(List<Comment> comments);
    Comment getCommentById(Long id);
    List<Comment> getAll();
    void deleteById(Long id);

}
