package video_25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        System.out.print("Char at 3 position is: ");
        char a = s.charAt(2);
        System.out.println(a);

        // Compare 2 char
        System.out.print("Enter char_2: ");
        char a_2 = sc.next().charAt(0);
        System.out.println("Compare 2 char: " + Character.compare(a, a_2));        // if a is at 10, a_2 is at 12 => compare = -2
        // Check Int, White_space, Lower_Case,... Read more in Check.png
        if(!Character.isDigit(a_2)) 
        {
            System.out.println(a_2 + " is not an Int");
        }
    }
}

// CHAR in Java is the same with it in C++