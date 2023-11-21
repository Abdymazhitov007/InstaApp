package models.dto;

import models.entity.Comment;

import java.time.LocalDateTime;
import java.util.List;

public class MainContentDTO {
    private Long id;
    private String title;
    private String photoUrl;
    private LocalDateTime createdDate;
    private List<Comment> comments;

    public MainContentDTO(Long id, String title, String photoUrl, LocalDateTime createdDate, List<Comment> comments) {
        this.id = id;
        this.title = title;
        this.photoUrl = photoUrl;
        this.createdDate = createdDate;
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "MainContentDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                ", createdDate=" + createdDate +
                ", comments=" + comments +
                '}';
    }
}
