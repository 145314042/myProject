/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan13;

import java.util.Scanner;

/**
 *
 * @author Budhi Darma P
 */
public class Latihan8 {
    public static void main(String[] args) {
        int[] data;
        int a,b,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Banyak anggota dalam array : ");
        a=sc.nextInt();
        data=new int [a];
        for(i=0;i<data.length;i++){
            System.out.print("Data ke-"+(i+1)+" : ");
            data[i] = sc.nextInt();
        }
        System.out.println("Array bilangan ganjil : ");
        for(i=0;i<data.length;i++){
            b=data[i]%2;
            if(b==1){
                System.out.println(data[i]);
            }
        }
       System.out.println("Array bilangan genap : ");
        for(i=0;i<data.length;i++){
            b=data[i]%2;
            if(b==0){
                System.out.println(data[i]);
            }
        }
        System.out.print("Anggota Array : {");
        for(i=0;i<data.length;i++){
        System.out.print(data[i]);
        if(data[i]<data.length){
            System.out.print(", ");
        }
        }
        System.out.println("}");
    }
}
