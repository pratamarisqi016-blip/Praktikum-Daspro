package Pertemuan5;

import java.util.Scanner;

public class Tugas2_26 {

    public static void main(String[] args) {
        Scanner risqi = new java.util.Scanner(System.in);

        System.out.print("Masukkan Jumlah SKS : ");
        int jumlahSks = risqi.nextInt();

        if (jumlahSks > 24) {
            System.out.println( "Malebihi Batas");
        } else {
            System.out.println( "KRS valid");
        }
        
        risqi.close();
    } 
}
    

