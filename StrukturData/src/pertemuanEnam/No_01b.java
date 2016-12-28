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
public class No_01b {
    public static void main(String[] args) {
        Player[] data={
            new Player("Jack", 657),
            new Player("Bill", 387),
            new Player("Max", 799),
            new Player("Sam", 245),
            new Player("Josh", 678),
            new Player("WIlson", 498)
        };
        
        for (int iterasi = 0; iterasi <= data.length-2; iterasi++) {
            int minIndex=iterasi;
            for (int element = iterasi+1; element <=data.length-1; element++) {
                if (data[element].compareTo(data[minIndex])<0) {
                    minIndex=element;
                }
            }
            Player temp = data[iterasi];
            data[iterasi]=data[minIndex];
            data[minIndex]=temp;
        }
        
        for (int i = 0; i < data.length; i++) {
            System.out.println("#"+(i+1)+" "+data[i].getNama()+" "+data[i].getScore());
        }
    }
}
