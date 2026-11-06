package Pertemuan10;
import java.util.Scanner;
public class Star26 {
    public static void main(String[] args) {
        Scanner risqi = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n = ");
        int n = risqi.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        risqi.close();
    }
}
