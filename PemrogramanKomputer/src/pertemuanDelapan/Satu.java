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
public class Satu {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.print("Jumlah : ");
        int c=z.nextInt();
        for (int a=1;a<=c;a++){
            for (int b=1;b<=c;b++){
                if (b==a) System.out.print("1   ");
                else  System.out.print("0   ");}
            System.out.println("");
        }
    }
}
