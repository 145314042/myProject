/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanSepuluh;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class TugasEmpat {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.print("nilai n : ");
        int n=z.nextInt();
        System.out.print("nilai r : ");
        int r=z.nextInt();
        C(n,r);
    }
    static void C (int n,int r){
        if (r<=n){
            int a=1,b=1,c=1;
        for (int d=1;d<=n;d++) {
            a=a*d;}
        for (int d=1;d<=r;d++) {
            b=b*d;}
        for (int d=1;d<=(n-r);d++) {
            c=c*d;}
        double e=a/(c*b);
        System.out.print("C("+n+","+r+") = "+e);
        }
        else System.out.println("Bilangan salah");
    }
}
