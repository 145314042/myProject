/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanDelapan;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class Dua {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int a,b,c=0,d1=0,d2=0,d3=0,d4=0,d5=0;
        System.out.print("Jumlah penduduk : ");
        a=z.nextInt();
        do {c++;
            System.out.print("Usia warga "+c+"  : ");
            b=z.nextInt();
            if (0<=b&&b<=20)d1++;
            else if (21<=b&&b<=40)d2++;
            else if (41<=b&&b<=60)d3++;
            else if (61<=b&&b<=80)d4++;
            else if (81<=b&&b<=100)d5++;
        }while(c<a);
        System.out.println("\nDistribusi usia "+c+" penduduk di atas adalah : \n");
        System.out.print(" 0 – 20  : ");
        for (int e1=1;e1<=d1;e1++)System.out.print("*");
        System.out.println("");
        System.out.print("21 – 40  : ");
        for (int e2=1;e2<=d2;e2++)System.out.print("*");
        System.out.println("");
        System.out.print("41 – 60  : ");
        for (int e3=1;e3<=d3;e3++)System.out.print("*");
        System.out.println("");
        System.out.print("61 – 80  : ");
        for (int e4=1;e4<=d4;e4++)System.out.print("*");
        System.out.println("");
        System.out.print("81 – 100 : ");
        for (int e5=1;e5<=d5;e5++)System.out.print("*");
        System.out.println("");
    }
}
