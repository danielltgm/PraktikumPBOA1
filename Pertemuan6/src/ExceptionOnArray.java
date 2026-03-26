/*
 * File        : ExceptionOnArray.java
 * Deskripsi   : Program penggunaan eksepsi menggunakan class library Java
 * Pembuat     : Daniel Lamganda Tua Gultom
 * Tanggal     : 26/03/2026 - 14.21
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        // instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;   // valid, indeks 2 ada
            arrayInteger[4] = 10;   // error, indeks 4 tidak ada
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}

/*Belajar ExceptionOnArray dari modul yang diberikan*/
// Analisisnya itu ada kesalahan yang menyebabkan error ketika menjalankan program ExceptionOnArray
// Apa kesalahannya? karena kita coba initiate new array dengan panjang 4 (otomatis indexnya: 0,1,2,3)
// Nah, si masalah error ini muncul karena kita coba akses index ke-4 (which is gaada karena indexnya mentok di index ke-3)
// Javanya langsung ngeluarin ArrayIndexOutOfBoundsException dengan pesan "Index 4 out of bounds for length 4"
// Karena ada blok catch, exception ini ditangkap dan ditampilkan dengan exception.printStackTrace()
// Nah, blok finally tetep jalan makanya keluar pesan "clean up code..."

