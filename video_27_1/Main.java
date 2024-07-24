package video_27_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str_arr;
        int[] digit_arr;
        boolean[] bool_arr;

        String[] str_arr_2 = new String[10];
        int[] digit_arr_2 = new int[10];

        String[] str_arr_3 = new String[] { "Nghia", "Tho", "Bang" };
        int[] digit_arr_3 = new int[10];
        int[] digit_arr_3_copy = digit_arr_3.clone();

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < digit_arr_3.length; i++) {
            digit_arr_3[i] = sc.nextInt();
        }
        Arrays.sort(digit_arr_3);
        System.out.println("Number array after sort:");
        for (int i = 0; i < digit_arr_3.length; i++) {
            System.out.print(digit_arr_3[i] + " ");
        }
        System.out.println("\nName array:");
        for (int i = 0; i < str_arr_3.length; i++) {
            System.out.print(str_arr_3[i] + " ");
        }
    }
}
