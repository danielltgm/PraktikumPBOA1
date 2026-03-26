/*
 * File        : AngkaSial.java
 * Deskripsi   : Program penggunaan esception sendiri. pengenalan klausa 'throw' dan 'throws'
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 26/03/2026 - 14.32
 */

public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*SOAL LATIHAN PRAKTIKUM PERTEMUAN6: AngkaSial*/
// Soal:
    // 1. Ketika eksepsi terjadi, apakah baris 12 dieksekusi?  
    // 2. Apakah baris 21 dieksekusi?
// Jawaban:
// OUTPUT AngkaSial:
// 10 bukan angka sial
// jangan memasukkan angka 13 karena angka sial !!!
// hati-hati memasukkan angka!!!
    // 1. Baris 12 TIDAK DIEKSEKUSI 
        // baris ke 12 adalah perintah System.out.println(angka + " bukan angka sial");
        // tidak dieksekusi karena saat angka == 13, baris sebelumnya (throw new AngkaSialException();) langsung melempar exception 
        // Ketika exception dilempar, alur normal programnya jadi berhenti dan lompat ke blok catch
        // Akibatnya apa? akibatnya adalah baris ke 12 tidak sempat dijalankan 
    // 2. Baris 21 DIEKSEKUSI 
        // baris ke 21 adalah perintah System.out.println("hati-hati memasukkan angka!!!");
        // Karena exception AngkaSialException ditangkap oleh blok catch, semua perintah di dalam catch dijalankan. Termasuk baris 20 (System.out.println(ase.getMessage());) dan baris 21.

