import java.util.HashMap;
import java.util.Map;

// File: LambdaMap.java
// Deskripsi: Implementasi lambda pada Map, digunakan untuk menampilkan key dan value.

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat Map dengan NIM sebagai key dan nama mahasiswa sebagai value
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060124120048", "Daniel");
        mahasiswaMap.put("24060124120027", "Adi");
        mahasiswaMap.put("24060124120035", "Cici");
        mahasiswaMap.put("24060124120012", "Bambang");

        // Menampilkan key dan value menggunakan lambda expression
        mahasiswaMap.forEach((nim, nama) -> 
            System.out.println("NIM: " + nim + " | Nama: " + nama)
        );
    }
}
