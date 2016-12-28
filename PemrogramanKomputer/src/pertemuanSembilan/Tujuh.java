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
public class Tujuh {//nama kelas yaitu Tujuh
    public static void main(String[] args) {//method yang digunakan
        Scanner z = new Scanner(System.in);//fungsi scanner bernama z
        int[] bilangan;//array bilangan dengan tipe integer
        System.out.print("Masukkan jumlah deret : ");//mencetak "Masukkan jumlah deret : " saat program dijalankan
        int a=z.nextInt();//Memasukkan nilai a dengan tipe integer saat program dijalankan
        bilangan=new int[a];//array bilangan berjumlah a
        System.out.print("Deret adalah : ");//mencetak "Deret adalah : " saat program dijalankan
        bilangan[0]=1;//nilai variable bilangan[0]
        bilangan[1]=1;//nilai variable bilangan[1]
        if (a==1)System.out.print("1");//jika nilai variable a sama dengan 1 maka menampilkan "1" saat program dijalankan
        else if (a==2)System.out.print("1,1");//jika nilai variable a sama dengan 2 maka menampilkan "1,1" saat program dijalankan
        else if (a>=3){//jika nilai variable a lebih besar sama dengan 3
            System.out.print("1,1");
            for(int b=2;b<a;b++){//nilai b adalah 2 dan bertipe integer, mengulang hingga b>=a, nilai b bertambah 1
                bilangan[b]=bilangan[b-1]+bilangan[b-2];//rumus bilangan[b]
                System.out.print(","+bilangan[b]);//mencetak ", "+memanggil nilai bilangan[b] saat program dijalankan
            }
        }
        else System.out.print("data error");//mencetak "data error" saat program dijalankan
        System.out.println("");//membuat enter saat program dijalankan
    }
}

        