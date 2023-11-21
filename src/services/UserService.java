package services;

import models.entity.Post;
import models.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);
    void saveAll(List<User> users);
    User getUserById(Long id);
    List<User> getAll();
    void deleteById(Long id);
    List<User> getUserFollowersById(Long id);
    List<User> getUserFollowingsById(Long id);
}
