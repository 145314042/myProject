/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanTigaA;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lima {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        double a,i;
        System.out.print("Masukkan tahun angkatan : ");
        a=z.nextDouble();
        System.out.print("Masukkan IPS : ");
        i=z.nextDouble();
        if (a>2012&&i>3.0){
            System.out.println("Anda dapat menjadi asisten.\n");
            System.out.println("Cek nilai matakuliah yang diinginkan.");
        }
        System.out.println("Terima kasih atas partisipasi anda.");
    }
}
