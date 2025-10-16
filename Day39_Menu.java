import java.util.Scanner;

public class Day39_Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======Daftar Menu Makanan=====");
        System.out.println("1. Ayam Geprek \t 13.000");
        System.out.println("2. Mie Ayam \t 15.000");
        System.out.println("3. Mie Bakso \t 12.000");
        System.out.println("==============================");
        
        System.out.print("pilih Menu Yang Ingin Di-Pesan : ");
        int pilih = sc.nextInt();

        if(pilih == 1){
            System.out.println("Menu Yang Anda Pilih Ayam Geprek Rp.13.000");
        }else if(pilih == 2){
            System.out.println("Menu Yang Anda Pilih Mie Ayam \t Rp.15.000");
        }else if(pilih == 3){
            System.out.println("Menu Yang Anda Pilih Mie Bakso \t Rp.12.000");
        }else{
            System.out.println("Menu Yang Anda Pilih Tidak Ada Didalam Menu");
        }
    }
}
