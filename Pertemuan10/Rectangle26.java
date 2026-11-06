package Pertemuan10;
import java.util.Scanner;
public class Rectangle26 {
   public static void main(String[] args) {
    Scanner risqi = new Scanner(System.in);

    System.out.print("Masukkan jumlah baris: ");
    int baris = risqi.nextInt();
    System.out.print("Masukkan jumlah kolom: ");
    int kolom = risqi.nextInt();

    for (int i = 1; i <= baris; i++) {
        for (int j = 1; j <= kolom; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    risqi.close();
   } 
}
