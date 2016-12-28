/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanPBO1remake;

import javax.swing.JOptionPane;

/**
 *
 * @author Kirizu
 */
public class DimensiMain {
    public static void main(String[] args) {
        Dimensi[] di=new Dimensi[1];
        int a;
        String jenis[] = null;
        for (int i = 0; i < di.length; i++) {
            do{
                jenis[i]=JOptionPane.showInputDialog("Jenis Bangun");
                switch (jenis[i]){
                    case "persegi":case "Persegi":a=1;
                        ((Persegi)di[i]).setSisi(Double.parseDouble(JOptionPane.showInputDialog("Sisi")));break;
                    case "lingkaran":case "Lingkaran":a=1;
                        ((Lingkaran)di[i]).setRange(Double.parseDouble(JOptionPane.showInputDialog("Sisi")));break;
                    case "kubus":case "Kubus":a=1;
                    case "balok":case "Balok":a=1;
                    default:JOptionPane.showMessageDialog(null,"Pilihan salah");a=0;
                }
            }while (a!=1);
        }
    }
}
