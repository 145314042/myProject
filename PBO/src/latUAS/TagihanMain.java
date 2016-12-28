/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latUAS;

import javax.swing.JOptionPane;

/**
 *
 * @author Kirizu
 */
public class TagihanMain {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("Jumlah Mahasiswa : ","Jumlah"));
        Mahasiswa[] mh=new Mahasiswa[n];
        Rekening[] rk=new Rekening[n];
        String nama,nim,rek;
        double us1,us2,uas,ukt,spp;
        for (int i = 0; i < n; i++) {
            nim=JOptionPane.showInputDialog("Mahasiswa"+(i+1),"nim");
            rek=JOptionPane.showInputDialog("Mahasiswa"+(i+1),"rek");
            nama=JOptionPane.showInputDialog("Mahasiswa"+(i+1),"nama");
            us1=Double.parseDouble(JOptionPane.showInputDialog("Mahasiswa"+(i+1),"us1"));
            us2=Double.parseDouble(JOptionPane.showInputDialog("Mahasiswa"+(i+1),"us2"));
            uas=Double.parseDouble(JOptionPane.showInputDialog("Mahasiswa"+(i+1),"uas"));
            ukt=Double.parseDouble(JOptionPane.showInputDialog("Mahasiswa"+(i+1),"ukt"));
            spp=Double.parseDouble(JOptionPane.showInputDialog("Mahasiswa"+(i+1),"spp"));
            mh[i]=new Mahasiswa(nim, nama);
            mh[i].setUs1(us1);
            mh[i].setUs2(us2);
            mh[i].setUas(uas);
            mh[i].hitFinal();
            mh[i].konversi();
            rk[i]=new Rekening(rek, mh[i]);
            rk[i].setUkt(ukt);
            rk[i].setSpp(spp);
            rk[i].hitTotal();
        }
        System.out.println("No. Nim\tNo Rekening\tNama\tNilai total\tNilai Final\tSPP\tUKT\tTotal Bayar");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+". "+mh[i].getNim()+"\t"+rk[i].getNoRekening()
                    +"\t"+mh[i].getNama()+"\t"+mh[i].hitFinal()+"\t"+mh[i].konversi()+
                    "\t"+rk[i].getUkt()+"\t"+rk[i].getSpp()+"\t"+rk[i].hitTotal());
        }
    }
}
