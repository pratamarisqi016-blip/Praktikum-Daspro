package Pertemuan3;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner risqi = new Scanner(System.in);
        double harga,uang_muka,sisa_harga,cicilan_per_bulan,besar_bunga,bunga=0.02, total_cicilan_per_bulan;
        int lama_membayar ;
        System.out.println("Harga laptop: ");   
        harga = risqi.nextDouble();
        System.out.println("Uang muka: ");
        uang_muka= risqi.nextDouble();
        System.out.println("Lama cicilan: ");
        lama_membayar = risqi.nextInt();

        sisa_harga = harga-uang_muka;
        besar_bunga = sisa_harga* bunga;
        cicilan_per_bulan = sisa_harga/lama_membayar;
        total_cicilan_per_bulan = besar_bunga+cicilan_per_bulan;

        System.out.println("Cicilan per bulan = Rp. " +total_cicilan_per_bulan);
         
    }
}
