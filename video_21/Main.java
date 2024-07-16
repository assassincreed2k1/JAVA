package video_21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.print("Result: ");
        System.out.print(pow_of_num(number, 3));

    }

    public static int pow_of_num(int num, int pow) {
        int result = 1;
        for (int i = 0; i < pow; i++) {
            result *= num;
        }
        return result;
    }

};
