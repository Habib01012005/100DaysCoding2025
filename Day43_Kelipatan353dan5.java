import java.util.Scanner;

public class Day43_Kelipatan353dan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka = sc.nextInt();

        if (angka %(3*5) == 0) {
            System.out.println("Angka Kelipatan 3 dan 5");
        }else if(angka %3 == 0){
            System.out.println("Angka Kelipatan 3");
        }else if(angka %5 == 0){
            System.out.println("Angka Kelipatan 5");
        }else{
            System.out.println("Angka Ini Bukan Angka Kelipatan 3, 5, maupun 3 dan 5");
        }
    }
}
