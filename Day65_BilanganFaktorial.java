import java.util.Scanner;

public class Day65_BilanganFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        int a = sc.nextInt();

        int faktorial = 1;

        for (int i = 1; i <= a; i++) {
            faktorial *= i;
        }
        System.out.println("Hasil Faktorial "+a+" = "+faktorial);
    }
}
