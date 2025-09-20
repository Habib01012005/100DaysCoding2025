
import java.util.Scanner;

public class AngAngAng2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gelas_A, gelas_B, gelas_C;
        
        gelas_A = sc.nextInt();
        gelas_B = sc.nextInt();
        gelas_C = sc.nextInt();

        System.out.println("sebelum di shuffe A = "+gelas_A+", B ="+gelas_B+", C ="+gelas_C);

        int baru = gelas_A;
        gelas_A = gelas_C;
        gelas_C = gelas_B;
        gelas_B = baru;
    

        System.out.println("setelah di shuffe A = "+gelas_A+", B ="+gelas_B+", C ="+gelas_C);
    }
}
