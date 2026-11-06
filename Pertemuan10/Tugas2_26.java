// (uji wajib) n 5 + (26 mod 4) = 7
package Pertemuan10;
import java.util.Scanner;
public class Tugas2_26 {
    public static void main(String[] args) {
        Scanner risqi = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = risqi.nextInt();

        if (n < 3) {
            System.out.println("Nilai n minimal 3.");
        } else {
            int jumlah = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int hasil = i * j;
                    System.out.printf("%4d", hasil);
                    jumlah += hasil;
                }
                System.out.println();
            }
            System.out.println("Jumlah seluruh angkanya : " + jumlah);
        }
        risqi.close();
    }
}
