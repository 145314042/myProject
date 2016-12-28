/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanSepuluh;

/**
 *
 * @author admin
 */
public class LatEmpat {
    public static void main(String[] args) {
        double x = 3.5, y = 7.2, res;
        res = area( x, y+1); // Call
        // To output to two decimal places:
        System.out.println("\n The area of a rectangle \n with width " + x + "\n and length " +y+1+ "\n is " + res);
        }
        static double area( double width, double len)
        {
        return (width * len); // Returns the result.
    }
}
