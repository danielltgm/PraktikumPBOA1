/*
 * File        : AngkaSialException.java
 * Deskripsi   : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 26/03/2026 - 14.29
 */

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
