
import java.util.Scanner;

public class AngAngAng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final short thnini;
        
        thnini = sc.nextShort();
        
        short thndpn = sc.nextShort();

        int thnll = sc.nextInt();

        System.out.printf("saat ini tahun %d \n",thnini);
        System.out.println("Jadi tahun kemarin adalah tahun " + thnll);
        System.out.println("tahun depan berarti "+thndpn);
        System.out.print(thnll+",");
        System.out.print(thnini+",");
        System.out.print(thndpn);
    }
}