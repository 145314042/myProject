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
public class Tiga {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        double q,w,e,t;
        System.out.print("Nilai UTS 1 : ");
        q=z.nextDouble();
        System.out.print("Nilai UTS 2 : ");
        w=z.nextDouble();
        System.out.print("Nilai Uas   : ");
        e=z.nextDouble();
        t=(30.0/100*q)+(30.0/100*w)+(40.0/100*e);
        if (t>=80.0)
            System.out.println("Nilai A");
        else if (65<=t&&t<80)
            System.out.println("Nilai B");
        else if (55<=t&&t<65)
            System.out.println("Nilai C");
        else if (55<=t&&t<50)
            System.out.println("Nilai D");
        else if (t<50)
            System.out.println("Nilai E");
    }
}
