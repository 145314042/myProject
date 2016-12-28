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
public class Desc_No_01b {
    public static void main(String[] args) {
        Desc_Player[] data={
            new Desc_Player("Jack", 657),
            new Desc_Player("Bill", 387),
            new Desc_Player("Max", 799),
            new Desc_Player("Sam", 245),
            new Desc_Player("Josh", 678),
            new Desc_Player("WIlson", 498)
        };
        
        for (int iterasi = 0; iterasi <= data.length-2; iterasi++) {
            int minIndex=iterasi;
            for (int element = iterasi+1; element <=data.length-1; element++) {
                if (data[element].compareTo(data[minIndex])<0) {
                    minIndex=element;
                }
            }
            Desc_Player temp = data[iterasi];
            data[iterasi]=data[minIndex];
            data[minIndex]=temp;
        }
        
        for (int i = 0; i < data.length; i++) {
            System.out.println("#"+(i+1)+" "+data[i].getNama()+" "+data[i].getScore());
        }
    }
}
