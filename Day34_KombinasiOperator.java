public class Day34_KombinasiOperator {
    public static void main(String[] args) {
        int a = 27;
        int b = 9;

        // Operator Aritmatika
        int aritmatika = ((a + b)/2)%4;
        System.out.println("Hasil Aritmatika: " + aritmatika);
        
        // Operator Penugasan
        int penugasan = (a += b)%2 + b--;
        System.out.println("Hasil Penugasan : " + penugasan);

        // Operator Perbandingan dan Logika
        boolean perLog = (aritmatika >= penugasan) || (a != b);
        System.out.println("Hasil Perbandingan dan Logika: " + perLog);

    }
}
