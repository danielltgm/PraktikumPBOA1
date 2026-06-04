package jdbc.program;

/**
 * @author Daniel
 * Nama File: Program.java
 * Nama Pembuat: Daniel Lamganda Tua Gultom
 * NIM: 24060124120048
 * Tanggal: 14/05/2026
 */

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
import jdbc.utilities.MysqlUtility;
import java.util.List;

public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    // Main Method
    public static void main(String[] args) {
        // INSERT
        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(6, "agung");
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();

        // UPDATE
        Mahasiswa mhsUpdate = service.getById(6);  
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();

        // DELETE
        System.out.println("===delete");
        System.out.println("akan di delete: " + service.getById(6));  
        service.delete(6);  
        displayAll();
    }

    // Method 
    // Untuk display
    static void displayAll() {
        System.out.println("===displayAll");
        List<Mahasiswa> list = service.getAll();
        for (Mahasiswa m : list) System.out.println(m);
        System.out.println();
    }
}