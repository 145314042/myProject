/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A102215;

/**
 *
 * @author Lycorice
 */
public class BubbleSort {
    public static void main(String[] args) {
        Mahasiswa[] data={
            new Mahasiswa("001","af"),
            new Mahasiswa("005","aaf"),
            new Mahasiswa("002","aba"),
            new Mahasiswa("003","aaa"),
            new Mahasiswa("006","abb"),
            new Mahasiswa("004","abc")
        };
        
        for (int iterasi = 1; iterasi <= data.length-2; iterasi++) {
            for (int element = 0; element < data.length-1-iterasi; element++) {
                if (data[element].compareTo(data[element+1])>0) {
                    Mahasiswa temp = data[element];
                    data[element]=data[element+1];
                    data[element+1]=temp;
                }
            }
        }
        
        for (int i = 0; i < data.length; i++) {
            System.out.println("#"+(i+1)+" "+data[i].getNama()+" "+data[i].getNIM());
        }
    }
}
