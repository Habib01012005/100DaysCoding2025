
import java.util.Scanner;

public class Day49_Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai 0-100 : ");
        int nilai = sc.nextInt();

        String hasil = (nilai >= 60 && nilai <= 100)? "Lulus" : "Tidak Lulus";

        System.out.println("Anda "+hasil+" Dengan Nilai "+nilai);
    }
}
