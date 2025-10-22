import java.util.Scanner;

public class Day45_SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka1 = sc.nextInt();
        char simbol = sc.next().charAt(0);
        int angka2 = sc.nextInt();

        switch (simbol) {
            case '+':
                angka1 = angka1 + angka2;
                System.out.println(angka1);
            break;
            case '-':
                angka1 = angka1 - angka2;
                System.out.println(angka1);
            break;
            case '*':
                angka1 = angka1 * angka2;
                System.out.println(angka1);
            break;
            case '/':
                angka1 = angka1 / angka2;
                System.out.println(angka1);
            break;
            default:
            System.out.println("Simbol Tidak Diketahui");

        }
    }
}
