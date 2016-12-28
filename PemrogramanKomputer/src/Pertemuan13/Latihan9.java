/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan13;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Budhi Darma P
 */
public class Latihan9 {
    public static void main(String[] args) {
        int[] data;
        int a,b,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Banyak anggota dalam array : ");
        a=sc.nextInt();
        System.out.println("Masukkan data anggota array : ");
        data=new int [a];
        for(i=0;i<data.length;i++){
            data[i] = sc.nextInt();
        }
        System.out.println("Setelah diurutkan: ");
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
       }
}
