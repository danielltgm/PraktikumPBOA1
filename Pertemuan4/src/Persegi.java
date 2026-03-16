/*
 * Nama File   : Persegi.java
 * Deskripsi   : berisi atribut dan method dalam class Persegi
 *               yang merupakan turunan dari class BangunDatar
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 11/03/2026 - 00.12 AM
 */

public class Persegi extends BangunDatar {

    /*************** ATRIBUT *****************/
    private Double sisi; // atribut yang merepresentasikan panjang sisi persegi

    /*************** KONSTRUKTOR *****************/

    // Konstruktor tanpa parameter
    public Persegi() {
        setJmlSisi(4); // persegi memiliki 4 sisi
    }

    // Konstruktor dengan parameter
    public Persegi(Double sisi, String warna, String border) {
        super(4, warna, border); // memanggil konstruktor dari BangunDatar
        this.sisi = sisi;
    }

    /*************** GETTER *****************/

    // Mengambil nilai sisi
    public Double getSisi() {
        return sisi;
    }

    /*************** SETTER *****************/

    // Mengubah nilai sisi
    public void setSisi(Double sisi) {
        this.sisi = sisi;
    }

    /*************** METHOD *****************/

    // Method untuk menghitung luas persegi
    public Double getLuas() {
        return sisi * sisi;
    }

    // Method untuk menghitung keliling persegi
    public Double getKeliling() {
        return 4 * sisi;
    }

    // Method untuk menghitung diagonal persegi
    public Double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    // Method untuk menampilkan informasi objek
    @Override
    public void printInfo() {
        super.printInfo(); // memanggil method printInfo() dari BangunDatar
        System.out.println("Sisi : " + sisi);
    }
}