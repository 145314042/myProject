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
public class PersonaliaMain {
    public static void main(String[] args) {
        int jp=Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Jumlah Pegawai : "));
        Personalia[] pl=new Personalia[jp];
        
        String nama, nip, alamat;
        int umur,jlembur,anak;
        double gaji;
        
        for (int i = 0; i < pl.length; i++) {
            nip=JOptionPane.showInputDialog("Pegawai "+(1+i),"NIP :");
            nama=JOptionPane.showInputDialog("Pegawai "+(1+i),"Nama :");
            alamat=JOptionPane.showInputDialog("Pegawai "+(1+i),"Alamat :");
            umur=Integer.parseInt(JOptionPane.showInputDialog("Pegawai "+(1+i),"Umur :"));
            jlembur=Integer.parseInt(JOptionPane.showInputDialog("Pegawai "+(1+i),"Jumlah Jam Lembur :"));
            anak=Integer.parseInt(JOptionPane.showInputDialog("Pegawai "+(1+i),"Jumlah anak :"));
            gaji=Double.parseDouble(JOptionPane.showInputDialog("Pegawai "+(1+i),"Gaji :"));
            
            pl[i]=new Personalia(nama, nip);
            pl[i].setAlamat(alamat);
            pl[i].setUmur(umur);
            pl[i].setJam_lembur(jlembur);
            pl[i].setJumlah_anak(anak);
            pl[i].setGaji_pokok(gaji);
            
            pl[i].gajiLembur();
            pl[i].tunjangan();
            pl[i].gajiTotal();
        }
       // Pegawai
        double rata=0;
        for (int i = 0; i < pl.length; i++) {
            rata=rata+pl[i].getGaji_pokok();
        }
        System.out.println("Rata-rata Gaji Pokok = "+(rata/pl.length));
        Personalia terbesar,terkecil;
        terbesar =  terkecil= pl[0];
        
        for (int i = 1; i < pl.length; i++) {        
            if ( pl[i].getGaji_pokok()< terkecil.getGaji_pokok()) {
                terkecil =  pl[i];
            }
            if (pl[i].getGaji_pokok()> terbesar.getGaji_pokok()) {
                terbesar      = pl[i];
            }
        }
        System.out.println("Gaji Terbesar  : " +terbesar.getNama()+ " dengan gaji " +terbesar.getGaji_pokok() );
        System.out.println("Gaji Terkecil  : " +terkecil.getNama()+ " dengan gaji " +terkecil.getGaji_pokok());
        
        System.out.println("\nDATA PEGAWAI : \n");
        for (int i = 0; i < pl.length; i++) {
            System.out.println("NIP : "+pl[i].getNIP());
            System.out.println("Nama : "+pl[i].getNama());
            System.out.println("Alamat : "+pl[i].getAlamat());
            System.out.println("Umur : "+pl[i].getUmur());
            System.out.println("Jumlah Anak : "+pl[i].getJumlah_anak());
            System.out.println("Jumlah Jam Lembur : "+pl[i].getJam_lembur());
            System.out.println("Gaji Pokok : "+pl[i].getGaji_pokok());
            System.out.println("Total Gaji : "+pl[i].gajiTotal());
            System.out.println("");
        }
    }
}
