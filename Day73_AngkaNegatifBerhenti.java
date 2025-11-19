import java.util.Scanner;

public class Day73_AngkaNegatifBerhenti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 100; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int hasil = a + b;

            if (a >= 0 && b >= 0) {
                System.out.println(hasil);
            } else {
                break;
            }
        }

    }
}
