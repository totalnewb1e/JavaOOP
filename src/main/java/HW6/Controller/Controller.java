package HW6.Controller;

import HW6.Model.Repo;
import HW6.Model.User;

import java.util.List;

public class Controller implements ControlOperation {
    private final Repo repo;

    public Controller(Repo repo) {
        this.repo = repo;
    }

    @Override
    public void saveUser(User user) {
        repo.createUser(user);
    }

    @Override
    public User readUser(String userId) throws Exception {
        List<User> users = repo.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        throw new Exception("* User does not exists. ");
    }

    @Override
    public void deleteUser(String userId) throws Exception {
        List<User> users = repo.getAllUsers();
        User deletedUser = null;
        for (User user : users) {
            if (user.getId().equals(userId)) {
                deletedUser = user;
            }
        }
        users.remove(deletedUser);
        repo.removeUser(users);
    }
}
