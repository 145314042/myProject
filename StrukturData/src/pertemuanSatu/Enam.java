/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanSatu;

/**
 *
 * @author Kirizu
 */
public class Enam {
    public static void main(String[] args) {
        int[] X = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println("Array : ");
        for (int i = 0; i < X.length; i++) {
            System.out.print(X[i]+" ");
        }
        System.out.println("\nArray yang bernilai ganjil :");
        for (int i = 0; i < X.length; i++) {
            if(X[i]%2!=0)System.out.print(X[i]+" ");
        }
    }
}
