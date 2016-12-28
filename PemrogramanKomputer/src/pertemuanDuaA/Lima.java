/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanDuaA;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lima {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int a,b,c,e;
        double d;
        System.out.println("TOKO RAMAJU-MAJU");
        System.out.println("");
        System.out.print("  Harga Barang     : ");
        a=z.nextInt();
        System.out.print("  Jumlah Barang    : ");
        b=z.nextInt();
        System.out.println("__________________________");
        c=a*b;
        System.out.println("    Harga Sebelum Discount : "+c);
        d=20.0/100*c;
        System.out.println("    Discount               : "+(int)d); // d berperan sebagai int
        e=(int) (c-d); // e berperan sebagai int
        System.out.println("    Harga Setelah Discount : "+e);
        
    }
}
