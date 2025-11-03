public class Day57_NastedLoop {
    public static void main(String[] args) {
        int a = 4;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("o ");
            }
            System.out.println("o");
        }
    }
}
