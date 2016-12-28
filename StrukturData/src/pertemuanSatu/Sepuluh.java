/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanSatu;

/**
 *
 * @author Kirizu
 */
public class Sepuluh {
    public static void main(String[] args) {
        String[] platnomor = {"B 102 AE","AB 233 CB","B 456 VC","B 665 FG"}; 
        String[] Mobil = {"Kijang","Innova","Avanza","Rush"};
        System.out.println("       ID       |     Nama\n----------------+-------------");
        for (int i = 0; i < platnomor.length; i++) {
            System.out.println(platnomor[i]+"\t|"+Mobil[i]);
        }
        System.out.println("Plat nomor dari daerah Jakarta :");
        System.out.println("       ID       |     Nama\n----------------+-------------");
        for (int i = 0; i < platnomor.length; i++) {
            String[] daerah=platnomor[i].split(" ");
            if ("B".equals(daerah[0]))System.out.println(platnomor[i]+"\t|"+Mobil[i]);
        }
    }
}
