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
public class digit {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int b=0;
        System.out.print("Bilangan : ");
        double a=z.nextDouble();
        while (a>0){
            a=a/10;
            b++;
        }
        System.out.println("Jumlah digit : "+b);
    }
}
