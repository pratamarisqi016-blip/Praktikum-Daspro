//  (uji wajib) jumlahToko 2 + (26 mod 3) = 4
package Pertemuan10;
import java.util.Scanner;
public class Tugas3_26 {
    public static void main(String[] args) {
        Scanner risqi = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah toko : ");
        int jumlahToko = risqi.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1");
        } else {
            int totalSemuaBarang = 0;
            int barangTerbanyak = -1;
            int tokoTerbanyak = 0;
            String rekap = "";

            for (int i = 1; i <= jumlahToko; i++) {
                System.out.println("Toko ke- " + i);
                int jumlahPelanggan;
                do {
                    System.out.print(" Jumlah pelanggan : ");
                    jumlahPelanggan = risqi.nextInt();
                    if (jumlahPelanggan < 0){
                        System.out.println("Tidak boleh negatif. Input kembali");
                    }
                } while (jumlahPelanggan < 0);

                int totalBarangToko = 0;
                for (int j = 1; j <= jumlahPelanggan; j++) {
                    int barang;
                    do {
                       System.out.print("Barang pelanggan ke-" + j + ": "); 
                       barang = risqi.nextInt();
                       if (barang < 0) {
                        System.out.println(" Barang tidak boleh negatif. Input kembali");
                       }
                    } while (barang < 0);
                    totalBarangToko += barang;
                }
                rekap += "Toko " + i + " - pelanggan: " + jumlahPelanggan + " Total Barang: " + totalBarangToko + "\n";
                totalSemuaBarang += totalBarangToko;
                if (totalBarangToko > barangTerbanyak) {
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = i;
                }
            }
            System.out.println();
            System.out.println(rekap);
            System.out.println("Total barang seluruh toko " + totalSemuaBarang);
            System.out.println("Toko dengan barang terbanyak : " + tokoTerbanyak);
        }
        risqi.close();
    }
}
