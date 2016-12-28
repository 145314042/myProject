/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanEnam;

/**
 *
 * @author Kirizu
 */
public class LTiga {
    public static void main(String[] args) {
        int a=0,b=0;
        while (a<16) {
            b=a+b;
            a=a+5;
        }
        System.out.println("Jumlah dari 5+10+…+100 = "+b);
    }
}
