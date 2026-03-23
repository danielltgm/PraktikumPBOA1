/*
 * Nama File   : MBangunDatar.java
 * Deskripsi   : program utama untuk menguji class BangunDatar
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 22/03/2026 - 23.23
 */

public class MBangunDatar {

    public static void main(String[] args) {

        Persegi persegiUtama = new Persegi(4, "Biru", "Hitam");
        Lingkaran lingkaranUtama = new Lingkaran(14, "Pink", "Hitam");

        persegiUtama.printInfo();
        lingkaranUtama.printInfo();

        System.out.println("Keliling Persegi   : " + persegiUtama.getKeliling());
        System.out.println("Luas Persegi       : " + persegiUtama.getLuas());

        System.out.println("Keliling Lingkaran : " + lingkaranUtama.getKeliling());
        System.out.println("Luas Lingkaran     : " + lingkaranUtama.getLuas());

        // BangunDatar B1 = new BangunDatar(); contoh yang gabisa karena dia abstract

        BangunDatar persegiBesar = new Persegi(10, "Biru", "Merah");
        Persegi persegiKecil = new Persegi(5, "Biru", "Merah");

        BangunDatar lingkaranA = new Lingkaran(7, "Biru", "Merah");
        Lingkaran lingkaranB = new Lingkaran(7, "Biru", "Merah");

        System.out.println("Apakah luas persegiBesar = persegiKecil : "
                + persegiBesar.isEqualLuas(persegiKecil));

        System.out.println("Apakah keliling lingkaranA = lingkaranB : "
                + lingkaranA.isEqualKeliling(lingkaranB));
    }
}