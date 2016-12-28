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
public class Latihan3 {
    public static void main(String[] args) {
    int banyak;
    int[] hitung;
    int[] cadangan ;
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan banyak data bulat : ");
    banyak=sc.nextInt();
    hitung = new int[banyak];
    for(int i=0; i<=banyak-1; i++){
    System.out.print("Data ke-"+(i+1)+" : ");
    hitung[i] = sc.nextInt();
    }
    cadangan=hitung;
        for(int i=banyak-1; i >= 0; i--) System.out.println("Data ke-"+ (i+1) 
                +" adalah "+hitung[i]);
        for(int i=banyak-1; i >= 0; i--) System.out.println("Cadangan ke-"
                + (i+1) +" adalah "+cadangan[i]);
        }
}
