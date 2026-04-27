/* Nama File    : MAnabul.java
 * Deskripsi    : Main Program buat demo polimorfisme pada subclass Anabul.
 * Pembuat      : Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal      : 25 April 2026 - 00.09
 */

public class MAnabul {
    public static void main(String[] args) {

        Anabul a1 = new Kucing("Oreo");
        Anabul a2 = new Anjing("Bruno");
        Anabul a3 = new Burung("Cici");

        Anabul[] daftar = {a1, a2, a3};

        for (Anabul a : daftar) {
            a.Gerak();
            a.Bersuara();
            System.out.println();
        }
    }
}