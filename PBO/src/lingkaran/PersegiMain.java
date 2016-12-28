/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran;

import javax.swing.JOptionPane;

/**
 *
 * @author Kirizu
 */
public class PersegiMain {
    public static void main(String[] args) {
        Persegi objP=new Persegi();
        objP.panj=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang"));
        objP.lebar=Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar"));
        JOptionPane.showMessageDialog(null, "Luas dari persegi dengan panjang="+objP.panj
        +" dan lebar = "+objP.lebar+" adalah "+objP.luas());
        
    }
}
