/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanDua;

/**
 *
 * @author Kirizu
 */
public class RecurtionA2 {
    public static void main(String args[]) {
        count(0);
        System.out.println();
    }
    public static void count(int index) {
        if (index < 2) {
            count(index + 1);
        }
        System.out.print(index);
    }
}
