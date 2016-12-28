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
public class Soal2_145314042 {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.print("Suhu awal : ");
        int ss=z.nextInt();
        System.out.println("Tabel konversi suhu");
        System.out.println("Celcius Reamuhr Fahrenheit");
        for (int i = ss; i <= (10*ss); i+=10) {
            System.out.print(i);
            System.out.print("\t"+R(i));
            System.out.print("\t"+F(i));
            System.out.println("");
        }
    }
    static double R(double i){
        double r=i*0.8;
        return r;
    }
    static double F(double i){
        double f=i*1.8+32;
        return f;
    }
}


//™®®™™®®™™®®™™®®™™®®™™®®™™®®™™®®™™®®™//
//NAMA  = THOMAS YANUAR NUGROHO ARIYADI      //
//NOMOR = 145314042                          //
//™®®™™®®™™®®™™®®™™®®™™®®™™®®™™®®™™®®™//