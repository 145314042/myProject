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
public class Latihan4 {
    public static void main(String[] args) {
    int[] hitung;
    int max=0,min=Integer.MAX_VALUE;
    double jumlah = 0,rata;
    hitung = new int[5];
    Scanner inp = new Scanner(System.in);
    System.out.println("Masukkan 5 data bulat");
    for(int i = 0; i <=4; i++){
    System.out.print("Data ke-"+(i+1)+" : ");
    hitung[i] = inp.nextInt();
    if (hitung[i]>max){
        max=hitung[i];
        }
    if (hitung[i]<min){
        min=hitung[i];
        }
    jumlah=jumlah+hitung[i];
    }
    rata=jumlah/5;
        System.out.println("Rata - rata bilangan : "+rata);
        System.out.println("Nilai maksimum : "+max);
        System.out.println("Nilai minimum : "+min);
        }
}
