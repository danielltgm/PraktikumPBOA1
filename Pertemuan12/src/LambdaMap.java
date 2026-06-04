/**
 * Nama File: LambdaMap.java
 * Deskripsi: program yang digunakan untuk menampilkan key dan value dari sebuah Map, dimana key merupakan NIM dan value merupakan nama mahasiswa, menggunakan ekspresi lambda
 * Nama Pembuat: Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal: 25/05/2026
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {

        // Map dengan NIM sebagai key dan nama sebagai value
        Map<String, String> mahasiswaMap = new HashMap<>();

        // Menambah data mahasiswa ke dalam Map
        mahasiswaMap.put("24060124120048", "Daniel Lamganda Tua Gultom");
        mahasiswaMap.put("24060124120001", "Kevin Lief Sitorus");
        mahasiswaMap.put("24060124120002", "Dehar Zidan Amirullah");
        mahasiswaMap.put("24060124120003", "Elang Fadila Ahmad");
        mahasiswaMap.put("24060124120004", "Revolvere Sembiring");

        // Menampilkan key dan value dari Map mahasiswa menggunakan lambda
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + ", Nama: " + nama);
        });
    }
}