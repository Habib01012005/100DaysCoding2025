import java.util.Scanner;

public class Day48_KalkulatorSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Angka Pertama \t : ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan Angka Ke-Dua \t : ");
        int angka2 = sc.nextInt();
        System.out.print("Masukkan Simbol Aritmatika : ");
        char simbol = sc.next().charAt(0);

        switch (simbol) {
            case '+':
                angka1 = angka1 + angka2;
                System.out.println("Hasil Penjumlahan : "+angka1);
            break;
            case '-':
                angka1 = angka1 - angka2;
                System.out.println("Hasil Pengurangan : "+angka1);
            break;
            case '*':
                angka1 = angka1 * angka2;
                System.out.println("Hasil Perkalian : "+angka1);
            break;
            case '/':
                angka1 = angka1 / angka2;
                System.out.println("Hasil Pembagian : "+angka1);
            break;
            default:
            System.out.println("Simbol Yang Anda Masukkan Salah");
        }
    }
}
