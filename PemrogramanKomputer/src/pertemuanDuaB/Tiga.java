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
public class Tiga {
    public static void main(String[] args) {
        double r1, r2, r3, rt;
        Scanner z=new Scanner(System.in);
        System.out.print("Besar r1 = ");
        r1=z.nextDouble();
        System.out.print("Besar r2 = ");
        r2=z.nextDouble();
        System.out.print("Besar r3 = ");
        r3=z.nextDouble();
        rt=1.0/((1.0/r1)+(1.0/r2)+(1.0/r3));
        System.out.println("Besar resistor : "+rt);
    }
}
