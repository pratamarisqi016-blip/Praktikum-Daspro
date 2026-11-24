// Percobaan 4 Bagian A (uji wajib tambahan) 
// key 50 + (26 mod 50)=50+26=76

package Pertemuan12;
import java.util.Scanner;
public class SearchNilai26 {
    public static void main(String[] args) {
        Scanner risqi = new Scanner (System.in);

        int[] nilai = {78, 65, 90, 55, 88, 72}; 
        int key = 76; 
        boolean ditemukan = false; 
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i); 
                ditemukan = true; 
                break; 
            }
        } 
        if (!ditemukan) {
            System.out.println("Nilai " + key + " tidak ditemukan."); 
        }
        risqi.close();
    }
}
