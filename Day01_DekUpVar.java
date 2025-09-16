public class Day01_DekUpVar {
    public static void main(String[] args) {
        //Deklarasi
        String nama;
        char kelas;
        int umur;
        
        //inisialisasi
        nama = "Habib";
        kelas = 'A';
        umur = 17;

        //output
        System.out.println("Nama Saya : " + nama);
        System.out.println("Kelas Saya : " + kelas);
        System.out.println("Umur Saya : " + umur + " Tahun");
        System.out.println("");
        
        //update variable
        nama = "Habib Baru";
        kelas = 'B';
        umur = 20;

        System.out.println("Nama Baru : " + nama);
        System.out.println("Kelas Baru : " + kelas);
        System.out.println("Umur baru : " + umur + " thn");

    }
}
