import java.util.Scanner;

public class SoalNo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Batas bawah : ");
        int a = sc.nextInt();
        System.out.print("Batas atas : ");
        int b = sc.nextInt();
        System.out.print("Angka : ");
        int c = sc.nextInt();

        if(a < c && b > c){
            System.out.println("YAYAYAYA");
        }else{
            System.out.println("NONONONO");
        }
    }
}