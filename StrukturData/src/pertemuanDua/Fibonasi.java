/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanDua;

/**
 *
 * @author Kirizu
 */
public class Fibonasi {
    public static void main(String args[]) {
        System.out.println(fibo(5));
    }
    public static int fibo(int n) {
        if ((n == 2)||(n == 1))return 1;
        else return fibo(n-2)+fibo(n-1);
    }
}
