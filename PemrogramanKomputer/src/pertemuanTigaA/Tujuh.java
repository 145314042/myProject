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
public class Tujuh {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        double a,b,c;
        System.out.print("Bilangan pertama : ");
        a=z.nextDouble();
        System.out.print("Bilangan kedua   : ");
        b=z.nextDouble();
        if (a>b){
            c=a-b;
            System.out.println("Hasil pengurangan "+a+" dikurangi "+b+" adalah "+c);
        }
        else {
            c=b-a;
            System.out.println("Hasil pengurangan "+b+" dikurangi "+a+" adalah "+c);
    }
    }
}
