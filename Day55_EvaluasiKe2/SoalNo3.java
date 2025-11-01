
import java.util.Scanner;

public class SoalNo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Angka : ");
        int angka = sc.nextInt();

        if(angka == 0){
            System.out.println("");
        }else if(angka % 2 == 0){
            System.out.println("Iyaji");
        }else{
            System.out.println("Tidakji");
        }
    }
}
