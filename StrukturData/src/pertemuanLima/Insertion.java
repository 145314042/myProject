/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanLima;

/**
 *
 * @author Lycorice
 */
public class Insertion {
    public static void main(String[] args) {
        int[] data={23,56,45,12,67,86,43,66,99,25,61,5,78,76,33,63,5,8,15,20};
        for (int iter = 0; iter <= data.length-1; iter++) {
            for (int i = iter; i >= 1; i--) {
                if (data[i]<data[i-1]) {
                    int temp=data[i];
                    data[i]=data[i-1];
                    data[i-1]=temp;
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println("Data ke-"+(i+1)+" : "+data[i]);
        }
    }
}

//        Sorting sorting=new Sorting();
//        sorting.InsertionSort(data);