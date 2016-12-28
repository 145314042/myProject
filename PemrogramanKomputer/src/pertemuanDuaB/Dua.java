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
public class Dua {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        double t,b;
        String n;
        System.out.println("PROGRAM BERAT IDEAL  ");
        System.out.print("Nama Anda : ");
        n=z.nextLine();
        System.out.print("Tinggi Anda (cm) : ");
        t=z.nextInt();
        b=t-100.0;
        System.out.println("Berat ideal "+n+" adalah : "+b);
    }
}
