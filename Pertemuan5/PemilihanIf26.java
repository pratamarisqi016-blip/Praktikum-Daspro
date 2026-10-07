package Pertemuan5;

import java.util.Scanner;
 
public class PemilihanIf26{
 public static void main(String[] args) {
    Scanner risqi = new Scanner(System.in);

    System.out.println( "--- cetak KRS SIAKAD ---");
    System.out.print( "Apakah UKT sudah lunas? (true/false): ");
    boolean uktLunas = risqi.nextBoolean();
    
    if (uktLunas){
    System.out.println( "Pembayaran UKT Terverifikasi");
    System.out.println( "Silakan cetak KRS dan minta tanda tangan DPA");
    }else{
        System.out.println( "Regristrasi ditolak. Silahkan lunasi UKT terlebih dahulu");
    }
    risqi.close();
}
    
}
