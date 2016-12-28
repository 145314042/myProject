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
public class LTiga {
    public static void main(String[] args) {
        for (int j =1; j<= 10; j++){
            for(int i=1; i<= 10 - j; i++)System.out.print("*");
            System.out.println();
        }
    }
}
