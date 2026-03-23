/*
 * Nama File   : Lingkaran.java
 * Deskripsi   : berisi atribut dan method dalam class Lingkaran
 *               yang merupakan turunan dari class BangunDatar
 *               serta mengimplementasikan interface IResize
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 21/03/2026 - 11.49
 */

public class Lingkaran extends BangunDatar implements IResize {

    /*************** ATRIBUT *****************/
    private double jari; // atribut untuk menyimpan nilai jari-jari lingkaran

    /*************** KONSTRUKTOR *****************/

    // Konstruktor tanpa parameter
    public Lingkaran() {
        setJmlSisi(1); // lingkaran punya 1 sisi doang
    }

    // Konstruktor dengan parameter
    public Lingkaran(double diameter, String warna, String border) {
        super(1, warna, border); // memanggil konstruktor parent
        this.jari = diameter / 2; // mengubah diameter menjadi jari-jari
    }

    /*************** GETTER *****************/

    // Mengambil nilai jari-jari
    public double getJari() {
        return jari;
    }

    /*************** SETTER *****************/

    // Mengubah nilai jari-jari
    public void setJari(double jari) {
        this.jari = jari;
    }

    /*************** METHOD *****************/

    // Method untuk menghitung luas lingkaran
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    // Method untuk menghitung keliling lingkaran
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    /*************** IMPLEMENTASI INTERFACE IResize *****************/

    // Method untuk memperbesar ukuran sebesar 10%
    @Override
    public void zoomIn() {
        this.jari = this.jari * 1.1;
    }

    // Method untuk memperkecil ukuran sebesar 10%
    @Override
    public void zoomOut() {
        this.jari = this.jari * 0.9;
    }

    // Method untuk mengubah ukuran berdasarkan persentase tertentu
    @Override
    public void zoom(int percent) {
        this.jari = this.jari * (percent / 100.0);
    }
}