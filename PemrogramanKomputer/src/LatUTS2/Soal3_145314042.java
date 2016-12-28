/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LatUTS2;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class Soal3_145314042 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int[] bilangan;
        System.out.print("Masukkan jumlah deret : ");
        int a=z.nextInt();
        bilangan=new int[a];
        System.out.print("Deret adalah : ");
        bilangan[0]=1;
        bilangan[1]=1;
        if (a==1)System.out.print("1");
        else if (a==2)System.out.print("1,1");
        else if (a>=3){
            System.out.print("1,1");
            for(int b=2;b<a;b++){
                bilangan[b]=bilangan[b-1]+bilangan[b-2];
                System.out.print(","+bilangan[b]);
            }
        }
        else System.out.print("data error");
        System.out.println("");
    }
}


//™®®™™®®™™®®™™®®™™®®™™®®™™®®™™®®™™®®™//
//NAMA  = THOMAS YANUAR NUGROHO ARIYADI      //
//NOMOR = 145314042                          //
//™®®™™®®™™®®™™®®™™®®™™®®™™®®™™®®™™®®™//