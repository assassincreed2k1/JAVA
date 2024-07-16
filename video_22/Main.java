package video_22;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Get current date:
        System.out.print("Current Time: ");
        Calendar current;
        current = Calendar.getInstance();
        System.out.print(current.get(Calendar.DAY_OF_MONTH) + "/");
        System.out.print(current.get(Calendar.MONTH) + 1 + "/");
        System.out.print(current.get(Calendar.YEAR));

        // Enter date:
        System.out.println();
        Calendar birth = Calendar.getInstance();
        birth.set(Calendar.YEAR, 2005);
        birth.set(Calendar.MONTH, 2);
        birth.set(Calendar.DAY_OF_MONTH, 27);

        System.out.print("Birthday: ");
        System.out.print(birth.get(Calendar.DAY_OF_MONTH) + "/");
        System.out.print(birth.get(Calendar.MONTH) + 1 + "/");
        System.out.print(birth.get(Calendar.YEAR));
    }
}

// Using calender in JAVA