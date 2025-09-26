public class Day19_BesarKeKecil {
    public static void main(String[] args) {
        // long -> int -> short -> byte
        long a = 100l;
        int b = (int) a;
        short c = (short) b;
        byte d = (byte) c;

        // doble -> float
        double e = 120.5;
        float f = (float) e;

        System.out.println(d);
        System.out.printf("%.2f",f);
    }
}
