/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class KalkulatorMain {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int i=1,j=1;
        double hasil = 0;
        String coba;
        Kalkulator cal=new Kalkulator();
        do{
            System.out.print("Masukkan bilangan 1 : ");
            double bil1=z.nextDouble();
            cal.setBil1(bil1);
            System.out.print("Masukkan bilangan 2 : ");
            double bil2=z.nextDouble();
            cal.setBil2(bil2);
            System.out.print("Masukkan jenis operasi (+,-,*,/) : ");
            String operasi=z.next();
            switch (operasi){
                case "+" : hasil=cal.penjumlahan();
                           break;
                case "-" : hasil=cal.pengurangan();
                           break;
                case "*" : hasil=cal.perkalian();
                           break;
                case ":" : hasil=cal.pembagian();
                           break;
                default : System.out.println("error");
            }
            System.out.println("\nHasil dari "+bil1+" "+operasi+" "+bil2+" = "+hasil+"\n");
            do{
                System.out.println("Mau coba lagi??(Y/N) ");
                coba=z.next();
                switch (coba){
                    case "y" :
                    case "Y" :
                        j=1;
                        i=0;
                        break;
                    case "n" : 
                    case "N" :
                        j=1;
                        i=1;
                        break;
                    default :
                        System.out.println("\nCode Salah!!!\n");
                        j=0;
                        break;
                }
            }while (j==0);
        }while (i==0);
        System.out.println("\nTerima Kasih");
    }
}
