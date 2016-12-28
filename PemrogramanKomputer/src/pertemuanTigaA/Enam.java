/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanTigaA;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Enam {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        double x,y;
        String a,b;
        System.out.print("Masukkan nama : ");
        a=z.next();
        System.out.print("Masukkan umur : ");
        x=z.nextDouble();
        System.out.print("");
        System.out.print("Masukkan nama : ");
        b=z.next();
        System.out.print("Masukkan umur : ");
        y=z.nextDouble();
        if (x>y)
            System.out.println(a+" lebih tua dari "+b);
        else System.out.println(b+" lebih tua dari "+a);
    }
}
