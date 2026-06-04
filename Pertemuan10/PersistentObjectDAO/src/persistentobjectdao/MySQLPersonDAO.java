/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistentobjectdao;

/**
 * @author Daniel
 * Nama File: MySQLPersonDAO.java
 * Nama Pembuat: Daniel Lamganda Tua Gultom
 * NIM: 24060124120048
 * Tanggal: 11/05/2026
 */

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {

    public void savePerson(Person person) throws Exception {

        // Mengambil nama dari objek Person
        String name = person.getName();

        // Memuat driver JDBC MySQL ke dalam program
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Membuat koneksi ke database MySQL
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/pbo",
            "root",
            "[@Dnl220406#Gltm777]"
        );

        // Query SQL untuk menambahkan data ke tabel person
        String query = "INSERT INTO person(name) VALUES (?)";

        // Membuat PreparedStatement untuk menjalankan query
        PreparedStatement ps = con.prepareStatement(query);

        // Mengisi parameter pertama (?) dengan nilai name
        ps.setString(1, name);

        // Menjalankan query INSERT
        ps.executeUpdate();

        // Menutup PreparedStatement
        ps.close();

        // Menutup koneksi database
        con.close();

        // Menampilkan pesan jika data berhasil disimpan
        System.out.println("Data berhasil disimpan: " + name);
    }
}
