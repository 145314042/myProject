/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanEmpat;

/**
 *
 * @author Lycorice
 */
public class UjiSearchBSObject {
    public static void main(String[] args) {
        //
        Mahasiswa[] data = {
            new Mahasiswa("120001", "Slamet", 2.5),
            new Mahasiswa("120002", "Joko", 2.8),
            new Mahasiswa("120003", "Kadir", 3.5),
            new Mahasiswa("120004", "Eko", 3.25),
            new Mahasiswa("120005", "Bejo", 3.1),
            new Mahasiswa("120006", "Asto", 4.0),
            new Mahasiswa("120007", "Risky", 3.8),
            new Mahasiswa("120008", "Pecky", 3.7),
            new Mahasiswa("120009", "Barjo", 2.75),
            new Mahasiswa("120010", "Wempi", 3.6)};
        
        //Object yang dicari
        Mahasiswa cari = new Mahasiswa("120008", "PeckY", 3.7);
        
        //PENCARIAN BINARY SEARCH
        BinarySearch search = new BinarySearch();
        int a = search.find(cari, data);
        if (a>=0)System.out.println("Data ditemukan di index ke: "+a);
        else System.out.println("Data tidak ditemukan");
    }
}
