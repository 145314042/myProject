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
public class Enam {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.print("Masukkan jumlah huruf A : ");
        int a=z.nextInt();
        while (a>=1){
            for(int b=1;b<=a;b++){
                System.out.print("A");
            }
            a--;
            System.out.println("");
        }
    }
}
