/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanTujuh;

/**
 *
 * @author Kirizu
 */
public class TigaB {
    public static void main(String[] args) {
        int jumlah = 0, bilangan = 0;
        while ( bilangan <= 100 ) {
            jumlah = jumlah + bilangan;
            bilangan = bilangan + 5;
        }
        System.out.println(" Jumlah dari 5+10+…+100 = "+ jumlah);
    }
}
