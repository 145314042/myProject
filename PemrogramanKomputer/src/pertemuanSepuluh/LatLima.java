/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanSepuluh;

/**
 *
 * @author admin
 */
public class LatLima {
    public static void main(String[] args) {
        System.out.println("Volume kotak :"+box (7,20,4));
        System.out.println("Volume dua kotak : "+2*box (7,20,4));
        System.out.println("Volume tiga kotak : "+3*box (7,20,4));
        }
        static int box(int length, int width, int height) {
        return length*width*height;
    }
}
