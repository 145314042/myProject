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
public class Empat {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        double r,L,K;
        System.out.print("Jari-jari : ");
        r=z.nextInt();
        K=2.0*(22.0/7)*r;
        L=(22.0/7)*Math.pow(r,2);
        System.out.println("Luas Lingkaran = "+L);
        System.out.println("Keliling Lingkaran = "+K);
    }
}
