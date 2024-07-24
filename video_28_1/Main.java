package video_28_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> number_arr = new ArrayList<>();
        ArrayList<Integer> number_arr_2 = new ArrayList<>(5);
        ArrayList<Integer> number_arr_3 = new ArrayList<>(List.of(1, 2));

        for(int i = 0;i<number_arr_3.size(); i++)
        {
            System.out.print(number_arr_3.get(i)+" ");
        }


    } 
    
}
