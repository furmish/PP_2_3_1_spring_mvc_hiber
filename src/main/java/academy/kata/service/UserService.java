package academy.kata.service;

import academy.kata.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    void addUser(User user);
    void removeUser(User user);
    User getUserById(long id);
    void updateUser(User user);
}
