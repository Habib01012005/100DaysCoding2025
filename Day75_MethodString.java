import java.util.Scanner;

public class Day75_MethodString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda : ");
        String nama = sc.nextLine();
        System.out.println();

        System.out.println("Panjang Nama : "+ nama.length());
        System.out.println("Huruf Besar  : "+ nama.toUpperCase());
        System.out.println("Huruf Kecil  : "+ nama.toLowerCase());
    }
}
