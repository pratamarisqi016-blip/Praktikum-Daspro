package Pertemuan10;
import java.util.Scanner;
public class Triangle26 {
    public static void main(String[] args) {
        Scanner risqi = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = risqi.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 5;
            while (j >= i) {
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
        }
        risqi.close();
    }
}
