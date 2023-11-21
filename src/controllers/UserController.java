package controllers;

import models.entity.User;
import services.UserService;
import services.impl.UserServiceImpl;

import java.util.List;

public class UserController {
    UserService userService = new UserServiceImpl();
    public void save(User user){
        userService.save(user);
    }
    public void saveAll(List<User> users){
        userService.saveAll(users);
    }
    public User getUserById(Long id){
        return userService.getUserById(id);
    }
    public List<User> getAll(){
        return userService.getAll();
    }
    public void deleteById(Long id){
        userService.deleteById(id);
    }
    public List<User> getUserFollowersById(Long id){
        return userService.getUserFollowersById(id);
    }
    public List<User> getUserFollowingsById(Long id) {
        return userService.getUserFollowingsById(id);
    }


}
