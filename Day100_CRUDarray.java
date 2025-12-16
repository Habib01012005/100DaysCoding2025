import java.util.Scanner;

public class Day100_CRUDarray {
    static Scanner input = new Scanner(System.in);

    static String[] nim = new String[10];
    static String[] nama = new String[10];
    static int jumlahData = 0;

    public static void main(String[] args) {
        char pilihan;

        do {
            System.out.println("\n=== MENU CRUD MAHASISWA ===");
            System.out.println("C = CREATE");
            System.out.println("R = READ");
            System.out.println("U = UPDATE");
            System.out.println("D = DELETE");
            System.out.println("O = OUT PROGRAM");
            System.out.print("Pilih: ");
            pilihan = input.next().charAt(0);
            input.nextLine();

            switch (pilihan) {
                case 'C':
                    tambahData();
                    break;
                case 'R':
                    tampilData();
                    break;
                case 'U':
                    updateData();
                    break;
                case 'D':
                    hapusData();
                    break;
                case 'O':
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 'O');
    }

    static void tambahData() {
        if (jumlahData < nim.length) {
            System.out.print("Masukkan NIM  : ");
            nim[jumlahData] = input.nextLine();
            System.out.print("Masukkan Nama : ");
            nama[jumlahData] = input.nextLine();
            jumlahData++;
            System.out.println("Data berhasil ditambahkan.");
        } else {
            System.out.println("Data penuh!");
        }
    }

    static void tampilData() {
        if (jumlahData == 0) {
            System.out.println("Belum ada data.");
        } else {
            System.out.println("\nDaftar Mahasiswa:");
            for (int i = 0; i < jumlahData; i++) {
                System.out.println((i + 1) + ". NIM: " + nim[i] + ", Nama: " + nama[i]);
            }
        }
    }

    static void updateData() {
        System.out.print("Masukkan NIM yang akan diupdate: ");
        String cariNim = input.nextLine();

        for (int i = 0; i < jumlahData; i++) {
            if (nim[i].equals(cariNim)) {
                System.out.print("Masukkan Nama Baru: ");
                nama[i] = input.nextLine();
                System.out.println("Data berhasil diupdate.");
                return;
            }
        }
        System.out.println("Data tidak ditemukan.");
    }

    static void hapusData() {
        System.out.print("Masukkan NIM yang akan dihapus: ");
        String cariNim = input.nextLine();

        for (int i = 0; i < jumlahData; i++) {
            if (nim[i].equals(cariNim)) {
                for (int j = i; j < jumlahData - 1; j++) {
                    nim[j] = nim[j + 1];
                    nama[j] = nama[j + 1];
                }
                jumlahData--;
                System.out.println("Data berhasil dihapus.");
                return;
            }
        }
        System.out.println("Data tidak ditemukan.");
    }
}
