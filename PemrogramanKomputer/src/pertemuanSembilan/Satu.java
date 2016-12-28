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
public class Satu { //nama kelas yaitu Satu
    public static void main(String[] args) { //method yang digunakan
        Scanner z = new Scanner(System.in); //fungsi scanner bernama z
        int[] hitung; //array hitung dengan tipe integer
        hitung = new int[5]; //array hitung berjumlah 5
        System.out.println("Masukkan 5 data bulat"); //mencetak "Masukkan 5 data bulat" saat program dijalankan
        for(int i = 0; i <=4; i++){ //nilai i adalah 0 dan bertipe integer, mengulang hingga i>4, nilai i bertambah 1
            System.out.print("Data ke "+(i+1)+" : "); //mencetak "Data ke "+memanggil nilai (i+1)+" : " saat program dijalankan
            hitung[i] = z.nextInt();} //Memasukkan nilai hitung[i] saat program dijalankan
        for(int i=0; i <= 4; i++) //nilai i adalah 0 dan bertipe integer, mengulang hingga i>4, nilai i bertambah 1
            System.out.println("Data ke "+ (i+1) +" adalah "+hitung[i]); //mencetak "Data ke "+memanggil nilai (i+1)+
                                                                         //" : "+memanggil hitung[i] saat program dijalankan
    }
}
