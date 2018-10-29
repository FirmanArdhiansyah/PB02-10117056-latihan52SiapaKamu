/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nama : Firman Ardhiansyah
 *         Kelas : IF-2 (PB02)
 *         NIM : 10117056
 * Deskripsi Program : program untuk mendeskripsikan siapa kamu
 */
public class Mahasiswa {

    private String nim;
    private String kelas;
    private String umur;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void kelasApa() {
        String nama = null;
        System.out.println("Saya " + nama + " umur " + umur + " tahun sedang belajar di kelas " + kelas);
    }

    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
  }
