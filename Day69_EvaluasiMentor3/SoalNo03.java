import java.util.Scanner;

public class SoalNo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            char b = sc.next().charAt(0);
            char c = sc.next().charAt(0);
            char d = sc.next().charAt(0);

            System.out.println(b+""+c+""+d+"");
        }
    }
}