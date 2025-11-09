import java.util.Scanner;

public class Day63_Perkalian1keN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Angka N : ");
        int n = sc.nextInt();
        int kali = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            kali *= i;
        }
        System.out.println(kali);
    }
}
