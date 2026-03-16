/*
 * Nama File   : MMahasiswa.java
 * Deskripsi   : berisi main program untuk menguji class Mahasiswa
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 05/03/2026 17.18 PM
 */

public class MMahasiswa {

    public static void main(String[] args) {

        /*************** MEMBUAT OBJEK *****************/

        // Membuat objek dosen wali
        Dosen dosen = new Dosen("12345", "Bu Khadijah", "Informatika");

        // Membuat objek kendaraan
        Kendaraan kendaraan = new Kendaraan("Motor", "B1234XYZ");

        // Membuat objek mata kuliah
        MataKuliah mk1 = new MataKuliah("IF101", "Pemrograman Berorientasi Objek", 3);
        MataKuliah mk2 = new MataKuliah("IF102", "Analisis Strategi dan Algoritma", 3);

        // Membuat objek mahasiswa
        Mahasiswa mhs = new Mahasiswa("20048", "Daniel Lamganda Tua Gultom", "Informatika");


        /*************** SET RELASI OBJEK *****************/

        // Menambahkan dosen wali
        mhs.setDosenWali(dosen);

        // Menambahkan kendaraan
        mhs.setKendaraan(kendaraan);

        // Menambahkan mata kuliah
        mhs.addMatKul(mk1);
        mhs.addMatKul(mk2);


        /*************** MENAMPILKAN DATA *****************/

        mhs.printDetailMhs();

    }
}