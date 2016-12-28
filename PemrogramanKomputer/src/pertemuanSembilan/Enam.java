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
public class Enam {//nama kelas yaitu Enam
    public static void main(String[] args) {//method yang digunakan
        Scanner z = new Scanner(System.in);//fungsi scanner bernama z
        int[] hitung;//array hitung dengan tipe integer
        int a,b,i;//variable a,b,i dengan tipe integer
        double jumlah = 0;//variable jumlah dengan tipe double
        System.out.print("Masukkan banyak bilangan (maks 10) : ");//mencetak "Masukkan banyak bilangan (maks 10) : " saat program dijalankan
        a=z.nextInt();//Memasukkan nilai a saat program dijalankan
        if(0<a&&a<11){//jika nilai a antara 0-11
            hitung = new int[a];//array hitung berjumlah a
            for(i = 0; i<a; i++){//nilai i adalah 0, mengulang hingga i>=a, nilai i bertambah 1
                System.out.print("Data ke "+(i+1)+" : ");//mencetak "Data ke "+memanggil nilai (i+1)+" : " saat program dijalankan
                hitung[i]=z.nextInt();//Memasukkan nilai hitung[i] saat program dijalankan
            }
            boolean s = true;//nilai variable s dan bertipe boolean
            while (s=true){//mengulang hingga nilai s tidak sama dengan true
                System.out.print("Masukkan bilangan yang anda cari ? ");//mencetak "Masukkan bilangan yang anda cari ? " saat program dijalankan
                b=z.nextInt();//Memasukkan nilai b saat program dijalankan
                    for(i=0; i<a; i++){//nilai i adalah 0 dan bertipe integer, mengulang hingga i>=a, nilai i bertambah 1
                        if(b==hitung[i]){//jika variable b sama dengan hitung[i]
                        System.out.println("Bilangan "+b+" ada di posisi ke-"+(i+1));//mencetak "Bilangan "+memanggil nilai b+
                                                                            //" ada di posisi ke-"+ memanggil nilai (i+1) saat program dijalankan
                        break;//menghentikan proses
                        }
                    } 
                    if(i==hitung.length){//jika variable i sama dengan jumlah variable hitung
                        System.out.println("Bilangan "+b+" tidak ada.");//mencetak "Bilangan "+memanggil nilai b+
                                                                            //" tidak ada." saat program dijalankan
                        } 
                    System.out.print("Mau cari lagi ? ");//mencetak "Mau cari lagi ? " saat program dijalankan
                    String x=z.next();//Memasukkan nilai x dengan format String saat program dijalankan
                    if("Y".equals(x)||"y".equals(x)){//jika memasukkan nilai y atau Y
                        s=true;//nilai fariable s
                    }
                    if(!"Y".equals(x)&&!"y".equals(x)){//jika memasukkan nilai selain y dan Y
                        s=false;//nilai variable s
                    break;//menghentikan proses
                    }
                }
            }
        else{//selain ekspresi diatas
            System.out.println("Bilangan lebih dari 10 atau kurang dari 0");//menampilkan "Bilangan lebih dari 10 atau kurang dari 0"
                                                                            //saat program dijalankan
            }
        System.out.println("Terima Kasih");//menampilkan "Terima Kasih" saat program dijalankan
    }
}
