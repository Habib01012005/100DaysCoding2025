
import java.util.Scanner;

public class Day99_DeretanPrima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean prima;
        for (int i = 2; i <= n; i++) {
            prima = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prima = false;
                }
            }

            if (prima) {
                System.out.print(i + " ");
            }
        }
    }
}
