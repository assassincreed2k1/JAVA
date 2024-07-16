package video_24;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        int number_int = rd.nextInt(1, 100);
        double number_double = rd.nextDouble(-100, 100);
        System.out.println(number_int);
        System.out.println(number_double);
    }
    
}


// Using RANDOM