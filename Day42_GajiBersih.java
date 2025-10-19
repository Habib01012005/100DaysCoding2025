import java.util.Scanner;
public class Day42_GajiBersih {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double gaji = sc.nextDouble();
        double pajak = 0.05;

        double hasilPajak = gaji * pajak;
        double gajiBersih = gaji - hasilPajak;

        System.out.println("======Gaji Kotor======");
        System.out.println("Gaji \t\t : Rp."+gaji);
        System.out.println("Total Pajak \t : Rp."+hasilPajak);
        System.out.println();
        System.out.println("======Gaji Bersih======");
        System.out.println("Total Gaji \t : Rp."+gajiBersih);
    }
}
