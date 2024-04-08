package main.java.com.magicvet;

import java.util.Scanner;

public class Main {

    static String PASSWORD = "password";

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        run();

    }

    static void run() {
        boolean accepted = false;
        for (int i = 0; i < 3; i++){
            System.out.print("Password: ");
            String input = scanner.nextLine();

            if (input.equals(PASSWORD)){
                accepted = true;
                break;
            } else {
                System.out.println("Incorrect password!");
            }
        }

        System.out.println(accepted ? "Correct. Welcome!" : "Application has been blocked.");
    }
}