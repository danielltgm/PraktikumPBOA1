package jdbc.utilities;

/**
 * @author Daniel
 * Nama File: MysqlUtility.java
 * Nama Pembuat: Daniel Lamganda Tua Gultom
 * NIM: 24060124120048
 * Tanggal: 14/05/2026
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    // Atribut dari Class MysqlUtility
    private static Connection koneksi;
    
    // Getter
    // Untuk mengambil koneksi ke database
    public static Connection getConnection() {
        if (koneksi == null){
            try {
                // Class.forName("com.mysql.jdbc.Driver");
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs_service";
                String user = "mahasiswa";
                String password = "rahasia";
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null) {
                  System.out.println("Koneksi Berhasil");
                }
            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal load driver: " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal Koneksi:" + sqle.getMessage());
            }
        }
        return koneksi;
    }
}