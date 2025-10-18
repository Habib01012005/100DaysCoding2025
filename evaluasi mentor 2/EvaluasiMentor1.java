import java.util.Scanner;
public class EvaluasiMentor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int juri1 = sc.nextInt();
        int juri2 = sc.nextInt();
        int juri3 = sc.nextInt();

        if (juri1 >= 50 && juri2 >= 50 && juri3 >= 50) {
            int hasil = juri1 + juri2 + juri3;
            if (hasil >= 200) {
                System.out.println("Lolos");
            } else {
                System.out.println("Tidak Lolos");
            }
        }else{
            System.out.println("Tidak Lolos");
        }
    }
}
