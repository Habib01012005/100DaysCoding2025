import java.util.Scanner;

public class Day79_BuatAkun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Silahkan Buat Akun Anda");

        System.out.print("Email : ");
        String email = sc.nextLine();
        
        System.out.print("Password : ");
        String password = sc.nextLine();
        
        System.out.println("Selamat Anda Sudah Membuat Akun");
        System.out.println();
        System.out.println("=========Silahan Login=========");
        
        for (int i = 1; i <= 20; i++) {
            System.out.print("Email : ");
            String email2 = sc.nextLine();
            System.out.print("Password : ");
            String password2 = sc.nextLine();
            
            if (email2.equals(email) && password2.equals(password)) {
                System.out.println("Email dan Password Anda udah Benar");
                System.out.println("=====Selamat Anda Sudah Login=====");
                break;
            }else if(email2.equals(email)) {
                System.out.println("Password Yang Anda Masukkan Salah");
            }else if(password2.equals(password)){
                System.out.println("Email Yang Anda Masukkan Salah");
            }else{
                System.out.println("Email Dan Password Yang Anda Masukkan Salah");
                System.out.println("===Masukkan Ulang Email Dan Password-nya===");
            }
        }
    }
}
