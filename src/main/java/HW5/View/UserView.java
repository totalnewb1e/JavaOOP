package HW5.View;

import HW5.Controller.Controller;
import HW5.Model.User;

import java.util.Scanner;

public class UserView {
    private final Controller controller;

    public UserView(Controller controller) {
        this.controller = controller;
    }

    public void start() {
        Command commandExe;
        while (true) {
            String command = prompt("* Input command: ");
            commandExe = Command.valueOf(command);
            if (commandExe == Command.EXIT) return;
            String id;
            switch (commandExe) {
                case CREATE -> {
                    String firstName = prompt("* Name: ");
                    String surname = prompt("* Surname: ");
                    String phoneNumber = prompt("* Phone Number: ");
                    controller.saveUser(new User(firstName, surname, phoneNumber));
                }
                case READ -> {
                    id = prompt("* User ID: ");
                    try {
                        User user = controller.readUser(id);
                        System.out.println(user);
                    } catch (Exception exception) {
                        throw new RuntimeException(exception);
                    }
                }
                case DELETE -> {
                    id = prompt("* User ID: ");
                    try {
                        controller.deleteUser(id);
                        System.out.println("* User removed. ");
                    } catch (Exception exception) {
                        throw new RuntimeException(exception);
                    }
                }
            }
        }
    }
    private String prompt(String message){
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.nextLine();
    }
}
