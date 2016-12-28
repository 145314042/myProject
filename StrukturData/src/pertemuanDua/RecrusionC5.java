/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanDua;

/**
 *
 * @author Kirizu
 */
public class RecrusionC5 {
    public static void main(String[] args) {
        System.out.println(paijo(3));
    }
    public static int paijo(int x) {
        if (x == 0)return 0;
        return (2 * paijo(x - 1) + x * x);
    }
}
