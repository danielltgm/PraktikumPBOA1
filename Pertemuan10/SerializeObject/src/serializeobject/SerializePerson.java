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
 * Tanggal: 1/05/2026
 */

import java.io.*;

class Person implements Serializable {
    // Atribut Class Person
    private String name;
    
    // Konstruktor dengan parameter (1 parameter)
    public Person(String n) {
        name = n;
    }

    // Getter
    // Untuk mengambil nama
    public String getName() {
        return name;
    }
}

public class SerializePerson {
    // Main Method
    public static void main(String[] args) {
        Person person = new Person("Panji");

        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);

            s.writeObject(person);

            System.out.println("Selesai menulis objek person");

            s.close();
        } catch (IOException e) {
            // Menangani error jika terjadi kesalahan 
            e.printStackTrace();
        }
    }
}