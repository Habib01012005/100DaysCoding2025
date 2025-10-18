import java.util.Scanner;
public class EvaluasiMentor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gelas = sc.nextInt();

        if(gelas %2 == 0){
            System.out.println("Tidak");
        }else{
            System.out.println("Perlu");
        }
    }
}
