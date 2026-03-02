/*
 * Nama File   : MTitik.java
 * Deskripsi   : berisi main program untuk menggunakan class Titik
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 23/02/2026 - 8.22 PM
 */

public class MTitik {

    public static void main(String[] args) {

        // Membuat objek titik baru, yaitu T1
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        System.out.print("T1 awal: ");
        T1.printTitik();

        // Untuk prosedur geser 
        T1.geser(3, 4);
        System.out.print("T1 setelah digeser: ");
        T1.printTitik();

        // Ini membuat objek baru dengan referensi ke objek yang sama
        Titik T2 = T1;
        System.out.print("T2 (referensi T1): ");
        T2.printTitik();

        // Ini nge-set T1
        T1.setAbsis(10);
        T1.setOrdinat(10);

        // T2 berubah karena T1 berubah (referensi)
        System.out.print("T2 setelah T1 diubah: ");
        T2.printTitik();

        // Membuat objek titik baru, yaitu T1
        Titik T3 = new Titik(3, 5);
        System.out.print("T3: ");
        T3.printTitik();

        // Jarak T3 ke pusat
        System.out.println("Jarak T3 ke pusat: " + T3.getJarakPusat());

        // Jarak T3 ke T1
        System.out.println("Jarak T3 ke T1: " + T3.getJarak(T1));

        // Kuadran T3
        System.out.println("Kuadran T3: " + T3.getKuadran());

        // Refleksi prosedur (ubah objek)
        T3.refleksiX();
        System.out.print("T3 setelah refleksiX (prosedur): ");
        T3.printTitik();

        // Refleksi fungsi (objek baru)
        Titik T4 = T2.getRefleksiY();
        System.out.print("T4 (hasil getRefleksiY dari T2): ");
        T4.printTitik();

        // Jumlah objek
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
    }
}