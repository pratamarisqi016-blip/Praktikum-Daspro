package Pertemuan3;

import java.util.Scanner;

public class BiayaCetak {
    public static void main(String[] args) {
        Scanner risqi = new Scanner(System.in);
        final int biaya_per_lembar = 500;
        final int biaya_jilid = 5000;

        System.out.print("jumlah lembar : ");
        int x = risqi.nextInt();

        int totalBiaya = (x * biaya_per_lembar) + biaya_jilid;
        
       
        System.out.println("totalBiaya yang harus dibayar: Rp." + totalBiaya);
        risqi.close();
        }
    }
