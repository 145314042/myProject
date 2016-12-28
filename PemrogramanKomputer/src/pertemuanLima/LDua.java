/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanLima;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class LDua {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int c,w,t,p;
        double t2,d;
        String l;
        System.out.println("Masukkan Kode Pos Tujuan dan Berat Paket Pengiriman anda:");
        System.out.print("Kode Pos Tujuan : ");
        c=z.nextInt();
        System.out.print("Berat (kg)      : ");
        w=z.nextInt();
        System.out.println("");
        System.out.println("KWITANSI");
        switch (c) {
            case 80111 :
                l="Bali";
                p=20000;
                t=p*w;
                if (t>100000&&t<=500000){
                    d=t*0.02;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
                else if (500000<t&&t<=1000000){
                    d=t*0.04;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
                else if (t>1000000){
                    d=t*0.05;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
                else { 
                    d=0;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
            break;
            case 33111 :
                l="Bengkulu";
                p=15000;
                t=p*w;
                if (t>100000&&t<=500000){
                    d=t*0.02;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
                else if (500000<t&&t<=1000000){
                    d=t*0.04;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
                else if (t>1000000){
                    d=t*0.05;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
                else { 
                    d=0;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
            break;
            case 15111 :
                l="Banten";
                p=10000;
                t=p*w;
                if (t>100000&&t<=500000){
                    d=t*0.02;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
                else if (500000<t&&t<=1000000){
                    d=t*0.04;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
                else if (t>1000000){
                    d=t*0.05;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
                else { 
                    d=0;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
            break;
            case 10110 :
                l="Jakarta";
                p=10000;
                t=p*w;
                if (t>100000&&t<=500000){
                    d=t*0.02;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
                else if (500000<t&&t<=1000000){
                    d=t*0.04;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
                else if (t>1000000){
                    d=t*0.05;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
                else { 
                    d=0;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
            break;
            case 36111 :
                l="Jambi";
                p=25000;
                t=p*w;
                if (t>100000&&t<=500000){
                    d=t*0.02;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
                else if (500000<t&&t<=1000000){
                    d=t*0.04;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
                else if (t>1000000){
                    d=t*0.05;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
                else { 
                    d=0;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
            break;
            case 78111 :
                l="Kalimantan Barat";
                p=22500;
                t=p*w;
                if (t>100000&&t<=500000){
                    d=t*0.02;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
                else if (500000<t&&t<=1000000){
                    d=t*0.04;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
                else if (t>1000000){
                    d=t*0.05;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
                else { 
                    d=0;
                    t2=t-d;
                    System.out.println("Tujuan : "+l);
                    System.out.println("Biaya per Kg : Rp "+p);
                    System.out.println("Berat paket : "+w+" kg");
                    System.out.println("Biaya : Rp "+t);
                    System.out.println("Diskon :  Rp "+(int)d);
                    System.out.println("Total Biaya : Rp "+(int)t2);}
            break;
            default :
                System.out.println("Kode Pos tidak terdaftar.");
        }
    }
}
