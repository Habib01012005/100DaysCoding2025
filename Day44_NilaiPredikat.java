import java.util.Scanner;

public class Day44_NilaiPredikat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai : ");
        int nilai = sc.nextInt();

        if(nilai >= 90 && nilai <= 100) {
            System.out.println("Nilai Predikat : A");
        }else if(nilai >= 80 && nilai < 90){
            System.out.println("Nilai Predikat : B");
        }else if(nilai >= 70 && nilai < 80){
            System.out.println("Nilai Predikat : C");
        }else if(nilai >= 60 && nilai < 70){
            System.out.println("Nilai Predikat : D");
        }else if(nilai >= 0 && nilai < 60){
            System.out.println("Nilai Predikat : E");
        }else{
            System.out.println("Nilai Yang Anda Input : Salah");
        }
    }
}
