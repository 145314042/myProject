/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanDuaB;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lima {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        double x1,x2,x3,y1,y2,y3,s,L,K,A,B,C,a,b,c;
        System.out.print("Nilai x1 : ");
        x1=z.nextDouble();
        System.out.print("Nilai y1 : ");
        y1=z.nextDouble();
        System.out.print("Nilai x2 : ");
        x2=z.nextDouble();
        System.out.print("Nilai y2 : ");
        y2=z.nextDouble();
        System.out.print("Nilai x3 : ");
        x3=z.nextDouble();
        System.out.print("Nilai y3 : ");
        y3=z.nextDouble();
        
        a=Math.sqrt((Math.pow(x1,2)-2*x1*x2+Math.pow(x2,2))+(Math.pow(y1,2)-2*y1*y2+Math.pow(y2,2)));
        b=Math.sqrt((Math.pow(x3,2)-2*x3*x2+Math.pow(x2,2))+(Math.pow(y3,2)-2*y3*y2+Math.pow(y2,2)));
        c=Math.sqrt((Math.pow(x1,2)-2*x3*x1+Math.pow(x3,2))+(Math.pow(y1,2)-2*y3*y1+Math.pow(y3,2)));
        //c=Math.sqrt((Math.pow(x3,2)-2*x3*x1+Math.pow(x1,2))+(Math.pow(y3,2)-2*y3*y1+Math.pow(y1,2)));
        
        K=a+b+c;
        s=(1.0/2.0)*K;
        L=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Luas Segitiga sembarang : "+L);
        System.out.println("Keliling Segitiga sembarang : "+K);
    }
}
