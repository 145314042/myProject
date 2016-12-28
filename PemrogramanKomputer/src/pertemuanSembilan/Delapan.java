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
public class Delapan {//nama kelas yaitu Enam
    public static void main(String[] args) {//method yang digunakan
        Scanner z = new Scanner(System.in);//fungsi scanner bernama z
        int[] data;//array hitung dengan tipe integer
        int a,b,i;//variable a,b,i dengan tipe integer
        System.out.print("Banyak anggota dalam array : ");//mencetak "Banyak anggota dalam array : " saat program dijalankan
        a=z.nextInt();//Memasukkan nilai a saat program dijalankan
        data=new int[a];//array data berjumlah a
        for(i=0;i<data.length;i++){//nilai i adalah 0, mengulang hingga i>=jumlah variable data, nilai i bertambah 1
            System.out.print("Data ke "+(i+1)+" : ");//mencetak "Data ke "+memanggil nilai (i+1)+" : " saat program dijalankan
            data[i]=z.nextInt();//Memasukkan nilai data[i] saat program dijalankan
        }
        System.out.println("Array bilangan ganjil : ");//mencetak "Array bilangan ganjil : " saat program dijalankan
        for(i=0;i<data.length;i++){//nilai i adalah 0, mengulang hingga i>=jumlah variable data, nilai i bertambah 1
            b=data[i]%2;//rumus variable b
            if(b==1){//jika variable b sama dengan 1
                System.out.println(data[i]);//memanggil nilai data[i] saat program dijalankan
            }
        }
        System.out.println("Array bilangan genap : ");//mencetak "Array bilangan genap : " saat program dijalankan
        for(i=0;i<data.length;i++){//nilai i adalah 0, mengulang hingga i>=jumlah variable data, nilai i bertambah 1
            b=data[i]%2;//rumus variable b
            if(b==0){//jika variable b sama dengan 0
                System.out.println(data[i]);//memanggil nilai data[i] saat program dijalankan
            }
        }
        System.out.print("Anggota Array : {"+data[0]);//mencetak "Anggota Array : {"+memanggil nilai data[0] saat program dijalankan
        for(i=1;i<data.length;i++){//nilai i adalah 0, mengulang hingga i>=jumlah variable data, nilai i bertambah 1
            System.out.print(", "+data[i]);//mencetak ", "+memanggil nilai data[i] saat program dijalankan
        }
        System.out.println("}");//mencetak "}" saat program dijalankan
    }
}