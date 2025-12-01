public class Day85_AngkaTerbesarArray {
    public static void main(String[] args) {
        int [] angka = {14, 4, 29, 10};

        int max = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if(angka[i] > max){
                max = angka[i];
            }
        }
        System.out.println("Angka Terbesar Array : "+max);
    }
}
