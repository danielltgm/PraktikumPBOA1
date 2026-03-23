/*
 * Nama File   : Persegi.java
 * Deskripsi   : berisi atribut dan method dalam class Persegi
 *               yang merupakan turunan dari class BangunDatar
 *               serta mengimplementasikan interface IResize
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 21/03/2026 - 10.01 
 */

public class Persegi extends BangunDatar implements IResize {

    /*************** ATRIBUT *****************/
    private double sisi; // atribut untuk menyimpan panjang sisi persegi

    /*************** KONSTRUKTOR *****************/

    // Konstruktor tanpa parameter
    public Persegi() {
        setJmlSisi(4); // persegi punya 4 sisi
    }

    // Konstruktor dengan parameter
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border); // memanggil konstruktor parent
        this.sisi = sisi;
    }

    /*************** GETTER *****************/

    // Mengambil nilai sisi
    public double getSisi() {
        return sisi;
    }

    /*************** SETTER *****************/

    // Mengubah nilai sisi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    /*************** METHOD *****************/

    // Method untuk menghitung luas persegi
    public double getLuas() {
        return sisi * sisi;
    }

    // Method untuk menghitung keliling persegi
    public double getKeliling() {
        return getJmlSisi() * sisi;
    }

    // Method untuk menghitung diagonal persegi
    public double getDiagonal() {
        return Math.sqrt(sisi * sisi + sisi * sisi);
    }

    // Method untuk menampilkan informasi objek
    @Override
    public void printInfo() {
        super.printInfo(); // memanggil method dari class induk
        System.out.println("Sisi : " + sisi);
    }

    /*************** IMPLEMENTASI INTERFACE IResize *****************/

    // Method untuk memperbesar ukuran sebesar 10%
    @Override
    public void zoomIn() {
        this.sisi = this.sisi * 1.1;
    }

    // Method untuk memperkecil ukuran sebesar 10%
    @Override
    public void zoomOut() {
        this.sisi = this.sisi * 0.9;
    }

    // Method untuk mengubah ukuran berdasarkan persentase tertentu
    @Override
    public void zoom(int percent) {
        this.sisi = this.sisi * (percent / 100.0);
    }
}