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
public class Soal4_145314042 {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        DecimalFormat x=new DecimalFormat(".#");
        System.out.print("Saldo awal            : Rp ");
        double a=z.nextDouble();
        System.out.println("\nSaldo selama 12 bulan untuk 0.1%-1% : ");
        for (double i = 0.1; i <= 1.0; i+=0.1) {
            double t=a;
            System.out.println("Bunga "+Double.valueOf(x.format(i))+"% perbulan :");
            for (int j = 1; j < 12; j++) {
                t=T(i,j,t);
                System.out.println("Bulan ke "+j+" : "+Double.valueOf(x.format(t)));
            }
            System.out.println("Saldo akhir : Rp "+Double.valueOf(x.format(t))+"\n");
            t=a;
        }
    }
    static double T(double i,double j,double t){
        double c=t+(j*(t*i));
        return c;
    }
}
