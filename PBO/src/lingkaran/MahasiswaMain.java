/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        
        Mahasiswa mahasiswa1=new Mahasiswa();
        Mahasiswa mahasiswa2=new Mahasiswa();
        
        System.out.println("MAHASISWA 1");
        System.out.print("NIM       : ");
        mahasiswa1.nim=z.next();
        System.out.print("Nama      : ");
        mahasiswa1.nama=z.next();
        System.out.print("Alamat    : ");
        mahasiswa1.alamat=z.next();
        System.out.print("IPK       : ");
        mahasiswa1.ipk=z.nextFloat();
        System.out.println("MAHASISWA 2");
        
        System.out.print("NIM       : ");
        mahasiswa2.nim=z.next();
        System.out.print("Nama      : ");
        mahasiswa2.nama=z.next();
        System.out.print("Alamat    : ");
        mahasiswa2.alamat=z.next();
        System.out.print("IPK       : ");
        mahasiswa2.ipk=z.nextFloat();
    }
}
