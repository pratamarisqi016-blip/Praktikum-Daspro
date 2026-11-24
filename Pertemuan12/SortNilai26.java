// elemen dasar array (B) 20 + (26 mod 60)=20+26=46 
// WAJIB ubah array nilai menjadi {46, 59, 36, 74, 24, 49}

package Pertemuan12;
import java.util.Arrays;
public class SortNilai26 {
    public static void main(String[] args) {
        
        int[] nilai = {46, 59, 36, 74, 24, 49};
        for (int i = 0; i < nilai.length - 1; i++) {
            for (int j = 0; j < nilai.length - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp; 
                } 
            }
        }  
        System.out.println(Arrays.toString(nilai)); 
    }
}
