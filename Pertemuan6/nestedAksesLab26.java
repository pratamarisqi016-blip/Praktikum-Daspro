package Pertemuan6;
import java.util.Scanner;

public class nestedAksesLab26 {

    public static void main(String[] args) {
    Scanner risqi = new Scanner(System.in);
    
    boolean mahasiswaAktif;
    boolean sedangDisanksi;
    boolean punyaIzinDosen;
    boolean asistenLab;

    System.out.println( "Apakah mahasiswa aktif? (true/false)");
    mahasiswaAktif = risqi.nextBoolean();
    
    System.out.println( "Apakah sedang disanksi");
    sedangDisanksi = risqi.nextBoolean();
    
    System.out.println( "Apakah sudah izin dosen? (true/false)");
    punyaIzinDosen = risqi.nextBoolean();
    
    System.out.println( "Apakah sudah diberikan asisten lab? (true/false)");
    asistenLab = risqi.nextBoolean();

    if (mahasiswaAktif && !sedangDisanksi) {
        if (punyaIzinDosen || asistenLab) {
            System.out.println( "Akses laboratorium diberikan");
        } else {
                System.out.println( "Akses ditolak: membutuhkan izin dosen atau asisten lab");
        }
    } else {
        System.out.println( "Akses ditolak: status mahasiswa tidak memenuhi syarat");
    }
    risqi.close();
}
}







        
    

