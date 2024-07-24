package video_29;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> username_list = new HashMap<>();
        username_list.put("pcuong2", "songnhue");
        username_list.put("pcuong3", "123456");
        username_list.put("pcuong4", "666666");

        class user {
            String username;
            String password;
        }
        
        user user_1 = new user();
        user_1.username = new_username(sc, username_list);
        user_1.password = new_password(sc);
        username_list.put(user_1.username, user_1.password); // Add to Map
        System.out.println(">>> Here is your account:");
        System.out.println("_Username_: " + user_1.username);
        System.out.println( "_Password_: " + username_list.get(user_1.username));
    }
    

    // Check password
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

    // Create username
    public static String new_username(Scanner sc, HashMap<String, String> username_list)
    {
        String user_name;
        System.out.print("***Enter a username: ");

        do {
            user_name = sc.nextLine();
            if (username_list.containsKey(user_name)) {
                System.out.print("This username is not available!\n*Enter another username: ");
            } else {
                break;
            }
        } while (true);
        return user_name;
    }

    // Create password
    public static String new_password(Scanner sc)
    {
        String password;

        System.out.print("***Create a password: ");
        do {
            password = sc.nextLine();
            if (!check_pass_true(password)) {
                System.out.print("*Please create a more stronger password: ");
            } else {
                System.out.println("Your password is OK!");
            }
        } while (!check_pass_true(password));
        return password;
    }

}

// Creating USERNAME_LIST with HASHMAP