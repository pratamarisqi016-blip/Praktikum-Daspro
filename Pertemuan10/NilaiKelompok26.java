package Pertemuan10;
import java.util.Scanner;
public class NilaiKelompok26 {
   public static void main(String[] args) {
    Scanner risqi = new Scanner(System.in);

    System.out.print("Masukkan jumlah kelompok : ");
    int jumlahKelompok = risqi.nextInt();
    System.out.print("Masukkan jumlah penilai : ");
    int jumlahPenilai = risqi.nextInt();

    if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
        System.out.println("Jumlah kelompok dan penilai harus > 0.");
    } else {
        // langkah 3 sampai 8 ditulis di dalam blok else ini
        int nomorKelompok = 1; // penghitung outer loop
        double rataTertinggi = -1; // -1 agar kelompok pertama pasti tercatat
        int kelompokTerbaik = 0;
        
        while (nomorKelompok <= jumlahKelompok) {
            System.out.println("Kelompok " + nomorKelompok);
            double totalNilai = 0;

            // inner loop penilai (langkah 5)

            // hitung rata-rata dan cek kelompok terbaik (langkah 6-7)

        for (int j = 1; j <= jumlahPenilai; j++) {
            int nilai;
            do {
                System.out.print(" Nilai dari Penilai " + j + ": ");
                nilai = risqi.nextInt();
                if (nilai < 0 || nilai > 100) {
                    System.out.println(" Nilai harus 0-100. Ulangi input!");
                }
            } while (nilai < 0 || nilai > 100);
            totalNilai += nilai;
        }
        
        double rataNilai = totalNilai / jumlahPenilai;
        System.out.println("Kelompok " + nomorKelompok + ": nilai rata-rata = " + rataNilai);

        if (rataNilai > rataTertinggi) {
            rataTertinggi = rataNilai;
            kelompokTerbaik = nomorKelompok;
            // lengkapi: perbarui rataTertinggi dan kelompokTerbaik
        }
        System.out.println("===============================");
        nomorKelompok++;
    }
        System.out.println("==============================");
        System.out.println("Kelompok terbaik : " + kelompokTerbaik);
        System.out.println("Rata-rata tertinggi : " + rataTertinggi); 
    }
    risqi.close();
   } 
}
