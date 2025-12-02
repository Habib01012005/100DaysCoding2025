public class Day86_AngkaTerkecilArray {
    public static void main(String[] args) {
        int [] angka = {19, 13, 5, 20};

        int min = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
        }
        System.out.println("Angka Terkecil Array = "+min);
    }
}
