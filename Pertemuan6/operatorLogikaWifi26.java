package Pertemuan6;
import java.util.Scanner;
public class operatorLogikaWifi26 {
    public static void main(String[] args) {
        Scanner risqi = new Scanner(System.in);

        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.print( "Apakah penggunaan mahasiswa? true/false); ");
        mahasiswa = risqi.nextBoolean();

        System.out.print( "Apakah pengguna dosen? (true/false); ");
        dosen = risqi.nextBoolean();
        
        System.out.print( "Apakah akun sedang diblokir? (true/false); ");
        akunDiblokir = risqi.nextBoolean();

        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println( "Akses Wifi diberikan");
        } else {
            System.out.println( "akses Wifi ditolak");
        }
        risqi.close();


        }

    }
    

