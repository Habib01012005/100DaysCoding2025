public class Day18_KecilKeBesar{
    public static void main(String[] args) {
        // byte -> short -> int -> long
        byte a = 10;
        short b = a;
        int  c = b;
        long d = c;
        // float -> double
        float e = 12.3f;
        double f = e;

        System.out.println(d);
        System.out.printf("%.2f",f);
    }
}
