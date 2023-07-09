package HW3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RuGame ruGame = new RuGame();
        EnGame enGame = new EnGame();
        NumberGame numberGame = new NumberGame();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose game type. Input 1 for RU, 2 for EN and 3 for NUMBERS");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.print("* Input char length and number of attempts: ");
                    ruGame.start(scanner.nextInt(), scanner.nextInt());
                    scanner.nextLine();
                    while (!ruGame.getGameStatus().equals(GameStatus.FINISH)) {
                        System.out.println("* Make a guess B): ");
                        String value = scanner.nextLine();
                        Answer answer = ruGame.inputValue(value);
                        if (answer != null) {
                            System.out.println("answer = " + answer);
                        }
                    }
                }
                case 2 -> {
                    System.out.print("* Input char length and number of attempts: ");
                    enGame.start(scanner.nextInt(), scanner.nextInt());
                    scanner.nextLine();
                    while (!enGame.getGameStatus().equals(GameStatus.FINISH)) {
                        System.out.println("* Make a guess B): ");
                        String value = scanner.nextLine();
                        Answer answer = enGame.inputValue(value);
                        if (answer != null) {
                            System.out.println("answer = " + answer);
                        }
                    }
                }
                case 3 -> {
                    System.out.print("* Input char length and number of attempts: ");
                    numberGame.start(scanner.nextInt(), scanner.nextInt());
                    scanner.nextLine();
                    while (!numberGame.getGameStatus().equals(GameStatus.FINISH)) {
                        System.out.println("* Make a guess B): ");
                        String value = scanner.nextLine();
                        Answer answer = numberGame.inputValue(value);
                        if (answer != null) {
                            System.out.println("answer = " + answer);
                        }
                    }
                }
            }
        }
    }
}