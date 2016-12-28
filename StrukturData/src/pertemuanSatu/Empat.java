/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanSatu;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class Empat {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int[] Nilai={9,8,7,6,5,4,3,2,1};
        System.out.println("Array sebelum :");
        for (int i = 0; i < Nilai.length; i++) {
            System.out.print(Nilai[i]+" ");
        }
        Arrays.sort(Nilai);
        System.out.println("\nArray sesudah :");
        for (int i = 0; i < Nilai.length; i++) {
            System.out.print(Nilai[i]+" ");
        }
    }
}
