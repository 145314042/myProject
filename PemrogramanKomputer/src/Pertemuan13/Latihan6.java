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
public class Latihan6 {
    public static void main(String[] args) {
    int[] hitung;
    int i,input,cocok;    
    double jumlah = 0;
    Scanner inp = new Scanner(System.in);
    System.out.print("Masukkan banyak bilangan (maks 10) : ");
    input=inp.nextInt();
    if(input<11&&input>0){  
        hitung = new int[input];
        for(i = 0; i<input; i++){
            System.out.print("Data ke-"+(i+1)+" : ");
            hitung[i] = inp.nextInt();
        }
        boolean s = true;
        while (true){
            System.out.print("Masukkan bilangan yang anda cari ? ");
            cocok=inp.nextInt();
                for(i=0; i<input; i++){          
                 if(cocok==hitung[i]){
                    System.out.println("Bilangan "+cocok+" ada di posisi ke-"
                            +(i+1));
                    break; 
                    }
                } 
                if(i==hitung.length){
                    System.out.println("Bilangan "+cocok+" tidak ada.");
                    } 
                System.out.print("Mau cari lagi ? ");
                String x=inp.next();
                if("Y".equals(x)||"y".equals(x)){
                    s=true;
                }
                if(!"Y".equals(x)&&!"y".equals(x)){
                    s=false;
                break;
                }
                }
            }
    else{
        System.out.println("Bilangan lebih dari 10 atau kurang dari 0");
        }
    System.out.println("Terima Kasih");
    }
}
