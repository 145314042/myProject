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
public class Lima {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.print("Masukkan bilangan terbesar yang ingin dijumlahkan : ");
        int a=z.nextInt();
        if (a==1)System.out.println("1 = 1");
        else{
            for (int b=1;b<=a;b++){
                System.out.print("1");
                int d=1;
                for(int c=2;c<=b;c++){
                    System.out.print("+"+c);
                    d=d+c;
                }
                System.out.println(" = "+d);
            }
        }
    }
}
//System.out.println("1 = 1");
//            System.out.print("1");
//            for (int b=2;b<=a;b++){
//            for (int c=2;c<=a;c++){
//                System.out.print("+"+c);
//            }
//            d=d+b;
//            System.out.print(" = "+d);
//            System.out.println("");
//            }