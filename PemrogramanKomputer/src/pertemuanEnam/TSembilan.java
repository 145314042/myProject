/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanEnam;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class TSembilan {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        double a=1;
        String b = null;
        while (a!=20){
            System.out.print("Masukkan bilangan tebakan anda : ");
            a=z.nextInt();
            if (a==20){
                System.out.println("Tebakan anda benar");
                System.out.println("Terima kasih telah menggunakan program ini.");}
            else if (a!=20){
                System.out.println("Masih salah tuh..");
                while (a!=2.2){
                    System.out.print("\nIngin tebak lagi? ");
                    b=z.next();
                    if ("y".equals(b)||"Y".equals(b)) a=2.2;
                    else if ("n".equals(b)||"N".equals(b)||"t".equals(b)||"T".equals(b)) {
                        a=2.2;
                        System.out.println("Terima kasih anda sudah menggunakan program ini");}
                    else System.out.println("Pilihan salah");}
                if ("n".equals(b)||"N".equals(b)||"t".equals(b)||"T".equals(b))
                    a=20;
                else if ("y".equals(b)||"Y".equals(b))  a=2.2;
                else a=2.2;
            }
        }
    }
}