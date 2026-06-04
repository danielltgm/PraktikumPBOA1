/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistentobjectdao;

/**
 * @author Daniel
 * Nama File: DAOManager.java
 * Nama Pembuat: Daniel Lamganda Tua Gultom
 * NIM: 24060124120048
 * Tanggal: 11/05/2026
 */

public class DAOManager {
    
    // Objek PersonDAO yang akan dikelola oleh DAOManager
    private PersonDAO personDAO;

    // Method untuk mengatur (set) objek PersonDAO
    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    // Method untuk mengambil (get) objek PersonDAO
    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
