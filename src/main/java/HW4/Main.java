package HW4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner input = new Scanner(System.in);
        System.out.print("how many digits do u prefer: ");
        int size = input.nextInt();
        List<Double> nextValues = new ArrayList<>();
        System.out.println("insert ur digits: ");
        for (int i = 0; i < size; i++) {
            nextValues.add(input.nextDouble());
        }
        System.out.println("* Summa is: " + calculator.summa(nextValues));
        System.out.println("* Multiplication is: " + calculator.multiplication(nextValues));
        System.out.println("---------------------");
        System.out.println("Next operation is Division");
        System.out.println("* result of Division is: " + calculator.division(15.6, 3));
        System.out.println("---------------------");
        System.out.println("* to binary string is: " + calculator.toBinary("123.0"));
        System.out.println("* to binary float is: " + calculator.toBinary(String.valueOf(13.0f)));
    }
}
