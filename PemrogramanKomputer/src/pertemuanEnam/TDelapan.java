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
public class TDelapan {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int a=1;
        while (a!=20){
            System.out.print("Masukkan bilangan tebakan anda : ");
            a=z.nextInt();
            if (a==20){ 
                System.out.println("Tebakan anda benar");
                System.out.println("Terima kasih telah menggunakan program ini.");}
            else System.out.println("Masih salah tuh..");
        }
    }
}
