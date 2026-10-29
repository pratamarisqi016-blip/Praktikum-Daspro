//  Tarif parkir mobil = 2500 + (P mod 6) × 250 per jam = 3000 gantikan Rp3.000 pada soal
// Tarif parkir motor = 1500 + (P mod 6) × 250 per jam = 2000 gantikan Rp2.000 pada soal
package Pertemuan9;
import java.util.Scanner;
public class ParkirKendaraan26 {
    
    public static void main(String[] args) {
        Scanner risqi = new Scanner(System.in);
        int jenis = 1, durasi, total = 0;
                               
        while (jenis != 0) {
            System.out.println(""); 
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Keluar dari program");
            System.out.println("------------------------");
            System.out.print("Masukkan jenis kendaraan (1, 2, atau 0): ");
            jenis = risqi.nextInt();

            if (jenis == 0) {
                System.out.print("Program berakhir");
                break;
            }

            if (jenis == 1 || jenis ==2) {
                System.out.print("Masukkan lama parkir (jam): ");
                durasi = risqi.nextInt();
                if ( durasi <0) {
                    System.out.print("Durasi tidak valid.");
                    continue;
                }
                if (jenis == 1){
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;   
                }
                System.out.print("Total parkir: " + total);
            } else {
                System.out.print("Jenis kendaraan tidak valid! 1,2 atau 0 untuk mengakhiri program.");
            }
        }
        System.out.print("PARKIR HARI INI ");
        System.out.print("Total Pembayaran Parkir: Rp " + total);
        risqi.close();
    }
}
 
    

