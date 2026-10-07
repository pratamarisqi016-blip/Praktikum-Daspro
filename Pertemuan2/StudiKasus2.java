package Pertemuan2;

public class StudiKasus2 {
    public static void main(String[] args) {
        double panjang =50;
        double lebar = 15;
        double diameterKolam = 3;
        double sisiTaman = 1;
        double phi = 3.14;

        double luasTanah = panjang * lebar;
        double jariJari = diameterKolam / 2;
        double luasKolam = phi * jariJari * jariJari;
        double luasTaman = sisiTaman * sisiTaman;
        double luasTidakDigunakan = luasTanah - luasKolam - luasTaman;

        System.out.println("Luas tanah yang tidak digunakan: "
                + luasTidakDigunakan + " m2");
    }
}

