/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanTigaB;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class Dua {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        double n;
        String p;
        System.out.print("Masukkan nomor       : ");
        n=z.nextDouble();
        System.out.print("Masukkan password    : ");
        p=z.next();
        if ((n==001 &&"abcd".equals(p)) || (n==002 &&"qwer".equals(p))
            || (n==003 &&"zxcv".equals(p)))  
            System.out.println("Selamat datang di Sistem Informasi Mahasiswa");
        else System.out.println("Nomor atau Password anda salah");        
    }
}
