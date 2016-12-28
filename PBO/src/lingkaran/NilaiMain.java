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
public class NilaiMain {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        Mahasiswa ms1=new Mahasiswa();
        Mahasiswa ms2=new Mahasiswa();
        Mahasiswa ms3=new Mahasiswa();
        
        System.out.println("Mahasiswa 1");
        System.out.print("Nama   : ");
        ms1.nama=z.next();
        System.out.print("Nilai UTS 1   : ");
        ms1.uts1=z.nextDouble();
        System.out.print("Nilai UTS 2   : ");
        ms1.uts2=z.nextDouble();
        System.out.print("Nilai UAS     : ");
        ms1.uas=z.nextDouble();
        System.out.println("Nilai = "+ms1.HitFinal());
        ms1.nilaiakhir=ms1.HitFinal();
        System.out.println("Nilai Final = "+ms1.hitHuruf());
        
        System.out.println("");
        System.out.println("Mahasiswa 2");
        System.out.print("Nama   : ");
        ms2.nama=z.next();
        System.out.print("Nilai UTS 1   : ");
        ms2.uts1=z.nextDouble();
        System.out.print("Nilai UTS 2   : ");
        ms2.uts2=z.nextDouble();
        System.out.print("Nilai UAS     : ");
        ms2.uas=z.nextDouble();
        System.out.println("Nilai = "+ms2.HitFinal());
        ms2.nilaiakhir=ms2.HitFinal();
        System.out.println("Nilai Final = "+ms2.hitHuruf());
        
        System.out.println("");
        System.out.println("Mahasiswa 3");
        System.out.print("Nama   : ");
        ms3.nama=z.next();
        System.out.print("Nilai UTS 1   : ");
        ms3.uts1=z.nextDouble();
        System.out.print("Nilai UTS 2   : ");
        ms3.uts2=z.nextDouble();
        System.out.print("Nilai UAS     : ");
        ms3.uas=z.nextDouble();
        System.out.println("Nilai = "+ms3.HitFinal());
        ms3.nilaiakhir=ms3.HitFinal();
        System.out.println("Nilai Final = "+ms3.hitHuruf());
    }
}
