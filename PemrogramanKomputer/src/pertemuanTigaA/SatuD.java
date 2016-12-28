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
public class SatuD {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        double x;
        System.out.print("x = ");
        x=z.nextDouble();
        if (1<=x&&x<=10)
            System.out.println(x);
        else System.out.println(" ");
    }
}
