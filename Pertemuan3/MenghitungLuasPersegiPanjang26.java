package Pertemuan3;
import java.util.Scanner;

public class MenghitungLuasPersegiPanjang26 {
    public static void main(String[] args) {
    Scanner risqi = new Scanner(System.in);
    int panjang;
    int lebar;
    int luas;
    System.out.println("Masukkan Panjang: ");
    panjang=risqi.nextInt();
    System.out.println("Masukkan Lebar: ");
    lebar=risqi.nextInt();
    luas=panjang*lebar;
    System.out.println("luas persegi adalah " + luas);

    }
}
