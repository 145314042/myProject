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
public class Sembilan {
    public static void main(String[] args) {
        int[] ID = {101,102,103,104,105}; 
        String[] Nama = {"Slamet","Joko","Wulan","Aldo","Ahmad"};
        System.out.println("   ID   |     Nama\n--------+-------------");
        for (int i = 0; i < ID.length; i++) {
            System.out.println(ID[i]+"\t|"+Nama[i]);
        }
    }
}
