//Jumlah mahasiswa (batas perulangan FOR) = 8 + (26 mod 5)= 9 → gantikan angka 10 pada soal
// Batas kelulusan pada Pertanyaan no. 4 (modifikasi kode) = 55 + (26 mod 11)= 59 → gantikan angka 60 pada soal

package Pertemuan9;
import java.util.Scanner;
public class SiakadFor26 {
       public static void main(String[] args) {
        Scanner risqi = new Scanner(System.in);
        
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidaklulus = 0;
        for (int i =1; i <=9; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
                nilai = risqi.nextDouble();
                if (nilai > tertinggi) {
                    tertinggi = nilai;
                }
                if (nilai < terendah) {
                    terendah = nilai;
                }
                if (nilai >= 65) {
                    lulus++;
                } else {
                    tidaklulus++;
                }
        }
         System.out.println("Nilai tertinggi : " + tertinggi);
         System.out.println("Nilai terendah : " + terendah);
         System.out.println("Jumlah Mahasiswa lulus : " + lulus);
         System.out.println("Jumlah Mahasiswa tidak lulus : " + tidaklulus);
         
    }   
 }

    

