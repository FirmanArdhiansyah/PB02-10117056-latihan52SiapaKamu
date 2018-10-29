/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Firman
 */
public class Main {
    public static void main(String[] args) {
        
        // TODO code application logic here
        Dosen dosen = new Dosen();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setNip("41227829930");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        System.out.println("NIP DOSEN "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
    }
    
}

