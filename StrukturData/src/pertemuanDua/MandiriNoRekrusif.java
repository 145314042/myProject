/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanDua;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class MandiriNoRekrusif {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.print("Jumlah bilangan pertama yang akan ditambahkan : ");
        int jumlah=z.nextInt();
        System.out.println("Jumlah bilangan  pertama yang akan ditambahkan : ");
        if (jumlah==1)System.out.println("1");
        else if(jumlah>1){
            System.out.print("1");
            for (int i = 2; i <= jumlah; i++) {
                System.out.print(" + "+i);
            }
            int total=0;
            for (int i = 1; i <= jumlah; i++) {
                total=total+i;
            }
            System.out.println(" = "+total);
        }
    }
}
