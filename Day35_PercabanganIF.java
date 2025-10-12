import java.util.Scanner;

public class Day35_PercabanganIF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai : ");
        int nilai = sc.nextInt();

        if(nilai >= 60 && nilai <= 100){
            System.out.println("Anda Lulus");
        }else if(nilai >= 0 && nilai < 60){
            System.out.println("Anda Tidak Lulus");
        }else{
            System.out.println("Nilai Eror");
        }
    }
}
