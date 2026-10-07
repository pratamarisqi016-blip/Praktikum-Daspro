package Pertemuan6;

import java.util.Scanner;

import java.util.Scanner;

public class DiskonTokoBuku26 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int diskon;
        String kamus, novel;

        System.out.print("Masukkan jenis buku (kamus/novel): ");
        String jenisBuku = sc.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = sc.nextInt();

        if (jenisBuku.equals("kamus")) {
            if (jumlahBuku > 2) {
                diskon = 9;
            } else {
                diskon = 2;
            }
        } else if (jenisBuku.equals("novel")) {
            if (jumlahBuku > 3) {
                diskon = 7;
            } else {
                diskon = 3;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 3;
            } else {
                diskon = 3;
            }
        }
        System.out.println("Diskon yang didapat: " + diskon + "%");
    }
}