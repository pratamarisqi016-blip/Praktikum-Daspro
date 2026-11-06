// n (uji ke-1) 3 + (26 mod 5) = 4
// n (uji ke-2) 9 + (26 mod 5) = 10
// (Pertanyaan 1 & 2) n 4 + (26 mod 4) = 6
// (Pertanyaan 3) n 10 + (26 mod 6) = 12

package Pertemuan10;
import java.util.Scanner;
public class Star26 {
    public static void main(String[] args) {
        Scanner risqi = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n = ");
        int n = risqi.nextInt();

        for (int i = 2; i <= n; i += 2) {
            System.out.print("*");
        }
        System.out.println();
        risqi.close();
    }
}
