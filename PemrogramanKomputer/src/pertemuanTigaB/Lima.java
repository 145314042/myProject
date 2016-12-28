/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanTigaB;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class Lima {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        double a,b,c;
        System.out.print("Masukkan bilangan pertama : ");
        a=z.nextDouble();
        System.out.print("Masukkan bilangan kedua   : ");
        b=z.nextDouble();
        System.out.print("Masukkan bilangan ketiga  : ");
        c=z.nextDouble();
        if (a>b&&a>c)
            System.out.println("Bilangan terbesar adalah "+a);
        else if (b>a&&b>c)
            System.out.println("Bilangan terbesar adalah "+b);
        else if (c>a&&c>b)
            System.out.println("Bilangan terbesar adalah "+c);
    }
}
