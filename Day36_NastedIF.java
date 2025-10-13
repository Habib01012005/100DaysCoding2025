import java.util.Scanner;
public class Day36_NastedIF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai : ");
        int nilai = sc.nextInt();

        if(nilai >= 60 && nilai <= 100){
            System.out.print("Anda lulus Dengan Nilai : ");
            if(nilai >= 90){
                System.out.println("A");
            }else if(nilai >= 70 && nilai < 90){
                System.out.println("B");
            }else if(nilai >= 60 && nilai < 70) {
                System.out.println("C");
            }
        }else{
            System.out.println("Anda Tidak Lulus");
        }
    }
}
