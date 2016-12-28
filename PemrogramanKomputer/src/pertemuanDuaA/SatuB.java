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
public class SatuB {
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
        p=(8.0-a)*(6.0-b)+Math.pow(c,2);
        System.out.println("Hasil p = "+p);
    }
}
//a=5 b=2 c=6 p=48