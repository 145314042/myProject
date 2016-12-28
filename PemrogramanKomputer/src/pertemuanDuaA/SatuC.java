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
public class SatuC {
    public static void main(String[] args) {
        int a,b;
        double p;
        Scanner zz=new Scanner(System.in);
        System.out.print("Masukkan nilai a : ");
        a=zz.nextInt();
        System.out.print("Masukkan nilai b : ");
        b=zz.nextInt();
        p=(Math.sqrt((2.0*Math.pow(a,2))+(3.0*b)+4))+(10.0*b);
        System.out.println("Nilai p = "+p);
    }
}
//a=2 b=3 p=34.58257