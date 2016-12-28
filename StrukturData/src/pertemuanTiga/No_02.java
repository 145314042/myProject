/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanTiga;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class No_02 {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int[] nilai={23,56,45,12,67,86,43,66,99,25,61,5,78,76,33,63,5,8,15,20};
        System.out.print("n         : ");
        for (int i = 0; i < nilai.length; i++)System.out.printf("%3d",i);
        System.out.print("\nNilai (n) : ");
        for (int i = 0; i < nilai.length; i++)System.out.printf("%3d",nilai[i]);
        System.out.print("\nData yang akan dicari : ");
        int cari=z.nextInt();
        find(cari,nilai);
    }
    public static int find(int cari, int[] nilai) {
        int awal,tengah,akhir;
        Arrays.sort(nilai);
        awal=0;
        akhir=nilai.length-1;
        while (awal<=akhir){
            tengah=(awal+akhir)/2;
            System.out.println(tengah);
            if (nilai[tengah]==cari)return tengah;
            else if (nilai[tengah]>cari)akhir=tengah-1;
            else awal=tengah+1;
        }
        System.out.println("Data tidak ditemukan.");
        return -1;
    }
}

//        int[] nilai={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};