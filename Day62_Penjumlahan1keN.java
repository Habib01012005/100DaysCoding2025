import java.util.Scanner;

public class Day62_Penjumlahan1keN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int n = sc.nextInt();

        int tambah = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            tambah += i;
        }
        System.out.println(tambah);
    }
}
