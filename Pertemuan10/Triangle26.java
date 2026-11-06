package Pertemuan10;
import java.util.Scanner;
public class Triangle26 {
    public static void main(String[] args) {
        Scanner risqi = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = risqi.nextInt();

        int i = 0;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
        risqi.close();
    }
}
