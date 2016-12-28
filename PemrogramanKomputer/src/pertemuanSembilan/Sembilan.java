/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanSembilan;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class Sembilan {//nama kelas yaitu Sembilan
    public static void main(String[] args) {//method yang digunakan
        Scanner z = new Scanner(System.in);//fungsi scanner bernama z
        int[] data;//array data dengan tipe integer
        int a,b,i;//variable a,b,i dengan tipe integer
        System.out.print("Banyak anggota dalam array : ");//mencetak "Banyak anggota dalam array : " saat program dijalankan
        a=z.nextInt();//Memasukkan nilai a saat program dijalankan
        System.out.println("Masukkan data anggota array : ");//mencetak "Masukkan data anggota array : " saat program dijalankan
        data=new int [a];//array hitung berjumlah 5
        for(i=0;i<data.length;i++){//nilai i adalah 0, mengulang hingga i>=jumlah variable data, nilai i bertambah 1
            data[i]=z.nextInt();}//Memasukkan nilai data[i] saat program dijalankan
        System.out.println("Setelah diurutkan: ");//mencetak "Setelah diurutkan: " saat program dijalankan
    //    Arrays.sort(data);//mengurutkan data dari kecil ke besar
        System.out.println(Arrays.toString(data));//mencetak data yang sudah diurutkan saat program dijalankan
       }
}
