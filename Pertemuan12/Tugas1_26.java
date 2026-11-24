// Tugas 1 (uji wajib) jumlah nilai mahasiswa 5 + (26 mod 11)=5+2=9
// Tugas 1 (uji wajib) salah satu nilai yang diinput 26 mod 100=26

package Pertemuan12;
import java.util.Scanner;
public class Tugas1_26 {
    public static void main(String[] args) {
        Scanner risqi = new Scanner (System.in);

        int jumlahMhs, total = 0, maks = -1, min = 100;

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput :");
        jumlahMhs = risqi.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            do {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " (0-100) :");
                nilaiMhs[i] = risqi.nextInt();

                if (nilaiMhs[i] < 0 || nilaiMhs[i] > 100) {
                    System.out.println("Nilai tidak valid.Input ulang!");
                }
            } while (nilaiMhs[i] < 0 || nilaiMhs[i] > 100);
            if (nilaiMhs[i] > maks) {
                maks = nilaiMhs[i];
            }
            if (nilaiMhs[i] < min) {
                min = nilaiMhs[i];
            }
            total += nilaiMhs[i]; 
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            String status = (nilaiMhs[i] > 50) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + " | Nilai: " + nilaiMhs[i] + " | Status: " + status);
        }
        double rata2 = (double) total / jumlahMhs;  

        System.out.println("Banyak data     : " + jumlahMhs);
        System.out.println("Total nilai     : " + total);
        System.out.println("Rata-rata nilai : " + rata2);
        System.out.println("Nilai tertinggi : " + maks);
        System.out.println("Nilai terendah  : " + min);

    }
}
    
        

