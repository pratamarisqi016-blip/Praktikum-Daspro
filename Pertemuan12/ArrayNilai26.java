// 60 + (26 mod 41)=60+26=86

package Pertemuan12;
import java.util.Scanner;
public class ArrayNilai26 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10]; 
        Scanner risqi = new Scanner(System.in); 
        
        for (int i = 0; i < nilaiAkhir.length; i++) { 
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": "); 
            nilaiAkhir[i] = risqi.nextInt(); 
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS"; 
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
        } 
        risqi.close();
    }
}
