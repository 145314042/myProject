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
public class SatuA {
    public static void main(String[] args) {
        int a,b;
        double p;
        Scanner zz=new Scanner(System.in);
        System.out.print("Masukkan nilai a : ");
        a=zz.nextInt();
        System.out.print("Masukkan nilai b : ");
        b=zz.nextInt();
        p=(a-10.0)/(a+12.0*b);
        System.out.println("Nilai p = "+p);
    }
}
//a=15 b=2 p+0.128205