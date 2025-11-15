import java.util.Scanner;

public class SoalNo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            int b = sc.nextInt();
            sum = b;
            // if (sum %3 == 0) {
            //     System.out.println("0");
            // }if (sum %3 == 1) {
            //     System.out.println("2");
            // }if (sum %3 == 2) {
            //     System.out.println("1");
            // }

            if (b % 3 == 0) {
                System.out.println(0);
            } else {
                System.out.println(3-b%3);
            }
        }
    }
}
