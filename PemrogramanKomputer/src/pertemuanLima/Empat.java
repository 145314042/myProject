/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanLima;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Empat {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int g,j;
        double h;
        System.out.print("Golongan   : ");
        g=z.nextInt();
        System.out.print("Jumlah Jam : ");
        j=z.nextInt();
        switch (g){
            case 1 :
                if (g>40){
                    h=(3000*40)+((3.0/2)*3000*(j-40));
                    System.out.println("Gaji yang diperoleh : "+(int)h); }
                else if (g<=40){
                    h=3000*j;
                    System.out.println("Gaji yang diperoleh : "+(int)h); }
                break;
            case 2 :
                if (g>40){
                    h=(3500*40)+((3.0/2)*3500*(j-40));
                    System.out.println("Gaji yang diperoleh : "+(int)h); }
                else if (g<=40){
                    h=3500*j;
                    System.out.println("Gaji yang diperoleh : "+(int)h); }
                break;
            case 3 :
                if (g>40){
                    h=(4000*40)+((3.0/2)*4000*(j-40));
                    System.out.println("Gaji yang diperoleh : "+(int)h); }
                else if (g<=40){
                    h=4000*j;
                    System.out.println("Gaji yang diperoleh : "+(int)h); }
                break;
            case 4 :
                if (g>40){
                    h=(5000*40)+((3.0/2)*5000*(j-40));
                    System.out.println("Gaji yang diperoleh : "+(int)h); }
                else if (g<=40){
                    h=5000*j;
                    System.out.println("Gaji yang diperoleh : "+(int)h); }
                break;
        }
    }
}
