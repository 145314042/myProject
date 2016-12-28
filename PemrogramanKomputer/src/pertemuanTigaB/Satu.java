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
public class Satu {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        double a, b, c, D, x1, x2;
        System.out.print("Koefisien x2 (a) : ");
        a = z.nextDouble();
        System.out.print("Koefisien x (b) : ");
        b = z.nextDouble();
        System.out.print("Konstanta (c) : ");
        c = z.nextDouble();
        D = b* b - (4*a*c);
        if (D <0 ){// tidak punya akar real
            System.out.println("Tidak mempunyai akar nyata/real");
        }
        else if (D == 0 ) {// akarnya sama
            x1 = -b/(2*a);
            System.out.println("Akarnya tunggal yakni : "+x1);
        }
        else {// akarnya dua berbeda
            x1 = (-b + Math.sqrt(D))/ (2*a);
            x2 = (-b - Math.sqrt(D))/ (2*a);
            System.out.println("Akar pertama : "+x1);
            System.out.println("Akar kedua : "+x2);
        }
    }
}
    

