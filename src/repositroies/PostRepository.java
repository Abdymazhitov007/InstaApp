package repositroies;

import exceptions.EntityNotFoundException;
import models.entity.Post;
import models.enums.Status;

import java.util.ArrayList;
import java.util.List;

public class PostRepository {
    List<Post> db = new ArrayList<>();
    public void save(Post post) {
        db.add(post);
    }

    public void saveAll(List<Post> posts) {
        db.addAll(posts);
    }

    public Post findPostById(Long id) {
        try {
            if (db.get(Math.toIntExact(id)).getStatus().equals(Status.ACTIVE)) {
                return db.get(Math.toIntExact(id));
            } else {
                throw new EntityNotFoundException("Post not found!");
            }
        } catch (Exception ex) {
            System.out.println("Post not found!");
        }
        return null;
    }

    public List<Post> findAll() {
        List<Post> sortedList = new ArrayList<>();
        for (Post item: db) {
            if (item.getStatus().equals(Status.ACTIVE)){
                sortedList.add(item);
            }
        }
        return sortedList;
    }

    public void deleteById(Long id) {
        db.remove(Math.toIntExact(id));
    }
}
