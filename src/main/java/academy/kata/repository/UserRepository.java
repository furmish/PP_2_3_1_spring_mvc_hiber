package academy.kata.repository;

import academy.kata.model.User;

import java.util.List;

public interface UserRepository {
    List<User> listUsers();
    void createUser(User user);
    void removeUser(User user);
    User getUserById(long id);
    void updateUser(User user);
}
