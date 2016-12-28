/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran;

/**
 *
 * @author Kirizu
 */
public class Mahasiswa {
    String nama;
    String nim;
    String alamat;
    float ipk;
    double uts1;
    double uts2;
    double uas;
    double nilaiakhir;
    public double HitFinal(){
        double hasil=(0.3*uts1)+(0.3*uts2)+(0.4*uas);
        return hasil;
    }
    public String hitHuruf(){
        String h = null;
        if (80<=nilaiakhir&&nilaiakhir<=100)h="A";
        else if (65<=nilaiakhir&&nilaiakhir<80)h="B";
        else if (55<=nilaiakhir&&nilaiakhir<65)h="C";
        else if (45<=nilaiakhir&&nilaiakhir<55)h="D";
        else if (0<=nilaiakhir&&nilaiakhir<45)h="E";
        else h="Data salah";
        return h;
    }
}
