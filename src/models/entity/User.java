package models.entity;

import models.enums.Status;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class User extends BaseEntity{
    private String username;
    private String fullName;
    private List<Post> posts;
    private LocalDate birthDay;
    private List<User> followers;
    private List<User> followings;

    public User(Long id, LocalDateTime createdDate, LocalDateTime updatedDate, Status status, String username, String fullName, List<Post> posts, LocalDate birthDay, List<User> followers, List<User> followings) {
        super(id, createdDate, updatedDate, status);
        this.username = username;
        this.fullName = fullName;
        this.posts = posts;
        this.birthDay = birthDay;
        this.followers = followers;
        this.followings = followings;
    }

    public User(){
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<User> getFollowings() {
        return followings;
    }

    public void setFollowings(List<User> followings) {
        this.followings = followings;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", posts=" + posts +
                ", birthDay=" + birthDay +
                ", followers=" + followers +
                ", followings=" + followings +
                '}';
    }
}
