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
public class LSatu {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int d,m,y;
        System.out.print("Masukkan tanggal (d/dd) : ");
        d=z.nextInt();
        System.out.print("Masukkan bulan (m/mm) : ");
        m=z.nextInt();
        System.out.print("Masukkan tahun (yyyy) : ");
        y=z.nextInt();
        switch (m) {
            case 4 :
                if (d==21) System.out.println
                    ("Tanggal "+d+" Maret "+y+" merupakan peringatan Hari Kartini.");
                else if (d==22) System.out.println
                    ("Tanggal "+d+" Maret "+y+" merupakan peringatan Hari Bumi.");
                break;
            case 5 :
                if (d==2) System.out.println
                    ("Tanggal "+d+" April "+y+" merupakan peringatan Hari Pendidikan Nasional.");
                else if (d==20) System.out.println
                    ("Tanggal "+d+" April "+y+" merupakan peringatan Hari Kebangkitan Nasional.");
                break;
            case 6 :
                if (d==1) System.out.println
                    ("Tanggal "+d+" Juni "+y+" merupakan peringatan Hari Lahir Pancasila.");
                break;
            case 7 :
                if (d==23) System.out.println
                    ("Tanggal "+d+" Juli "+y+" merupakan peringatan Hari Anak Nasional.");
                break;
            case 10 :
                if (d==1) System.out.println
                    ("Tanggal "+d+" Oktober "+y+" merupakan peringatan Hari Kesaktian Pancasila.");
                else if (d==2) System.out.println
                    ("Tanggal "+d+" Oktober "+y+" merupakan peringatan Hari Batik.");
                else if (d==5) System.out.println
                    ("Tanggal "+d+" Oktober "+y+" merupakan peringatan Hari TNI.");
                else if (d==28) System.out.println
                    ("Tanggal "+d+" Oktober "+y+" merupakan peringatan Hari Sumpah Pemuda.");
                break;
            case 11 :
                if (d==10) System.out.println
                    ("Tanggal "+d+" November "+y+" merupakan peringatan Hari Pahlawan.");
                break;
            case 12 :
                if (d==22) System.out.println
                    ("Tanggal "+d+" Desember "+y+" merupakan peringatan Hari Ibu.");
                break;
            default : 
                System.out.println("Format tanggal salah atau");
                System.out.println("Tanggal "+d+" - "+m+" - "+y+" tidak terdapat hari besar.");
        }
    }
}
