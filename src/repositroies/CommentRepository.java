package repositroies;

import exceptions.EntityNotFoundException;
import models.entity.Comment;
import models.entity.Post;
import models.enums.Status;

import java.util.ArrayList;
import java.util.List;

public class CommentRepository {
    List<Comment> db = new ArrayList<>();
    public void save(Comment comment) {
        db.add(comment);
    }

    public void saveAll(List<Comment> comments) {
        db.addAll(comments);
    }

    public Comment findCommentById(Long id) {
        try {
            if (db.get(Math.toIntExact(id)).getStatus().equals(Status.ACTIVE)) {
                return db.get(Math.toIntExact(id));
            } else {
                throw new EntityNotFoundException("Comment not found!");
            }
        } catch (Exception ex){
            System.out.println("Comment not found!");
        }
        return null;
    }

    public List<Comment> findAll() {
        List<Comment> sortedList = new ArrayList<>();
        for (Comment item: db) {
            if (item.getStatus().equals(Status.ACTIVE)) {
                sortedList.add(item);
            }
        }
        return sortedList;
    }

    public void deleteById(Long id) {
        db.remove(Math.toIntExact(id));
    }
}
