import java.util.Scanner;

public class Day61_KelipatanMdari1keN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Kelipatan M : ");
        int m = sc.nextInt();

        System.out.print("Masukkan Angka N : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                System.out.println(i);
            }
        }
    }
}
