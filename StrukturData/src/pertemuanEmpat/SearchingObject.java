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
public class SearchingObject {
    public int sequensialSearch(Object[] data, Object cari) {
        System.out.println("SEQUENTIAL SEARCH");
        int i;
        for (i = 0; i < data.length; i++) {
            System.out.print("Iterasi ke-" + (i + 1));
            System.out.println("[index ke :" + i + "]");
            if (((Comparable) data[i]).compareTo(cari) == 0) {
                System.out.println("Selesai");
                return i;
            }
        }
        return -1;
    }
    public int binarySearch(Object[] data, Object cari) {
        int awal = 0;
        int tengah;
        int iterasi = 1;
        int akhir = data.length - 1;
        System.out.println("BINARY SEARCH");
        while (awal <= akhir) {
            System.out.print("Iterasi ke-" + iterasi++);
            //Titik tengah
            tengah = (awal + akhir) / 2;
            System.out.println(" [index awal :" + awal + ", index tengah :" + tengah + ", index akhir :" + akhir + "]");
            //Membagu menjadi 2 bagian pencarian
            if (((Comparable)data[tengah]).compareTo(cari)==0) 
                return tengah;
            else if (((Comparable)data[tengah]).compareTo(cari)==1) 
                akhir = tengah - 1;
            else if (((Comparable)data[tengah]).compareTo(cari)==-1) 
                awal = tengah + 1;
        }
        return -1;
    }
}

//            else 
//                awal = tengah + 1;