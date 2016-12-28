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
public class TEnam {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int b;
        System.out.print("Masukkan bilangan yang akan dibagi : ");
        b=z.nextInt();
        System.out.println("Hasil bagi dengan 2 berturut-turut adalah :");
        while (b>1){
            b=b/2;
            System.out.println(b);
        }
    }
}
