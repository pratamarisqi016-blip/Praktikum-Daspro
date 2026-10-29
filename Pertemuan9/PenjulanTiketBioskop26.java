// Harga tiket = 40000 + (P mod 6) × 2000 = 44.000 gantikan Rp50.000 pada soal
// Syarat diskon pertama = lebih dari (3 + (P mod 3)) tiket, dengan diskon (8 + (P mod 5))% = 9% gantikan "lebih dari 4 tiket, diskon 10%"
// Syarat diskon kedua = lebih dari (8 + (P mod 4)) tiket, dengan diskon (15 + (P mod 4))% = 17 gantikan "lebih dari 10 tiket, diskon 15%"

package Pertemuan9;
import java.util.Scanner;
public class PenjulanTiketBioskop26 {
    public static void main(String[] args) {
        Scanner risqi = new Scanner(System.in);
        int jumlah;
        int totalTiket = 0;
        int harga = 44000;
        double totalUang = 0;
    
    while (true) {
        System.out.print("Jumlah tiket (0 untuk selesai): ");
        jumlah = risqi.nextInt();

    if (jumlah < 0) {
        System.out.println("Jumlah tidak boleh negatif!");
        continue;

    }
    if (jumlah == 0) {
        break;
    }
    double bayar = jumlah * harga;
    
    if (jumlah > 3) {
        bayar = bayar - (bayar * 9 / 100);
    } else if (jumlah > 9) {
        bayar = bayar - (bayar * 17 / 100);
    }
    System.out.println("Total bayar: Rp" + bayar);
    
    totalTiket = totalTiket + jumlah;
    totalUang = totalUang + bayar;
}
    
    System.out.println("Total tiket terjual: " + totalTiket);
    System.out.println("Total penjualan: Rp" + totalUang);
    risqi.close();
    
}
}

