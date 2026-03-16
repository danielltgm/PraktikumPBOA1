/*
 * Nama File   : Garis.java
 * Deskripsi   : berisi atribut dan method dalam class Garis
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 26/02/2026 1.16 PM
 */

public class Garis {

    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // a. Konstruktor tanpa parameter
    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // b. Konstruktor dengan parameter
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // c. Getter & Setter
    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    // d. Untuk menampilkan panjang garis dengan memanfaatkan getJarak
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    // e. Gradien (m)
        // idenya itu dengan menhitung perbedaan dari absis dan ordinat titikAkhir dan titikAawal kemudian beda ordinat/beda absis (dy/dx)
    public double getGradien() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return dy / dx;
    }

    // f. Untuk menampilkan titik tengah
        // idenya itu dari (x,y) tengah yang menjumlahkan absis dan ordinat titikAwal dan titikAkhir kemudian dibagi 2
    public Titik getTitikTengah() {
        double xTengah = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double yTengah = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(xTengah, yTengah);
    }

    // g. Untuk cek apakah sejajar atau tidak
    public boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    // h. Untuk cek apakah tegak lurus atau tidak
    public boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    // i. Untuk menampilkan titikAwal sebagai Titik Awal dan titikAkhir sebagai Titik Akhir
    public void printGaris() {
        System.out.print("Titik Awal: ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir: ");
        titikAkhir.printTitik();
    }

    // j. Persamaan garis y = mx + c
    public String getPersamaan() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());
        return "y = " + m + "x + " + c;
    }
}