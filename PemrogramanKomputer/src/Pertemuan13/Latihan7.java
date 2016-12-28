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
public class Latihan7 {
    public static void main(String[] args) {
    int banyak,bil;
    int[] hitung;
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah deret : ");
    banyak=sc.nextInt();
    hitung = new int[banyak];
    hitung[0]=1;
    hitung[1]=1;
    System.out.print("Deret adalah : "+hitung[0]+","+hitung[1]+",");
        for(int i=2; i<=banyak-1; i++){
            hitung[i]=hitung[i-1]+hitung[i-2];
            System.out.print(hitung[i]);
            if(i<banyak-1)
                System.out.print(",");
        }
    }
}
