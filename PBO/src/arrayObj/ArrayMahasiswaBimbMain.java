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
public class ArrayMahasiswaBimbMain {
    public static void main(String[] args) {
        int jm=Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Jumlah Mahasiswa : "));
        Mahasiswa[]    mhs;
        mhs = new Mahasiswa[jm];     

        String      nama, nim, imil;
        int         umur;

        for (int i = 0; i < mhs.length; i++) {
            
            //read in data values
            nim  = JOptionPane.showInputDialog("Mahasiswa "+(i+1), "Masukkan nim : " );
            nama    = JOptionPane.showInputDialog("Mahasiswa "+(i+1), "Masukkan nama : ");
            imil =JOptionPane.showInputDialog("Mahasiswa "+(i+1), "Masukkan email : ");
            umur  = Integer.parseInt(JOptionPane.showInputDialog("Mahasiswa "+(i+1), "Masukkan umur : "));
         
            //create a new Mahasiswa and assign values
            mhs[i] = new Mahasiswa(nim, nama);
            mhs[i].setAlamat(imil);
            mhs[i].setUmur(umur);
        }
        
        Dosen dsn=new Dosen("67","Agung");
        dsn.setMahasiswa(mhs);
        
        Mahasiswa[] tamp=dsn.getMahasiswa();
        for (int i=0;i<tamp.length;i++){
                System.out.println(tamp[i].getNama());
                
        }
    }
}
