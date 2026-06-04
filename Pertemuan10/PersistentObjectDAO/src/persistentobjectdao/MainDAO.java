/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistentobjectdao;

/**
 * @author Daniel
 * Nama File: MainDAO.java
 * Nama Pembuat: Daniel Lamganda Tua Gultom
 * NIM: 24060124120048
 * Tanggal: 11/05/2026
 */

public class MainDAO {
    public static void main(String args[]) {
        
        // Membuat objek Person dengan nama "Indra"
        Person person = new Person("Indra");

        // Membuat objek DAOManager
        DAOManager m = new DAOManager();

        // Mengatur implementasi DAO yang digunakan, yaitu MySQLPersonDAO
        m.setPersonDAO(new MySQLPersonDAO());

        try {
            // Menyimpan data person ke database melalui DAO
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            // Menangani exception yang mungkin terjadi saat proses penyimpanan
            e.printStackTrace();
        }
    }
}
