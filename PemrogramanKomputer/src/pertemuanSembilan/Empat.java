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
public class Empat {//nama kelas yaitu Empat
    public static void main(String[] args) {//method yang digunakan
        Scanner z = new Scanner(System.in);//fungsi scanner bernama z
        int[] hitung;//array hitung dengan tipe integer
        int b=Integer.MAX_VALUE,a=0,d=0;//nilai dari variabel b,a,d dan bertipe integer
        double c=0;//nilai dari variabel c dan bertipe doble
        hitung = new int[5];//array hitung berjumlah 5
        System.out.println("Masukkan 5 data bulat");//mencetak "Masukkan jumlah data : " saat program dijalankan
        for(int i = 0; i <=4; i++){//nilai i adalah 0 dan bertipe integer, mengulang hingga i>4, nilai i bertambah 1
            System.out.print("Data ke "+(i+1)+" : ");//mencetak "Data ke "+memanggil nilai (i+1)+" : " saat program dijalankan
            hitung[i] = z.nextInt();//Memasukkan nilai hitung[i] saat program dijalankan
            a = a+hitung[i];//rumus variabel a
            c=a/5;//rumus variabel c
            if (hitung[i]<=0) d=d;//jika hitung[i]lebih kecil sama dengan maka nilai d tetap
            else d=hitung[i];//selain ekspresi diatas maka nilai d=hitung[i]
            if (hitung[i]<=b) b=hitung[i];//jika hitung[i]lebih kecil sama dengan maka nilai d=hitung[i]
            else b=b;//selain ekspresi diatas maka nilai d tetap
}
        for(int i=0; i <= 4; i++){//nilai i adalah 0 dan bertipe integer, mengulang hingga i>4, nilai i bertambah 1
            System.out.println("Data ke "+ (i+1) +" adalah "+hitung[i]);}//mencetak "Data ke "+memanggil nilai (i+1)+
                                                                        //" : "+memanggil hitung[i] saat program dijalankan
        System.out.println("rata-rata : "+c);//mencetak "rata-rata : "+memanggil nilai c saat program dijalankan
        System.out.println("max : "+d);//mencetak "max : "+memanggil nilai d saat program dijalankan
        System.out.println("min : "+b);//mencetak "min : "+memanggil nilai b saat program dijalankan
    }
}
