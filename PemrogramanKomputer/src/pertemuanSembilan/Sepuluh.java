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
public class Sepuluh {//nama kelas yaitu Sepuluh
    public static void main(String[] args) {//method yang digunakan
        Scanner z = new Scanner(System.in);//fungsi scanner bernama z
        int a,b,i,j;//variable a,b,i,j dengan tipe integer
        int[] data1;//array data1 dengan tipe integer
        int[] data2;//array data2 dengan tipe integer
        System.out.print("Banyak anggota dalam array : ");//mencetak "Banyak anggota dalam array : " saat program dijalankan
        a=z.nextInt();//Memasukkan nilai a saat program dijalankan
        b=a;//nilai variable b sama dengan a
        System.out.println("Masukkan anggota array 1 : ");//mencetak "Masukkan anggota array 1 : " saat program dijalankan
        data1=new int[a];//array data1 berjumlah a
        for(i = 0; i <a; i++){//nilai i adalah 0, mengulang hingga i>=a, nilai i bertambah 1
            data1[i]=z.nextInt();}//Memasukkan nilai data1[i] saat program dijalankan
        System.out.println("Masukkan anggota array 2 : ");//mencetak "Masukkan anggota array 2 : " saat program dijalankan
        data2=new int[b];//array data2 berjumlah b
        for(j = 0; j <a; j++){//nilai j adalah 0, mengulang hingga j>=a, nilai j bertambah 1
            data2[j]=z.nextInt();}//Memasukkan nilai data2[j] saat program dijalankan
        System.out.println("Anggota Array; 1 yang juga menjadi anggota Array 2 : ");//mencetak "Anggota Array; 1 yang juga menjadi 
                                                                                //anggota Array 2 : " saat program dijalankan
         for ( i = 0; i <a; i++)//nilai i adalah 0, mengulang hingga i>=a, nilai i bertambah 1
             for (j = 0; j <a; j++){//nilai j adalah 0, mengulang hingga j>=a, nilai j bertambah 1
                if(data2[j]==data1[i]){//jika nilai data2[j] sama dengan data1[i]
                    System.out.print(data1[i]+"         "); //memanggil niali data[i] dan menampilkan "         " saat program dijalankan
            }
        }
    }
}
