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
public class Tiga {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.print("Harga barang : ");
        double a=z.nextDouble();        
        System.out.println("         |             8%             9%             10%            11%");
        System.out.println("---------|-----------------------------------------------------------------");
        for (int b=1;b<=8;b++){
            System.out.print("Tahun "+b+"  |  ");
            for (double c=0.08;c<=0.11;c+=0.01){
                double d=a*Math.pow((1+c), b);
                System.out.printf("%15d",(int) d);
            }
            System.out.println("");
        }
    }
}
//                System.out.print(d+"     ");
