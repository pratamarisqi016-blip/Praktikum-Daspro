package Pertemuan6;
import java.util.Scanner;

public class tugas2SeleksiAsistenNoPresensi {

    public static void main(String[] args) {

        Scanner risqi = new Scanner(System.in);

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        boolean aktif = risqi.nextBoolean();

        System.out.print("Apakah mendapat sanksi akademik? (true/false): ");
        boolean sanksi = risqi.nextBoolean();

        System.out.print("Masukkan nilai Dasar Pemrograman: ");
        int nilaiDP = risqi.nextInt();

        System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
        boolean sertifikat = risqi.nextBoolean();

        if (aktif && !sanksi) {

            if (nilaiDP >= 79 || sertifikat) {

                System.out.print("Masukkan nilai wawancara: ");
                int nilaiWawancara = risqi.nextInt();

                if (nilaiWawancara >= 72) {
                    System.out.println("Mahasiswa diterima sebagai asisten praktikum.");
                } else {
                    System.out.println("Mahasiswa gagal pada tahap wawancara.");
                    System.out.println("Alasan: nilai wawancara kurang dari 72.");
                }

            } else {
                System.out.println("Mahasiswa gagal pada tahap seleksi nilai Dasar Pemrograman.");
                System.out.println("Alasan: nilai Dasar Pemrograman kurang dari 79 dan tidak memiliki sertifikat kompetensi.");
            }

        } else {
            System.out.println("Mahasiswa gagal pada tahap seleksi awal.");

            if (!aktif && sanksi) {
                System.out.println("Alasan: mahasiswa tidak berstatus aktif dan sedang mendapat sanksi akademik.");
            } else if (!aktif) {
                System.out.println("Alasan: mahasiswa tidak berstatus aktif.");
            } else {
                System.out.println("Alasan: mahasiswa sedang mendapat sanksi akademik.");
            }
        }

        risqi.close();
    }
}
    

