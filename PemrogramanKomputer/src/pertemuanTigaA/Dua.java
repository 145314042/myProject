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
public class Dua {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        double r, v;
        double phi=3.14;
        System.out.print("Masukkan jari-jari lingkaran : ");
        r=z.nextInt();
        if (r>0)
            v = (phi * Math.pow(r,2));
        else v = 0;
        System.out.println("Volume kerucut : "+v);
    }
}
