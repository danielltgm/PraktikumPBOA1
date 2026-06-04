/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistentobjectdao;

/**
 * @author Daniel
 * Nama File: Person.java
 * Nama Pembuat: Daniel Lamganda Tua Gultom
 * NIM: 24060124120048
 * Tanggal: 11/05/2026
 */

public class Person {
    // Atribut dari class Person
    private int id;
    private String name;

    // Konstruktor dengan parameter (1 parameter)
    public Person(String n) {
        name = n;
    }

    // Konstruktor dengan parameter (2 parameter)
    public Person(int i, String n) {
        id = i;
        name = n;
    }

    // Getter
    // Untuk mengambil Id
    public int getId() {
        return id;
    }

    // Untuk mengambil nama
    public String getName() {
        return name;
    }
}
