package Pertemuan5;

import java.util.Scanner;

public class TugasAntrean26 {
    public static void main(String[] args ) {
        Scanner risqi = new java.util.Scanner(System.in);

        System.out.println( "Ketik 1 untuk Legalisir Ijazah");
        System.out.println( "Ketik 2 untuk Surat Keterangan Aktif Kuliah");
        System.out.println( "Ketik 3 untuk Pembayaran UKT");
        System.out.println( "Ketik 4 untuk Pengajuan Cuti Akademik");
        System.out.print( "Pilih Menu");
        int loket = risqi.nextInt();
        switch (loket) {
            case 1:
                System.out.println("Legalisir Ijazah");
                break;
            case 2:
                System.out.println("Surat Keterangan Aktif Kuliah");
                break;
            case 3:
                System.out.println("Pembayaran UKT");
                break;
            case 4:
                System.out.println("Pengajuan Cuti Akademik");
                break;
            default:
                System.out.println("Kode Layanan tidak tersedia");
                break;
        }
        
        risqi.close();
    }

    
}
