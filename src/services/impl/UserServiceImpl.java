package services.impl;

import models.entity.User;
import repositroies.UserRepository;
import services.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserRepository userDB = new UserRepository();
    @Override
    public void save(User user) {
        userDB.save(user);
    }

    @Override
    public void saveAll(List<User> users) {
        userDB.saveAll(users);
    }

    @Override
    public User getUserById(Long id) {
        return userDB.findUserById(id);
    }

    @Override
    public List<User> getAll() {
        return userDB.findAll();
    }

    @Override
    public void deleteById(Long id) {
        userDB.deleteById(id);
    }

    @Override
    public List<User> getUserFollowersById(Long id) {
        return getUserById(id).getFollowers();
    }

    @Override
    public List<User> getUserFollowingsById(Long id) {
        return getUserById(id).getFollowings();
    }
}
