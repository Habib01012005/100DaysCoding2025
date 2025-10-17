import java.util.Scanner;

public class Day40_Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka1 = input.nextInt();
        char simbol = input.next().charAt(0);
        int angka2 = input.nextInt();

        if(simbol == '*'){
            angka1 = angka1 * angka2;
            System.out.println(angka1);
        }else if(simbol == '/'){
            angka1 = angka1/angka2;
            System.out.println(angka1);
        }else if(simbol == '+'){
            angka1 = angka1 + angka2;
            System.out.println(angka1);
        }else if(simbol == '-'){
            angka1 = angka1 - angka2;
            System.out.println(angka1);
        }else{
            System.out.println("simbol Yang Anda Masukkan Salah");
        }
    }
}
