public class Day98_DeretanFibonacci {
    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;
        int n = 5;

        System.out.println(f1);
        System.out.println(f2);
        int fn;

        for (int i = 1; i <=n; i++) {
            fn = f2 + f1;
            f1 = f2;
            f2 = fn;

            System.out.println(fn);

        }
    }
}
