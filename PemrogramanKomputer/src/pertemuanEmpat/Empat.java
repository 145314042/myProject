/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanEmpat;

import java.util.Scanner;

/**
 *
 * @author Kirizu
 */
public class Empat {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        double b,g,m,h;
        System.out.print("Gaji Pokok (rupiah): ");
        b=z.nextDouble();
        System.out.print("Golongan           : ");
        g=z.nextDouble();
        System.out.print("Masa Kerja (tahun) : ");
        m=z.nextDouble();
        if (g==1&&0<=m&&m<=10){       //11
            h=50.0/100*b;
            System.out.println("Bonus karyawan : "+h);}
        else if (g==1&&11<=m&&m<=20){ //12
            h=60.0/100*b;
            System.out.println("Bonus karyawan : "+h);}
        else if (g==1&&21<=m&&m<=30){ //13
            h=70.0/100*b;
            System.out.println("Bonus karyawan : "+h);}
        else if (g==2&&0<=m&&m<=10){  //21
            h=60.0/100*b;
            System.out.println("Bonus karyawan : "+h);}
        else if (g==2&&11<=m&&m<=20){ //22
            h=70.0/100*b;
            System.out.println("Bonus karyawan : "+h);}
        else if (g==2&&21<=m&&m<=30){ //23
            h=80.0/100*b;
            System.out.println("Bonus karyawan : "+h);}
        else if (g==3&&0<=m&&m<=10){  //31
            h=70.0/100*b;
            System.out.println("Bonus karyawan : "+h);}
        else if (g==3&&11<=m&&m<=20){ //32
            h=80.0/100*b;
            System.out.println("Bonus karyawan : "+h);}
        else if (g==3&&21<=m&&m<=30){ //33
            h=90.0/100*b;
            System.out.println("Bonus karyawan : "+h);}
        else if (g==4&&0<=m&&m<=10){  //41
            h=80.0/100*b;
            System.out.println("Bonus karyawan : "+h);}
        else if (g==4&&11<=m&&m<=20){ //42
            h=90.0/100*b;
            System.out.println("Bonus karyawan : "+h);}
        else if (g==4&&21<=m&&m<=30){ //43
            h=100.0/100*b;
            System.out.println("Bonus karyawan : "+h);}
    }
}
