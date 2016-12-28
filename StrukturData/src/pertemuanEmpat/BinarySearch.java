/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanEmpat;

import java.util.Arrays;

/**
 *
 * @author Lycorice
 */
public class BinarySearch 
//implements Comparable 
{
    public static int find(Mahasiswa cari, Mahasiswa[] data) {
        int awal,tengah,akhir;
        Arrays.sort(data);
        awal=0;
        akhir=data.length-1;
        while (awal<=akhir){
            tengah=(awal+akhir)/2;
            System.out.println(tengah);
            if(((Comparable)data[tengah]).compareTo(cari)==0)return tengah;
            else if (((Comparable)data[tengah]).compareTo(cari)==1) akhir=tengah-1;
            else awal=tengah+1;
//            if (data[tengah]==cari)return tengah;
//            else if (data[tengah]>cari)akhir=tengah-1;
//            else awal=tengah+1;
        }
        System.out.println("Data tidak ditemukan.");
        return -1;
    }
}
