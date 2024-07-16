package video_12;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String str = (a % 2 == 0) ? (str = "Even number") : ((a>10)? (str ="La so le co 2 chu so"):(str = "khong phai so le co 2 chu so"));
        System.out.println(str);
    }
    
}
