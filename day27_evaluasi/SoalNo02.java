package day27_evaluasi;

import java.util.Scanner;

public class SoalNo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        a += b;
        b = a - b;
        a -= b;

        System.out.println(a + " " + b);
    }
}
