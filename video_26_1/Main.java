package video_26_1;

public class Main {
    public static void main(String[] args) {
        String s = "Hoi che mom em rong" +
                "\nThe la hai dua chap mom do";
        System.out.println("***First String: \n" + s);
        // String Builder
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.insert(4, "do toi ");
        System.out.println("***Second String: \n" + sb);
        sb.delete(4, 11);
        System.out.println("***Third String: \n" + sb);
        System.out.println("***String Length: " + s.length());
    }
}