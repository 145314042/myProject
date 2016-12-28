/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanDelapan;

/**
 *
 * @author Kirizu
 */
public class LEmpat {
    public static void main(String[] args) {
        for (int j =1; j<= 10; j=j+2){
            for(int k=8; k >= j; k=k-2) System.out.print(" ");
                for(int i=1; i<=j; i++)System.out.print("*");
                System.out.println();
        }
    }
}
