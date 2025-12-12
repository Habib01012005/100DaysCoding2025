public class Day96_AritmatikaMethod {
    public static void main(String[] args) {
        System.out.println(Penjumlahan(3, 5));
        System.out.println(Pengurangan(5, 3));
        System.out.println(Pembagian(15, 5));
        System.out.println(Perkalian(3, 5));
    }
    static int Penjumlahan(int a, int b){
        return a + b;
    }
    static int Pengurangan(int a, int b){
        return a - b;
    }
    static int Pembagian(int a, int b){
        return a / b;
    }
    static int Perkalian(int a, int b){
        return a * b;
    }
}
