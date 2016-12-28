/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanLima;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class Lima {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int g;
        double p,h,h2;
        System.out.print("Pemakaian (kWh) : ");
        p=z.nextInt();
        System.out.print("Golongan        : ");
        g=z.nextInt();
        switch (g) {
            case 1 :
                if (p<100){
                    h=1000*100;
                    System.out.println("Biaya : "+(int)h);}
                else if (p>=100&&p<1000){
                    h=p*1000;
                    System.out.println("Biaya : "+(int)h);}
                else if (p>=1000){
                    h=p*1000;
                    h2=h+((10.0/100)*h);
                    System.out.println("Biaya : "+(int)h2);} 
                break;
            case 2 :
                if (p<100){
                    h=2000*100;
                    System.out.println("Biaya : "+(int)h);}
                else if (p>=100&&p<1000){
                    h=p*2000;
                    System.out.println("Biaya : "+(int)h);}
                else if (p>=1000){
                    h=p*2000;
                    h2=h+((10.0/100)*h);
                    System.out.println("Biaya : "+(int)h2);}
                break;
        }
    }
}
