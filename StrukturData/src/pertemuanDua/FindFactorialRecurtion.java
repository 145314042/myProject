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
public class FindFactorialRecurtion {
    public static void main(String args[]) {
        System.out.println(findFactorial(5));
    }
    public static int findFactorial(int number) {
        if ((number == 1) || (number == 0)) {
            return 1;
        } else {
            return (number * findFactorial(number - 1));
        }
    }
}
