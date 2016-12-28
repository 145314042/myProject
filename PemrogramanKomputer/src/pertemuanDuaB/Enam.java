/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanDuaB;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Enam {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        double b,s,p;
        System.out.println("Mulai");
        System.out.print("Masukkan bilangan a kurang dari 100 : ");
        b=z.nextDouble();
        p=(int)b/10;
        s=b%10;
        System.out.println((int)b+" = "+(int)p+" puluhan dan "+(int)s+" satuan");
        System.out.println("Selesai.");
    }
}
