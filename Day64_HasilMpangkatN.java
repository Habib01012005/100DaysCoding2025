import java.util.Scanner;

public class Day64_HasilMpangkatN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Angka M : ");
        int m = sc.nextInt();

        System.out.print("Masukkan Pagkat N : ");
        int n = sc.nextInt();

        int hasil = 1;

        for (int i = 0; i < n; i++) {
            hasil *= m;
        }
        System.out.println(hasil);
    }
}
