public class Day31_LogikaAND {
    public static void main(String[] args) {
        int a = 20;
        int b = 15;
        int c = 20;

        System.out.println((a > b) && (a == c));
        System.out.println((a > b) && (a < b));
        System.out.println((a < b) && (a >= c));
        System.out.println((a < b) && (b >= c));
    }
}
