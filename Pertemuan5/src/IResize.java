/*
 * Nama File   : IResize.java
 * Deskripsi   : berisi deklarasi method dalam interface IResize
 *               yang digunakan untuk mengubah ukuran suatu objek
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 20/03/2026 - 22.37
 */

public interface IResize {

    /*************** METHOD *****************/

    // Method untuk memperbesar ukuran sebesar 10%
    public void zoomIn();

    // Method untuk memperkecil ukuran sebesar 10%
    public void zoomOut();

    // Method untuk mengubah ukuran berdasarkan persentase tertentu
    public void zoom(int percent);

}