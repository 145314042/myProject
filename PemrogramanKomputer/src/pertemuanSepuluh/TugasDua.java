/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanSepuluh;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class TugasDua {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.print("NIM  : ");
        String a=z.next();
        System.out.print("Nama : ");
        String b=z.next();
        scan(a,b);
    }
    static void scan(String a,String b){
        System.out.println("NIM  : "+a);
        System.out.println("Nama : "+b);
    }
}
