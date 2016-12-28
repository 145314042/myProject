/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latUTS;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class Satu {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        String a;
        int b,d=0;
        double c=0,e=0,f=0;
        System.out.print("Masukkan ukuran T-Shirt (S,M,L,XL): ");
        a=z.next();
        System.out.print("Masukkan jumlah T-Shirt           : ");
        b=z.nextInt();
        switch (a) {
            case "S" :
                if (b<=5) c=0.05;
                else if (6<=b&&b<=10) c=0.07;
                else if (b>=11) c=0.09;
                d=50000*b;
                e=d*c;
                break;
            case "M" :
                if (b<=5) c=0.06;
                else if (6<=b&&b<=10) c=0.08;
                else if (b>=11) c=0.10;
                d=60000*b;
                e=d*c;
                break;
            case "L" :
                if (b<=5) c=0.07;
                else if (6<=b&&b<=10) c=0.09;
                else if (b>=11) c=0.10;
                d=75000*b;
                e=d*c;
                break;
            case "XL" :
                if (b<=5) c=0.07;
                else if (6<=b&&b<=10) c=0.10;
                else if (b>=11) c=0.12;
                d=80000*b;
                e=d*c;
                break;
            default :
                System.out.println("Format salah");
        }
        f=d-e;
        System.out.print("\nHarga yang harus dibayar : "+d+" - "
        +(int)e+" = "+(int)f);
    }
}
