/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan13;

import java.util.Scanner;

/**
 *
 * @author Budhi Darma P
 */
public class Latihan5 {
     public static void main(String[] args) {
    int[] hitung;
    int input,i ;    
    double jumlah = 0,rata;
    Scanner inp = new Scanner(System.in);
    System.out.print("Masukkan banyak bilangan (maks 10) : ");
    input=inp.nextInt();
    if(input<11&&input>0){  
        hitung = new int[input];
        for(i = 0; i <input; i++){
            System.out.print("Data ke-"+(i+1)+" : ");
            hitung[i] = inp.nextInt();
            jumlah=jumlah+hitung[i];
        }
        rata=jumlah/input;
        System.out.println("Bilangan yang lebih besar dari rata-rata ("+rata
                +") adalah : ");
        for(i = 0; i <input; i++)
            if(rata<hitung[i]){
                System.out.println(hitung[i]+" (urutan "+(i+1)+")");
        }
        }
    else{
        System.out.println("Bilangan lebih dari 10 atau kurang dari 0");}
         System.out.println("Terima Kasih");
        }
}
