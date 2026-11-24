// bil[0], bil[1], bil[2], bil[3]
// P ; P+8 ; −(1+(P mod 7)) ; 20+(P mod 15)
// 26;26+8=34;-(26 mod 7)=(4);20+(26 mod 15)=31

package Pertemuan12;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayBilangan26 {
    public static void main(String[] args) {
        Scanner risqi = new Scanner (System.in);
        int[] bil = new int[4]; 
        bil[0] = 26; 
        bil[1] = 34; 
        bil[2] = 4; 
        bil[3] = 31; 
        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]); 
        }
        for (int nilai : bil) {
            System.out.println(nilai); 
        }
        System.out.println(Arrays.toString(bil)); 
        risqi.close();
    }
}