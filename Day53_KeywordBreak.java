public class Day53_KeywordBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Perulangan ke-" + i);
            if (i == 6) {
                break;
            }
        }
        System.out.println("Perulangan selesai");
    }
}
