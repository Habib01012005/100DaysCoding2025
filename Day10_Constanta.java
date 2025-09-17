public class Day10_Constanta {
    public static void main(String[] args) {
        final int angka1 = 10;
        int angka2 = 20;

        System.out.println("Nilai angka1 : " + angka1);
        System.out.println("Nilai angka2 : " + angka2);
        
        //update variable
        // angka1 = 30; akan eror karna bersifat final/konstanta
        angka2 = 40;

        System.out.println("Nilai baru angka1 : " + angka1);
        System.out.println("Nilai baru angka2 : " + angka2);

        //angka1 tidak bisa diupdate karena dia adalah konstanta/tidak bisa diubah
    }
}
