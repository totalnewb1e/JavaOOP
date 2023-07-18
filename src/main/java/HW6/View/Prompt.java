package HW6.View;

import java.util.Scanner;

public class Prompt {
    String prompt(String message){
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.nextLine();
    }
}
