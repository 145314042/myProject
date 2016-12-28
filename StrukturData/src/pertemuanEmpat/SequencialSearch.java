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
public class SequencialSearch {
    public static int find(Mahasiswa search, Mahasiswa[] data) {
        for (int i = 0; i < data.length; i++) {
            if (((Comparable)data[i]).compareTo(search)==0) {
                return i;
            }
        }
        System.out.println("Data tidak ditemukan.");
        return -1;
    }
}
