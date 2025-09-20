import java.util.Scanner;

public class AngAngAng3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte merah = sc.nextByte();
        short hijau = sc.nextShort();
        int biru = sc.nextInt();
        
        System.out.printf("%d -> \n",merah);
        
        hijau = merah;
        System.out.print(merah+"->"+hijau+"-> \n");

        biru = hijau;
        System.out.print(merah+"->"+hijau+"->"+biru);

    }
    
}
