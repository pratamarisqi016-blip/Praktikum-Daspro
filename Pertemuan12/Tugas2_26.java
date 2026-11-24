// Tugas 2 (uji wajib) jumlah item dipesan 2 + (26 mod 4)=2+0=4
// Tugas 2 (uji wajib) indeks menu yang wajib dipesan 26 mod 7=5+_

package Pertemuan12;
import java.util.Scanner;
public class Tugas2_26 {
    public static void main(String[] args) {
        Scanner risqi = new Scanner(System.in);

        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate Ice" };
        int[] harga = { 15000, 13000, 10000, 12000, 8000, 18000, 20000 };

        System.out.println("Daftar Menu :");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("[" + i + "] " + menu[i] + " - Rp " + harga[i]);
        }
        System.out.println();

        System.out.print("Masukkan nama menu yang ingin dicari : ");
        String cariMenu = risqi.nextLine();

        int letak = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu.trim())) {
                letak = i;
                break;
            }
        }
        if (letak != -1) {
            System.out.println("Menu " + menu[letak] + " tersedia dengan harga Rp " + harga[letak]);
        } else {
            System.out.println("Maaf, menu " + cariMenu + " tidak tersedia");
        }
        System.out.println();
        System.out.print("Masukkan jumlah item yang ingin dipesan : ");
        int jumlahItem = risqi.nextInt();

        if (jumlahItem > 0) {
            String[] daftarPesanan = new String[jumlahItem];
            int[] hargaPesanan = new int[jumlahItem];
            int totalBiaya = 0;

            for (int i = 0; i < jumlahItem; i++) {
                int indeksMenu;
                do {
                    System.out.print("Masukkan indeks menu pesanan ke-" + (i + 1)
                            + " (0-" + (menu.length - 1) + ") : ");
                    indeksMenu = risqi.nextInt();

                    if (indeksMenu < 0 || indeksMenu >= menu.length) {
                        System.out.println("Indeks tidak valid. Silakan input ulang!");
                    }
                } while (indeksMenu < 0 || indeksMenu >= menu.length);

                daftarPesanan[i] = menu[indeksMenu];
                hargaPesanan[i] = harga[indeksMenu];
                totalBiaya += hargaPesanan[i];
            }
            System.out.println();
            System.out.println("--- Detail Pesanan ---");
            for (int i = 0; i < daftarPesanan.length; i++) {
                System.out.println(daftarPesanan[i] + " - Rp " + hargaPesanan[i]);
            }
            System.out.println("Total biaya : Rp " + totalBiaya);
        } else {
            System.out.println("Jumlah item harus lebih dari 0");
        }

        risqi.close();
    }
}