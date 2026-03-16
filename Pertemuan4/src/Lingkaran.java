/*
 * Nama File   : Lingkaran.java
 * Deskripsi   : berisi atribut dan method dalam class Lingkaran
 *               yang merupakan turunan dari class BangunDatar
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 10/03/2026 - 11.08 PM
 */

public class Lingkaran extends BangunDatar {

    /*************** ATRIBUT *****************/
    private Double jari; // atribut yang merepresentasikan jari-jari lingkaran

    /*************** KONSTRUKTOR *****************/

    // Konstruktor tanpa parameter
    public Lingkaran() {
        setJmlSisi(0); // lingkaran tidak memiliki sisi
    }

    // Konstruktor dengan parameter
    public Lingkaran(Double jari, String warna, String border) {
        super(0, warna, border); // memanggil konstruktor dari BangunDatar
        this.jari = jari;
    }

    /*************** GETTER *****************/

    // Mengambil nilai jari-jari
    public Double getJari() {
        return jari;
    }

    /*************** SETTER *****************/

    // Mengubah nilai jari-jari
    public void setJari(Double jari) {
        this.jari = jari;
    }

    /*************** METHOD *****************/

    // Method untuk menghitung luas lingkaran
    public Double getLuas() {
        return Math.PI * jari * jari;
    }

    // Method untuk menghitung keliling lingkaran
    public Double getKeliling() {
        return 2 * Math.PI * jari;
    }

    // Method untuk menampilkan informasi objek
    @Override
    public void printInfo() {
        super.printInfo(); // memanggil method printInfo() dari BangunDatar
        System.out.println("Jari-jari : " + jari);
    }
}