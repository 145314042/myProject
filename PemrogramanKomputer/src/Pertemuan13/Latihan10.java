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
public class Latihan10 {
 public static void main(String[] args) {
    int a,b,i,j;
    int[] data1;
    int[] data2;
    Scanner sc = new Scanner(System.in);
    System.out.print("Banyak anggota dalam array: ");
    a=sc.nextInt();
    b=a;
    System.out.println("Masukkan anggota array 1: ");
        data1=new int[a];
        for(i = 0; i <a; i++){
        data1[i] = sc.nextInt();
        }
    System.out.println("Masukkan anggota array 2: ");
        data2=new int[b];
        for(j = 0; j <a; j++){
        data2[j] = sc.nextInt();
        }
    System.out.println("Anggota Array; 1 yang juga menjadi anggota Array 2:");
     for ( i = 0; i <a; i++)
     for (j = 0; j <a; j++){
        if(data2[j]==data1[i]){
            System.out.print(""+data1[i]+"         "); 
     }
     }
    }    
}
