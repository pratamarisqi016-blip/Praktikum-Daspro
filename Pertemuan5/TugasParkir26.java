package Pertemuan5;

import java.util.Scanner;

public class TugasParkir26 {
    public static void main(String[] args) {
        Scanner risqi = new java.util.Scanner(System.in);
        
        int jam;
        int tarif;
        
        System.out.print( "Masukkan lama jam parkir : ");
        jam = risqi.nextInt();

        if (jam <= 2) {
            tarif =2000;
        } else {
            tarif = 2000 + (jam = 2) * 1000;

        } 
        System.out.println("Tarif parkir :" + tarif);

        risqi.close();
    }
    
}
