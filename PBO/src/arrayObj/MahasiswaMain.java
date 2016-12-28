/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayObj;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.print("Jumlah Mahasiswa : ");
        int jm=z.nextInt();
        Mahasiswa[] mhs=new Mahasiswa[jm];
//        for (int i = 0; i < jm; i++) {
//            mhs[i]=new Mahasiswa();
        //}
        for (int i = 0; i < 10; i++) {
            System.out.println("MAHASISWA "+(i+1));
            System.out.print("NIM           : ");
            mhs[i].setNim(z.next());
            System.out.print("Nama          : ");
            mhs[i].setNama(z.next());
            System.out.print("Alamat E-mail : ");
            mhs[i].setAlamat(z.next());
            System.out.print("IPK       : ");
            mhs[i].setIpk(z.nextFloat());
        }
    }
}
