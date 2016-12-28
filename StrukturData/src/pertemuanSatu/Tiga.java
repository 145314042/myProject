/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanSatu;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class Tiga {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        double[] A= {1.5,4.5,6.0,6.7,8.9,9.1};
        System.out.println("Array :");
        for (int i = 0; i < A.length; i++) {
            System.out.println("Array ke-"+(i+1)+" : "+A[i]);
        }
        System.out.print("Array yang akan diganti adalah array ke : ");
        int ganti=z.nextInt();
        System.out.print("Nillai array yang baru : ");
        A[(ganti-1)]=z.nextDouble();
        System.out.println("Susunan array yang baru :");
        for (int i = 0; i < A.length; i++) {
            System.out.println("Array ke-"+(i+1)+" : "+A[i]);
        }
    }
}
