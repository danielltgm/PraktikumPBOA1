package jdbc.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author Daniel
 * Nama File: Mahasiswa.java
 * Nama Pembuat: Daniel Lamganda Tua Gultom
 * NIM: 24060124120048
 * Tanggal: 19/05/2026
 */

public class Mahasiswa {
    // Atribut dari Class Mahasiswa
    private int id;
    private String nama;

    // Konstruktor tanpa parameter
    public Mahasiswa() {
    }

    // Konstruktor dengan parameter (2 parameter)
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Konstruktor dengan parameter (1 parameter)
    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    // Getter
    // Untuk mengambil Id
    public int getId() {
        return id;
    }
   
    // Untuk mengambil nama
    public String getNama() {
        return nama;
    }

    // Setter
    // Untuk set Id
    public void setId(int id) {
        this.id = id;
    }

    // Untuk set nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Override
    @Override
    public String toString() {
        return "Mahasiswa{id=" + id + ", nama=" + nama + "}";
    }
}
