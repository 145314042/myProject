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
public class No_01c {
    public static void main(String[] args) {
        Player[] data={
            new Player("Jack", 657),
            new Player("Bill", 387),
            new Player("Max", 799),
            new Player("Sam", 245),
            new Player("Josh", 678),
            new Player("WIlson", 498)
        };
        
        for (int iterasi = 1; iterasi < data.length-1; iterasi++) {
            for (int element = iterasi+1; element > 0; element--) {
                if (data[element].compareTo(data[element-1])<0) {
                    Player temp = data[element];
                    data[element]=data[element-1];
                    data[element-1]=temp;
                }
            }
        }
        
        for (int i = 0; i < data.length; i++) {
            System.out.println("#"+(i+1)+" "+data[i].getNama()+" "+data[i].getScore());
        }
    }
}
