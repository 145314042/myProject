/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanSepuluh;

/**
 *
 * @author admin
 */
public class LatSatu {
    public static void main(String[] args) {
        // Menulis bintang( * ) memakai metode
        bintang (5);// 5 bintang
        bintang (7);// 7 bintang
        bintang(10);// 10 bintang
        }
        static void bintang(int n) {
            for (int i = 1; i <= n; i++)
            System.out.print(" * ");
            System.out.println("");
    }
}
