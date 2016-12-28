/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Im3;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class Im3 {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        System.out.println("Aplikasi membandingkan harga paket\nIM3 Seru Anti Galau Dan Im3 Sekalee\n");
        System.out.println("Jenis Layanan :\n1. Telpon\n2. SMS");
        System.out.print("Masukkan nomor jenis layanan : ");
        int layanan=z.nextInt();
        switch (layanan){
            case 1 :
                System.out.print("Lama Bicara (Menit) : ");
                int lama=z.nextInt();
                System.out.println("Pilih Operator : ");
                System.out.println("\t1. Sesama\n\t2. Lain : ");
                System.out.print("\t\tPilih nomor : ");
                int operator=z.nextInt();
                System.out.println("Waktu telepon, jam dan menit : ");
                System.out.print("\tJam (0-24) : ");
                int Tjam=z.nextInt();
                System.out.print("\tMenit (0-60) : ");
                int Tmenit=z.nextInt();
                System.out.println("");
                T(lama,operator,Tjam,Tmenit);
                break;
            case 2 :
                System.out.print("Jumlah SMS :");
                int Sjumlah=z.nextInt();
                System.out.println("Waktu SMS, jam dan menit : ");
                System.out.print("\tJam (0-24) : ");
                int Sjam=z.nextInt();
                System.out.print("\tMenit (0-60) : ");
                int Smenit=z.nextInt();
                System.out.println("");
                S(Sjumlah,Sjam,Smenit);
                break;
            default :
                System.out.println("Nomor layanan salah");
        }
    }

    private static void T(int lama, int operator, int Tjam, int Tmenit) {
        System.out.println("Jenis layanan : Telepon");
        System.out.print("Jenis operator : ");
        if (operator==1)System.out.println("Sesama");
        else if (operator==2)System.out.println("Lain");
        System.out.println("Waktu mulai Telepon : "+Tjam+"."+Tmenit);
        System.out.println("\nIM3 Seru Anti Galau");
        
        System.out.println("\nIM3 Sekalee");
        
    }

    private static void S(int Sjumlah, int Sjam, int Smenit) {
        System.out.println("Jenis layanan : SMS");
        System.out.println("Waktu mulai SMS : "+Sjam+"."+Smenit);
        System.out.println("\nIM3 Seru Anti Galau");
        
        System.out.println("\nIM3 Sekalee");
        
    }
}
 