package video_26_3;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Nguyen, Trung, Nghia");
        String arr[] = sb.toString().split(", ");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println(arr[i]);
        }

        String name = "ArVil lIN";
        String name_lower = name.toLowerCase();
        System.out.println("Name Lower: " + name_lower);
        String name_upper = name.toUpperCase();
        System.out.println("Name Upper: " + name_upper);

        String str = "1234566789";
        char[] ch = str.toCharArray();
        System.out.print("Array number: ");
        for(int i =0;i<ch.length;i++)
        {
            System.out.print(ch[i]+" ");
        }
    }
}

// Split String
