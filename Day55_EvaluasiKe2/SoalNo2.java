import java.util.Scanner;

public class SoalNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nilai : ");
        int nilai = sc.nextInt();

        if(nilai >= 80){
            System.out.println("Ujian Kroco Ji Pale");
        }else{
            System.out.println("Sa Jappoka Aih");
        }
    }
}
