import java.util.Scanner;

public class Day58_Angka1NdanN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        System.out.println("Angka 1 sampai N");
        for(int i = 1; i <= n; i++){
            System.out.print(i+" ");
        }System.out.println();
        System.out.println("Angka N sampai 1");
        for(int i = n; i >= 1; i--){
            System.out.print(i+" ");
        }
    }
}
