/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LatUTS2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class Soal4_145314042_Beta {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        DecimalFormat x = new DecimalFormat(".#");
        System.out.print("Masukkan jumlah saldo : ");
        double a=z.nextDouble();
        System.out.print("Masukkan jumlah bulan : ");
        double b=z.nextDouble();
        for (double c = 0.1; c <=1.0 ; c+=0.1) {
            System.out.print(Double.valueOf(x.format(c))+"%\t");
        }
        System.out.println("");
        for (int i = 1; i <= b; i++) {
            System.out.print(T(a,i));
        }
    }
    static double T(double a,double i){
        double t=a;
        DecimalFormat x=new DecimalFormat(".#");
        for (double j = 0.1; j < 1.0; j+=0.1) {
            t=t+(i*(a*j));
            System.out.print(Double.valueOf(x.format(t))+"\t");
        }
        System.out.println("");
        return t;
    }
}
//for (double j = 0.1; j < 0.9; j+=0.1) {
//            t=a+(i*(a*j));
//            System.out.print(Double.valueOf(x.format(t))+"\t");
//        }


//static double T(double a,double i) {
//        double t = 0;
//        double f=0.1;
//        DecimalFormat x = new DecimalFormat(".#");
//        while(f<=1){
//            t=a+(i*(a*f));
//            System.out.print(Double.valueOf(x.format(t))+"\t");
//            f+=0.1;
//        }
//        return t;
//    }