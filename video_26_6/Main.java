package video_26_6;

import java.util.Scanner;

public class Main {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Create a password: ");
        String password, enter_pass;
        int num_try = 0;
        do {
            password = sc.nextLine();
            if (!check_pass_true(password)) {
                System.out.print("Please create a more stronger password: ");
            } else {
                System.out.println("Your password is OK!");
            }
        } while (!check_pass_true(password));

        System.out.print("Enter your password: ");
        do {
            enter_pass = sc.nextLine();
            if (!enter_pass.equals(password)) {
                if (num_try >= 5) {
                    System.out.println("Wrong too much! Your account will be blocked for 1 hour!");
                    break;
                }
                num_try++;
                System.out.println("Your password is wrong. Try again!");
                System.out.print("Enter your password: ");
            } else {
                System.out.println("Congrats! Welcome to JAVA World...");
                break;
            }
        } while (true);
    }

    public static boolean check_pass_true(String pass) {
        boolean digit = false;
        boolean lower_char = false;
        boolean upper_char = false;
        boolean length = false;
        boolean special_char = false;

        for (char c : pass.toCharArray()) {
            if (Character.isDigit(c)) {
                digit = true;
            }
            if (Character.isUpperCase(c)) {
                upper_char = true;
            }
            if (Character.isLowerCase(c)) {
                lower_char = true;
            }
            if (!Character.isLetterOrDigit(c)) {
                special_char = true;
            }
            if (pass.length() >= 8) {
                length = true;
            }
        }
        if (digit && upper_char && lower_char && special_char && length) {
            return true;
        }
        return false;
    }
}
