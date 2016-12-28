/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanDuaA;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SatuD {
    public static void main(String[] args) {
        int a,b,c;
        double p;
        Scanner z=new Scanner(System.in);
        System.out.print("Masukkan nilai a = ");
        a=z.nextInt();
        System.out.print("Masukkan nilai b = ");
        b=z.nextInt();
        System.out.print("Masukkan nilai c = ");
        c=z.nextInt();
        p=((Math.sqrt(7.0*a))/(c-10.0))-(Math.sqrt(((3.0*b)+25.0)/(c+13.0)));
        System.out.println("Hasil P = "+p);
    }
}
//a=5 b=3 c=15 p=0.081269