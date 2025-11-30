import java.util.Scanner;

public class EvaluasiKe3Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int kali = i * a;
            System.out.println(i+" * "+a+" = "+ kali);
        }
    }
}
