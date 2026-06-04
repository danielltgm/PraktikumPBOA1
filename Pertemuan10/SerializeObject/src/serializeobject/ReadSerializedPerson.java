/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializeobject;

/**
 * @author Daniel
 * Nama File: ReadSerializedPerson.java
 * Nama Pembuat: Daniel Lamganda Tua Gultom
 * NIM: 24060124120048
 * Tanggal: 11/05/2026
 */

import java.io.*;

public class ReadSerializedPerson {
    
    // Method
    public static void main(String[] args) {
        Person person = null; // Objek untuk menampung hasil deserialisasi

        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person) s.readObject();
            s.close();
            System.out.println("Serialized person name = " + person.getName());

        } catch (Exception e) {
            // Menangani error jika terjadi kesalahan saat membaca file / casting
            e.printStackTrace();
        }
    }
}