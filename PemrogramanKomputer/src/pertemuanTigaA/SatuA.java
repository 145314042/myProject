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
public class SatuA {
    public static void main(String[] args) {
        double x, y;
        Scanner z=new Scanner(System.in);
        System.out.print("x = ");
        x=z.nextDouble();
        System.out.print("y = ");
        y=z.nextDouble();
        if (1 + x > Math.pow(x, Math.sqrt(2)))
            y=y+x;
        System.out.println("y = "+y);
    }
}
