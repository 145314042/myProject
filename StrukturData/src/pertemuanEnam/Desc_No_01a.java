/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanEnam;

/**
 *
 * @author Lycorice
 */
public class Desc_No_01a {
    public static void main(String[] args) {
        Desc_Player[] data={
            new Desc_Player("Jack", 657),
            new Desc_Player("Bill", 387),
            new Desc_Player("Max", 799),
            new Desc_Player("Sam", 245),
            new Desc_Player("Josh", 678),
            new Desc_Player("WIlson", 498)
        };
        
        for (int iterasi = 0; iterasi <= data.length-1; iterasi++) {
            for (int element = 0; element < data.length-1-iterasi; element++) {
                if (data[element].compareTo(data[element+1])>0) {
                    Desc_Player temp = data[element];
                    data[element]=data[element+1];
                    data[element+1]=temp;
                }
            }
        }
        
        for (int i = 0; i < data.length; i++) {
            System.out.println("#"+(i+1)+" "+data[i].getNama()+" "+data[i].getScore());
        }
    }
}
