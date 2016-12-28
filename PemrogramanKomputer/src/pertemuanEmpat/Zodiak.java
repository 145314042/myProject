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
public class Zodiak {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        double d;
        String y;
        System.out.print("Tanggal : ");
        d=z.nextDouble();
        System.out.print("Bulan   : ");
        y=z.next();
        if (("Januari".equals(y)||"januari".equals(y)&&21<=d&&d>=31)||
                ("Februari".equals(y)||"februari".equals(y)&&1<=d&&d<=19)){
            System.out.println("Zodiak : Aquarius");
            System.out.print("Ramalah : ");
            System.out.println("Be careful");}
        else if (("Februari".equals(y)||"februari".equals(y)&&20<=d&&d>=31)||
                ("Maret".equals(y)||"maret".equals(y)&&1<=d&&d<=20)){
            System.out.println("Zodiak : Pisces");
            System.out.print("Ramalah : ");
            System.out.println("Hati-hati dengan ikan");}
        else if (("Maret".equals(y)||"maret".equals(y)&&21<=d&&d>=31)||
                ("April".equals(y)||"april".equals(y)&&1<=d&&d<=20)){
            System.out.println("Zodiak : Aries");
            System.out.print("Ramalah : ");
            System.out.println("Segalanya akan berjalan lancar");}
        else if (("April".equals(y)||"april".equals(y)&&21<=d&&d>=31)||
                ("Mei".equals(y)||"mei".equals(y)&&1<=d&&d<=21)){
            System.out.println("Zodiak : Taurus");
            System.out.print("Ramalah : ");
            System.out.println("Hati-hati dengan tindakanmu");}
        else if (("Mei".equals(y)||"mei".equals(y)&&22<=d&&d>=31)||
                ("Juni".equals(y)||"juni".equals(y)&&1<=d&&d<=21)){
            System.out.println("Zodiak : Gemini");
            System.out.print("Ramalah : ");
            System.out.println("Keberuntungan berganda");}
        else if (("Juni".equals(y)||"juni".equals(y)&&22<=d&&d>=31)||
                ("Juli".equals(y)||"juli".equals(y)&&1<=d&&d<=22)){
            System.out.println("Zodiak : Cancer");
            System.out.print("Ramalah : ");
            System.out.println("Keberuntungan di dompet anda");}
        else if (("Juli".equals(y)||"juli".equals(y)&&23<=d&&d>=31)||
                ("Agustus".equals(y)||"agustus".equals(y)&&1<=d&&d<=22)){
            System.out.println("Zodiak : Leo");
            System.out.print("Ramalah : ");
            System.out.println("Segalanya akan berjalan dengan cepat");}
        else if (("Agustus".equals(y)||"agustus".equals(y)&&22<=d&&d>=31)||
                ("September".equals(y)||"september".equals(y)&&1<=d&&d<=22)){
            System.out.println("Zodiak : Virgo");
            System.out.print("Ramalah : ");
            System.out.println("Semuanya bejalan dengan indah");}
        else if (("September".equals(y)||"september".equals(y)&&24<=d&&d>=31)||
                ("Oktober".equals(y)||"oktober".equals(y)&&1<=d&&d<=23)){
            System.out.println("Zodiak : Libra");
            System.out.print("Ramalah : ");
            System.out.println("Semuanya akan adil");}
        else if (("Oktober".equals(y)||"oktober".equals(y)&&24<=d&&d>=31)||
                ("November".equals(y)||"november".equals(y)&&1<=d&&d<=22)){
            System.out.println("Zodiak : Scorpio");
            System.out.print("Ramalah : ");
            System.out.println("Hati-hati dalam bertindak");}
        else if (("November".equals(y)||"november".equals(y)&&d<=21&&d>=31)||
                ("Desember".equals(y)||"desember".equals(y)&&1<=d&&23<=d)){
            System.out.println("Zodiak : Sagitarius");
            System.out.print("Ramalah : ");
            System.out.println("Segalanya akan tepat sasaran");}
        else if (("Desember".equals(y)||"desember".equals(y)&&22<=d&&d>=31)||
                ("Januari".equals(y)||"januari".equals(y)&&1<=d&&d<=20)){
            System.out.println("Zodiak : Capricorn");
            System.out.print("Ramalah : ");
            System.out.println("Segalanya akan berjalan lambat");}
        else System.out.println("Tanggal atau Bulan salah");
    }
}
