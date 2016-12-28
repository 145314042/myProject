/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanEmpat;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class Lima {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        double a,b,c;
        System.out.print("Nilai sisi a : ");
        a=z.nextDouble();
        System.out.print("Nilai sisi b : ");
        b=z.nextDouble();
        System.out.print("Nilai sisi c : ");
        c=z.nextDouble();
        if (a==b&&a==c)
            System.out.println("Segitiga Sama Sisi");
        else if (a==b||a==c||b==c)
            System.out.println("Segitiga Sama Kaki");
        else if ((Math.pow(a,2)==(Math.pow(b,2)+Math.pow(c, 2)) ||
                (Math.pow(b,2)==(Math.pow(a,2)+Math.pow(c, 2))) ||
                (Math.pow(c,2)==(Math.pow(a,2)+Math.pow(b, 2)))))
            System.out.println("Segitiga Siku-siku");
        else System.out.println("Segitiga Sembarang");
    }
}
