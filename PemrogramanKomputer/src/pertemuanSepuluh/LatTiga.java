/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanSepuluh;

/**
 *
 * @author admin
 */
public class LatTiga {
    public static void main(String[] args) {
        System.out.println("Now function test() will be called.");
        test( 10, -7.5); // Call
        System.out.println("And back again in main().");
        }
        static void test(int arg1, double arg2 ) // Definition
        {
        System.out.println("In function test(). \n 1. argument: " + arg1+ "\n 2. argument: "+ arg2 );
    }
}
