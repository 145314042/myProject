/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pertemuanDelapan;

/**
 *
 * @author Kirizu
 */
public class LLima {
    public static void main(String[] args) {
        for (int baris =1; baris<= 10; baris++){
            for(int kolom=1; kolom <= 10; kolom++)System.out.printf("%5d", baris*kolom);
                System.out.println();
        }
    }
}
