import java.util.Scanner;

public class Day12_Biodata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Isi Biodata Anda");
        System.out.println("================");
        
        System.out.print("Nama : ");
        String nama = sc.nextLine();

        System.out.print("NIM : ");
        String nim = sc.nextLine();

        System.out.print("Angkatan :");
        int angkatan = sc.nextInt();

        System.out.println("================");
        System.out.println("Biodata Anda");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Angkatan : " + angkatan);
        
    }
}
