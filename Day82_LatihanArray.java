import java.util.Scanner;

public class Day82_LatihanArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // menentukan jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = input.nextInt();

        // membuat array
        int[] angka = new int[jumlah];

        // mengisi elemen array
        System.out.println("\n=== Input Elemen Array ===");
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // menampilkan elemen array
        System.out.println("\n=== Isi Elemen Array ===");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Elemen ke-" + (i + 1) + ": " + angka[i]);
        }

        input.close();
    }
}
