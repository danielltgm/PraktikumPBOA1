/*
 * Nama File   : BangunDatar.java
 * Deskripsi   : berisi atribut dan method dalam class abstrak BangunDatar
 *               yang menjadi parent bagi kelas turunan seperti Persegi dan Lingkaran
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 21/03/2026 - 13.52
 */

public abstract class BangunDatar {

    /*************** ATRIBUT *****************/
    private int jmlSisi;   // atribut untuk menyimpan jumlah sisi
    private String warna;  // atribut untuk menyimpan warna bangun
    private String border; // atribut untuk menyimpan jenis border

    /*************** KONSTRUKTOR *****************/

    // Konstruktor tanpa parameter
    public BangunDatar() {
    }

    // Konstruktor dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }

    /*************** GETTER *****************/

    // Mengambil jumlah sisi
    public int getJmlSisi() {
        return jmlSisi;
    }

    // Mengambil warna
    public String getWarna() {
        return warna;
    }

    // Mengambil border
    public String getBorder() {
        return border;
    }

    /*************** SETTER *****************/

    // Mengubah jumlah sisi
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    // Mengubah warna
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Mengubah border
    public void setBorder(String border) {
        this.border = border;
    }

    /*************** METHOD ABSTRAK *****************/

    // Method abstrak untuk menghitung luas
    public abstract double getLuas();

    // Method abstrak untuk menghitung keliling
    public abstract double getKeliling();

    /*************** METHOD LAIN *****************/

    // Membandingkan luas dengan objek BangunDatar lain
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    // Membandingkan keliling dengan objek BangunDatar lain
    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }

    // Menampilkan informasi objek
    public void printInfo() {
        System.out.println("Jumlah Sisi : " + jmlSisi);
        System.out.println("Warna       : " + warna);
        System.out.println("Border      : " + border);
    }
}