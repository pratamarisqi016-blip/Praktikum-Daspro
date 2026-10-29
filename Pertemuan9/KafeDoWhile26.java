// hargaKopi = 10000 + (P mod 5) × 1000 = 11000 gantikan Rp12.000 pada soal
// hargaTeh = 5000 + (P mod 4) × 1000 = 7000 gantikan Rp7.000 pada soal
// hargaRoti = 15000 + (P mod 6) × 1000 = 17000 gantikan Rp20.000 pada soal

package Pertemuan9;
import java.util.Scanner;
public class KafeDoWhile26 {

    public static void main(String[] args){
        Scanner risqi = new Scanner(System.in);
        
        int kopi, teh, roti, totalHarga;
        String namaPelanggan;
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;
        do {
        System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar) : ");
            namaPelanggan = risqi.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = risqi.nextInt();
            System.out.print("Jumlah teh: ");
            teh = risqi.nextInt();
            System.out.print("Jumlah roti: ");
            roti = risqi.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            risqi.nextLine();
        
        } while (true);

        System.out.println( "Semua transaksi selesai. ");
        risqi.close();
    }
}

    



         

            
            
            


        
    
    

