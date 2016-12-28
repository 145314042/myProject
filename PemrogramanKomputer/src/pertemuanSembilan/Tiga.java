/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanSembilan;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class Tiga {//nama kelas yaitu Tiga
    public static void main(String[] args) {//method yang digunakan
        Scanner z = new Scanner(System.in);//fungsi scanner bernama z
        int[] hitung,balik;//array hitung,balik dengan tipe integer
        System.out.print("Masukkan jumlah data : ");//mencetak "Masukkan jumlah data : " saat program dijalankan
        int a=z.nextInt();//Memasukkan nilai a dengan format integer saat program dijalankan
        hitung=new int[a];//array hitung berjumlah a
        for(int i = 0; i <a; i++){//nilai i adalah 0 dan bertipe integer, mengulang hingga i>=a, nilai i bertambah 1
            System.out.print("Bilangan ke "+(i+1)+" : ");//mencetak "Bilangan ke "+memanggil nilai (i+1)+
                                                         //" : "+memanggil hitung[i] saat program dijalankan
            hitung[i] = z.nextInt();}//Memasukkan nilai hitung[i] saat program dijalankan
        balik=hitung;//nilai balik = hitung
        for(int i=0; i < a; i++){//nilai i adalah 0 dan bertipe integer, mengulang hingga i>=a, nilai i bertambah 1
            System.out.println("Bilangan ke "+ (i+1) +" adalah "+hitung[i]);}//mencetak "Bilangan ke "+memanggil nilai (i+1)+
                                                                            //" : "+memanggil hitung[i] saat program dijalankan
        System.out.println("Urutan terbalik :");//mencetak "Urutan terbalik :" saat program dijalankan
        for(int i =a-1; i >=0; i--){//nilai i adalah 0 dan bertipe integer, mengulang hingga i>=a, nilai i bertambah 1
            System.out.println("Bilangan ke "+(i+1)+" : "+balik[i]);//mencetak "Bilangan ke "+memanggil nilai (i+1)+
                                                                    //" : "+memanggil balik[i] saat program dijalankan
        }
    }
}
