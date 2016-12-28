/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingKelas;

import java.util.Arrays;

/**
 *
 * @author robertusadi
 */
public class UjiBinarySearch {

    public static void main(String[] args) {

        //DATA ARRAY
        int[] data = {8, 3, 45, 78, 92, 40, 12, 9, 67, 43, 32, 57};
        //DATA PENCARIAN
        int cari = 67;

        //MENGURUTKAN DATA ARRAY
        Arrays.sort(data);
        Searching search = new Searching();
        System.out.println("Setelah diurutkan:");
        search.cetak(data);

        //LAKUKAN PENCARIAN DENGAN BINARY SEARCH
        int a = search.binarySearch(data, cari);
        if (a >= 0) {
            System.out.println("Data ditemukan di indeks ke:" + a);
        } else {
            System.out.println("Data tidak ditemukan");
        }

    }
}
