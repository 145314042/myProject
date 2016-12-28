/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayObj;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class ArrayHitung {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int i;    
        int[] hitung = new int[5];
        System.out.println("Masukkan 5 angka : ");
        for (i=0; i<=4; i++)
            hitung[i] = z.nextInt();
        olahArray(hitung);
        System.out.println("Nilai akhir setelah masuk method : ");
       for (i=0; i<=4; i++)
           System.out.println(hitung[i]);
    }
    
    private static void olahArray(int[] arrHitung){
        for (int i=0; i<=4; i++)
            arrHitung[i]=arrHitung[i]+1;
    }
}
