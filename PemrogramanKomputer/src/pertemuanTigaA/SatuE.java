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
public class SatuE {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        double x, y;
        System.out.print("x = ");
        x=z.nextDouble();
        System.out.print("y = ");
        y=z.nextDouble();
        if (x>=1)
            y++;
        System.out.println("y = "+y);
    }
}
