package HW6.Controller;

import HW6.Model.User;

public interface ControlOperation {

    void saveUser(User user);

    User readUser(String userId) throws Exception;

    void deleteUser(String userId) throws Exception;
}
