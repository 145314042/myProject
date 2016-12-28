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
public class Tiga {
    public static void main(String[] args) {
         Scanner z=new Scanner(System.in);
         double h1=120000,h2=500000,t;
         int l;
         String k;
         System.out.print("Lama menginap : ");
         l=z.nextInt();
         System.out.print("Apakah berada di suite room?(Y/N) : ");
         k= z.next();
         if ("y".equals(k)||"Y".equals(k))
             t=l*h2;
         else t=l*h1;
         System.out.println("Harga yang harus dibayar : "+t);
    }
}
