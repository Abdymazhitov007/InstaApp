package repositroies;

import exceptions.EntityNotFoundException;
import models.entity.User;
import models.enums.Status;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    List<User> db = new ArrayList<>();
    public void save(User user) {
        db.add(user);
    }

    public void saveAll(List<User> users) {
        db.addAll(users);
    }

    public User findUserById(Long id) {
        try {
            if (db.get(Math.toIntExact(id)).getStatus().equals(Status.ACTIVE)){
                return db.get(Math.toIntExact(id));
            } else {
                throw new EntityNotFoundException("User not found!");
            }
        } catch (Exception ex) {
            System.out.println("User not found!");
        }
        return null;
    }

    public List<User> findAll() {
        List<User> sortedList = new ArrayList<>();
        for (User item: db) {
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
