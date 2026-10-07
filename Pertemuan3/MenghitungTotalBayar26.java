package Pertemuan3;
import java.util.Scanner;
public class MenghitungTotalBayar26 {
  public static void main(String[] args) {
    Scanner risqi = new Scanner(System.in);

    double harga;
    double potongan;
    double jumlahbayar;
    double diskon = 0.15;

    System.out.println("Masukkan Harga : ");
    harga = risqi.nextInt();

    potongan = diskon*harga;
    jumlahbayar = harga-potongan;

    System.out.println("Jumlah yang harus dibayar adalah. " + jumlahbayar);
  }
}
