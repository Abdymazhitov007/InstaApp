package models.entity;

import models.enums.Status;

import java.time.LocalDateTime;
import java.util.List;

public class Post extends BaseEntity{

    private String title;
    private User user;
    private List<Comment> comments;
    private List<User> likes;
    private String photoUrl;

    public Post(Long id, LocalDateTime createdDate, LocalDateTime updatedDate, Status status, String title, User user, List<Comment> comments, List<User> likes, String photoUrl) {
        super(id, createdDate, updatedDate, status);
        this.title = title;
        this.user = user;
        this.comments = comments;
        this.likes = likes;
        this.photoUrl = photoUrl;
    }

    public Post() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<User> getLikes() {
        return likes;
    }

    public void setLikes(List<User> likes) {
        this.likes = likes;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", user=" + user +
                ", comments=" + comments +
                ", likes=" + likes +
                ", photoUrl='" + photoUrl + '\'' +
                '}';
    }
}
