package video_9_10;
import java.util.Scanner;

public class Main {
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        if (number >= 10 && number <= 99) {
            System.out.println("A two-digit number");
        }
        if (number < 0 || number % 2 != 0) {
            System.out.println("This is not an odd number");
        } else {
            System.out.println("Even number");
        }

        System.out.print("Enter a string: ");

        Scanner str = new Scanner(System.in);
        String arr = str.next(); // or nextLine
        System.out.println(arr);
    }
}

// Using SCANNER
