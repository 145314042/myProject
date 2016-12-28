/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanSatuB;

/**
 *
 * @author admin
 */
public class JarakTempuh1 {
    public static void main(String[] args) {
        int v,a,t;
        double St;
        v=10;
        a=20;
        t=10;
        St=(v*t)+(1.0/2*a*t*t);
        System.out.println("Mobil yang memiliki kecepatan "+v+" m/s dengan percepatan "+a+" m2/s selama "+t+" detik,");
        System.out.println("akan menempuh jarak "+St+" km");
    }
}
