package models.entity;

import models.enums.Status;

import java.time.LocalDateTime;
import java.util.List;

public class Comment extends BaseEntity{

    private Post post;
    private User user;
    private List<User> likes;
    private String description;

    public Comment(Long id, LocalDateTime createdDate, LocalDateTime updatedDate, Status status, Post post, User user, List<User> likes, String description) {
        super(id, createdDate, updatedDate, status);
        this.post = post;
        this.user = user;
        this.likes = likes;
        this.description = description;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getLikes() {
        return likes;
    }

    public void setLikes(List<User> likes) {
        this.likes = likes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "post=" + post +
                ", user=" + user +
                ", likes=" + likes +
                ", description='" + description + '\'' +
                '}';
    }
}
