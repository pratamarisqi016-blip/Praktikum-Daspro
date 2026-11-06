// (uji wajib) n 6 + (26 mod 5) = 7
package Pertemuan10;
import java.util.Scanner;
public class Tugas1_26 {
    public static void main(String[] args) {
        Scanner risqi = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        int n = risqi.nextInt();

        if (n < 1) {
            System.out.println("Nilai n harus lebih dari 1. : ");
        } else {
            int totalTercetak = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                    totalTercetak++;
                }
                System.out.println();
            }
            System.out.println("Total angka Tercetak Adalah : " + totalTercetak);
        }
        risqi.close();
    }
}
