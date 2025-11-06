import java.util.Scanner;

public class Day60_AngkaGanjilGenapN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        System.out.println("Angka Ganjil N sampai 1");
        for(int i = n; i >= 1; i--){
            if(i % 2 != 0){
                System.out.print(i+" ");
            }
        }System.out.println();

        System.out.println("Angka Genap N sampai 1");
        for(int i = n; i >= 1; i--) {
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
