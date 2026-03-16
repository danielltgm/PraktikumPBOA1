/*
 * Nama File   : Titik.java
 * Deskripsi   : berisi atribut dan method dalam class Titik
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 23/02/2026 - 7.51 PM
 */

public class Titik {

    private double absis;
    private double ordinat;
    static int counterTitik = 0;

    // Constructor default
    public Titik() {
        this(0, 0);
    }

    // Constructor dengan parameter
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Getter
    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    // Setter
    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    // MELENGKAPI METHOD-METHOD YANG TELAH DIPELAJARI DI LAB
    // 1. geser(x:real, y:real)
    public void geser(double dx, double dy) {
        absis += dx;
        ordinat += dy;
    }

    // 2. getKuadran(): integer
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) return 1;
        else if (absis < 0 && ordinat > 0) return 2;
        else if (absis < 0 && ordinat < 0) return 3;
        else if (absis > 0 && ordinat < 0) return 4;
        else return 0; // ini in case ketika dia ketemu di sumbu
    }

    // 3. getJarakPusat(): real
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // 4. getJarak(T:Titik): real
    public double getJarak(Titik T) {
        double dx = absis - T.absis;
        double dy = ordinat - T.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // 5. refleksiX()
    public void refleksiX() {
        ordinat = -ordinat;
    }

    // 6. refleksiY()
    public void refleksiY() {
        absis = -absis;
    }

    // 7. getRefleksiX(): Titik
    public Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    // 8. getRefleksiY(): Titik
    public Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }

    public static int getCounterTitik() {
        return counterTitik;
    }

    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}