package video_26_9;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String arr = sc.nextLine();
        ArrayList<Character> array = new ArrayList<>();
        for ( char c: arr.toCharArray())
        {
            array.add(c);
        }
        ArrayList<Character> arr_num = new ArrayList<>();
        ArrayList<Character> arr_letter = new ArrayList<>();
        for(int i = 0;i<array.size();i++)
        {
            if (Character.isDigit(array.get(i))) {
                arr_num.add(array.get(i));
            } else if (Character.isLetter(array.get(i))) {
                arr_letter.add(array.get(i));
            }
        }
        System.out.println("Array of Number: ");
        for(int i=0;i<arr_num.size();i++)
        {
            System.out.print(arr_num.get(i) + " ");
        }

        System.out.println("\nArray of Letter: ");
        for(int i=0;i<arr_letter.size();i++)
        {
            System.out.print(arr_letter.get(i) + " ");
        }
    }
}

// Tách chuỗi số và chữ ra khỏi String