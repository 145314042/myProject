/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanDelapan;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class Empat {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.print("Jumlah : ");
        int c=z.nextInt();
        System.out.print("    x |");
        for (int a=1;a<=c;a++){
            System.out.printf("%5d",a);}
        System.out.println("");
        System.out.print("-------");
        for (int a=1;a<=c;a++){
            System.out.print("-----");}
        System.out.println("");
        for (int a=1;a<=c;a++){
            System.out.printf("%5d",a);
            System.out.print(" |");
            for (int b=1;b<=c;b++){
                double d=a*b;
                System.out.printf("%5d",(int)d);}
            System.out.println("");
        }
    }
}
