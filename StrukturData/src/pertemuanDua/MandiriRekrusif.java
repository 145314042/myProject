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
public class MandiriRekrusif {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.print("Jumlah bilangan pertama yang akan ditambahkan : ");
        int n=z.nextInt();
        System.out.println("Jumlah "+n+" bilangan pertama adalah = "+algoritma(n));
    }
    public static int algoritma(int n){
        if (n==0)return 0;
        else if (n==1){
            System.out.println("1");
            return 1;
        }
        else {
            System.out.print(n+" + ");
            return (n+algoritma(n-1));
        }
    }
}
