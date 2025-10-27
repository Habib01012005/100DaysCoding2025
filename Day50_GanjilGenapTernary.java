import java.util.Scanner;

public class Day50_GanjilGenapTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int angka = sc.nextInt();
        String hasil = (angka %2 == 0)? "Genap": "Ganjil";

        System.out.println(hasil);

    }
}
