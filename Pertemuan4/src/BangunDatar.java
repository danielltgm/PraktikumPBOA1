/*
 * Nama File   : BangunDatar.java
 * Deskripsi   : berisi atribut dan method dalam class BangunDatar
 *               sebagai superclass dari berbagai bangun datar
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 11/03/2026 07.18 AM
 */

public class BangunDatar {

    /*************** ATRIBUT *****************/
    private Integer jmlSisi; // atribut yang merepresentasikan jumlah sisi bangun datar
    private String warna;    // atribut yang merepresentasikan warna bangun datar
    private String border;   // atribut yang merepresentasikan jenis border bangun datar

    protected static Integer counterBangunDatar = 0; 
    // atribut static untuk menghitung jumlah objek BangunDatar yang dibuat

    /*************** KONSTRUKTOR *****************/

    // Konstruktor tanpa parameter
    public BangunDatar() {
        counterBangunDatar++; // menambah counter setiap objek dibuat
    }

    // Konstruktor dengan parameter
    public BangunDatar(Integer jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    /*************** GETTER *****************/

    // Mengambil nilai jumlah sisi
    public Integer getJmlSisi() {
        return jmlSisi;
    }

    // Mengambil nilai warna
    public String getWarna() {
        return warna;
    }

    // Mengambil nilai border
    public String getBorder() {
        return border;
    }

    /*************** SETTER *****************/

    // Mengubah jumlah sisi
    public void setJmlSisi(Integer jmlSisi) {
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

    /*************** METHOD *****************/

    // Method untuk menampilkan informasi bangun datar
    public void printInfo() {
        System.out.println("Jumlah Sisi : " + jmlSisi);
        System.out.println("Warna       : " + warna);
        System.out.println("Border      : " + border);
    }

    // Method static untuk menampilkan jumlah objek BangunDatar yang telah dibuat
    public static void printCounter() {
        System.out.println("Jumlah objek BangunDatar : " + counterBangunDatar);
    }
}