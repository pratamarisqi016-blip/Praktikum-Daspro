package Pertemuan6;
import java.util.Scanner;
public class nestedUjianSkripsi26 {
    public static void main(String[] args){
        Scanner risqi = new Scanner(System.in);
        String pesan;
         
        System.out.println( "Apakah mahasiswa sudah bebas kompen? (Ya/Tidak) : ");
        String bebasKompen = risqi.nextLine().trim();
        
        System.out.println( "Masukkan jumlah log bimbingan Pembimbing 1 : ");
        int bimbinganP1 = risqi.nextInt();
        
        System.out.println( "Masukkan jumlah log bimbingan Pembimbing 2 : ");
        int bimbinganP2 = risqi.nextInt();

        if (bebasKompen.equalsIgnoreCase( "Ya")) {
            if(bimbinganP1 >=7 && bimbinganP2 >=5){
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            }else if (bimbinganP1 >=7 && bimbinganP2 >=5) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            }else if (bimbinganP1 < 7) {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            } else {
                pesan = "Gagal! log bimbingan P2 belum mencapai 4 kali";
            }
        } else { 
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
        risqi.close();          


            }
        }



    

