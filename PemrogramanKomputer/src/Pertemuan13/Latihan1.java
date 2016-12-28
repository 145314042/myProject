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
public class Latihan1 {
    public static void main(String[] args) {
    int[] hitung;
    hitung = new int[5];
    Scanner inp = new Scanner(System.in);
    System.out.println("Masukkan 5 data bulat");
    for(int i = 0; i <=4; i++){
    System.out.print("Data ke-"+(i+1)+" : ");
    hitung[i] = inp.nextInt();
    }
        for(int i=0; i <= 4; i++) System.out.println("Data ke "+ (i+1) +
                " adalah "+hitung[i]);
        }
}

