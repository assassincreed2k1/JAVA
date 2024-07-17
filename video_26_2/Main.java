package video_26_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append("Hello World");
        System.out.print("Enter a string: ");
        String string_find = sc.nextLine();
        // Check First Index
        if (sb.indexOf(string_find) == -1) {
            System.out.println("Not found!");
        } else {
            System.out.println("Found! First Index at: " + sb.indexOf(string_find));
        }

        // Check Last Index
        if (sb.lastIndexOf(string_find) == -1) {
            System.out.println("Not found!");
        } else {
            System.out.println("Found! Last Index at: " + sb.lastIndexOf(string_find));
        }

        if (sb.toString().contains(string_find))   // contains just only use for String, not use for String_Builder
        {
            System.out.println("Found!");
        }

        String string_son = sb.substring(6);
        System.out.println(string_son);
    }
}
