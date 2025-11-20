import java.util.Scanner;

public class Day74_DoWhileMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pil;

        do { 
            System.out.println("===Menu Mata Kuliah===");
            System.out.println("1. Pemrograman Mobile");
            System.out.println("2. Pemrograman Dasar");
            System.out.println("3. Pemrograman Jaringan");
            System.out.println();
            System.out.print("Masukkan Pilihan Anda (1-3) : ");
            pil = sc.nextInt();
            System.out.println();

            switch (pil) {
                case 1:
                    System.out.println("Anda Memilih Mata Kuliah Pemrograman Mobile");
                    break;
                case 2:
                    System.out.println("Anda Memilih Mata Kuliah Pemrograman Dasar");
                    break;
                case 3:
                    System.out.println("Anda Memilih Mata Kuliah Pemrograman Jaringan");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid");
                    break;
            }
        } while (pil != 4);
    }
}
