/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistentobjectdao;

/**
 * @author Daniel
 * Nama File: PersonDAO.java
 * Nama Pembuat: Daniel Lamganda Tua Gultom
 * NIM: 24060124120048
 * Tanggal: 11/05/2026
 */

public interface PersonDAO {
    
    // Method
    // Untuk menyimpan data Person ke penyimpanan (database / file / dll)
    public void savePerson(Person p) throws Exception;
}