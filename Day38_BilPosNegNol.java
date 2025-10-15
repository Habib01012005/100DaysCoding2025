import java.util.Scanner;

public class Day38_BilPosNegNol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka = sc.nextInt();

        if (angka > 0) {
            System.out.println("Bilangan Positif");
        }else if(angka < 0){
            System.out.println("Bilangan Negatif");
        }else{
            System.out.println("Bilangan Nol");
        }
    }
}
