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
public class Lima {//nama kelas yaitu Lima
    public static void main(String[] args) {//method yang digunakan
        Scanner z = new Scanner(System.in);//fungsi scanner bernama z
        int[] hitung;//array hitung dengan tipe integer
        int a = 0,d=0;//nilai variabel a,d dengan tipe integer
        double c;//nilai variabel c dengan tipe integer
        System.out.print("Masukkan jumlah data (max 10): ");//mencetak "Masukkan jumlah data (max 10): " saat program dijalankan
        int x=z.nextInt();//Memasukkan nilai x dengan format integer saat program dijalankan
        hitung = new int[x];//array hitung berjumlah x
        if(x<=10){//jika x lebih kecil sama dengan 10
            for(int i = 0; i <x; i++){//nilai i adalah 0 dan bertipe integer, mengulang hingga i>=x, nilai i bertambah 1
            System.out.print("Data ke "+(i+1)+" : ");//mencetak "Data ke "+memanggil nilai (i+1)+
                                                                        //" : " saat program dijalankan
            hitung[i] = z.nextInt();//Memasukkan nilai hitung[i] saat program dijalankan
            a = a+hitung[i];//rumus variable a
            }
            c=a/x;//rumus variabel c
            System.out.println("Bilangan yang lebih besar dari rata-rata ("+c+") adalah : ");//mencetak "Bilangan yang lebih besar dari rata-rata
                                                             //("+memanggil nilai c+") adalah : " saat program dijalankan
            for(int i = 0; i <x; i++){//nilai i adalah 0 dan bertipe integer, mengulang hingga i>=x, nilai i bertambah 1
                if(hitung[i]>c)//jika hitung[i]>c
                    System.out.println(hitung[i]+" (urutan "+(i+1)+")");}//menampilkan nilai hitung[i]+" (urutan "+memanggil nilai(i+1)+")"
                                                                         //saat program dijalankan
            System.out.println("Terima Kasih");//menampilkan "Terima Kasih" saat program dijalankan
        }
        else System.out.println("Jumlah berlebihan");//selain ekspresi diatas maka akan menampilkan "Jumlah berlebihan"
                                                    //saat program dijalankan
    }
}
