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
public class TugasTiga {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.print("Nilai x : ");
        int a=z.nextInt();
        System.out.print("Nilai y : ");
        int b=z.nextInt();
        pangkat(a,b);
    }
    static int pangkat (int a,int b){
        int d=a;
        for (int c = 0; c < (b-1); c++) {
            d=d*a;}
            System.out.println("Hasil pangkat : "+d);
            return d;
    }
}
