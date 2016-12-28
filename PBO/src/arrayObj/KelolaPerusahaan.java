/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayObj;

import javax.swing.JOptionPane;

/**
 *
 * @author Kirizu
 */
public class KelolaPerusahaan {
    public static void main(String[] args) {
        int jp=Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pegawai","Pegawai"));
        Perusahaan[] pr=new Perusahaan[jp];
            String nipp=JOptionPane.showInputDialog("NIP Kepala Perusahaan","NIP");
            String namap=JOptionPane.showInputDialog("Nama Kepala Perusahaan","Nama");
        for (int i = 0; i < pr.length; i++) {
        }
    }
}
