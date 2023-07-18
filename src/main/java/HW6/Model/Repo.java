package HW6.Model;

import java.util.List;

public interface Repo {
    List<User> getAllUsers();
    void createUser(User user);
    void removeUser(List<User> users);
}
