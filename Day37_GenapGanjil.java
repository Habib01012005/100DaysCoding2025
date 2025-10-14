import java.util.Scanner;

public class Day37_GenapGanjil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka = sc.nextInt();

        if(angka %2 == 0) {
            System.out.println("Genap");
        }else if (angka %2 == 1) {
            System.out.println("Ganjil");
        }
    }
}
