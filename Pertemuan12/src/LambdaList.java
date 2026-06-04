/**
 * Nama File: LambdaList.java
 * Deskripsi: Implementasi lambda pada List, digunakan sebagai parameter pada method.
 * Nama Pembuat: Daniel Lamganda Tua Gultom - 24060124120048
 * Tanggal: 25/05/2026
 */

import java.util.ArrayList;

public class LambdaList {

    // Main Method
    public static void main(String[] args) {

        // Membuat ArrayList mahasiswa
        ArrayList<String> mahasiswaList = new ArrayList<>();

        // Menambahkan data ke dalam list
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // Lambda digunakan sebagai parameter method forEach()
        mahasiswaList.forEach(
                (nama) -> System.out.println(nama)
        );
    }
}