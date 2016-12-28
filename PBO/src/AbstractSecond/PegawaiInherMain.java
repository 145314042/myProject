/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractSecond;

import javax.swing.JOptionPane;

/**
 *
 * @author Kirizu
 */
public class PegawaiInherMain {
    public static void main(String[] args) {
        int jum=Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pegawai :", "Jumlah"));
        Pegawai[] pe=new Pegawai[jum];
        ////Input
        for (int i = 0; i < pe.length; i++) {
            String nip=JOptionPane.showInputDialog("NIP :",null);
            String nama=JOptionPane.showInputDialog("Nama :",null);
            String pilih;
            int j;
            do{
                pilih=JOptionPane.showInputDialog("Pilih : (M)Manager, (P)Pemasaran, (U)Umum",null);
                switch (pilih){
                    case "M" :case "m" :pe[i]=new Manager(nip,nama);j=1;break;
                    case "P" :case "p" :pe[i]=new Pemasaran(nip,nama);j=1;break;
                    case "U" :case "u" :pe[i]=new Umum(nip,nama);j=1;break;
                    default:JOptionPane.showMessageDialog(null,"Pilihan Salah");j=0;}
            }while (j!=1);
            pe[i].setGaji_pokok(Double.parseDouble(JOptionPane.showInputDialog("Gaji Pokok",null)));
            pe[i].setJam_lembur(Double.parseDouble(JOptionPane.showInputDialog("Jam Lembur",null)));
            pe[i].setJumlah_anak(Integer.parseInt(JOptionPane.showInputDialog("Jumlah Anak",null)));
            if (pe[i] instanceof Manager)((Manager)pe[i]).setTunjJabatan(Double.parseDouble(JOptionPane.showInputDialog("Tunjangan Jabatan",null)));
            else if (pe[i] instanceof Pemasaran)((Pemasaran)pe[i]).setTunjTransport(Double.parseDouble(JOptionPane.showInputDialog("Tunjangan Transport",null)));
            else if (pe[i] instanceof Umum)((Umum)pe[i]).setBonus(Double.parseDouble(JOptionPane.showInputDialog("Bonus",null)));
        }
        ////Output
        for (int i = 0; i < pe.length; i++) {
            System.out.println("Data "+(i+1));
            String namaJab=(pe[i].getClass().getName());
            String[] hasil=namaJab.split("[.]");
            System.out.printf("Nim           : %s\n",pe[i].getNIP());
            System.out.printf("Nama          : %s\n",pe[i].getNama());
            System.out.printf("Jabatan       : %s\n",hasil[1]);
            System.out.printf("Gaji Pokok    : %.0f\n",pe[i].getGaji_pokok());
            if (pe[i] instanceof Manager)System.out.printf("Tunjangan     : %.0f\n",((Manager)pe[i]).TunLai());
            else if (pe[i] instanceof Pemasaran)System.out.printf("Tunjangan     : %.0f\n",((Pemasaran)pe[i]).TunLai());
            else if (pe[i] instanceof Umum)System.out.printf("Tunjangan     : %.0f\n",((Umum)pe[i]).TunLai());
            System.out.printf("Gaji Total    : %.0f\n",pe[i].gajiTotal());
        }
        double totalgaji=0;
        for (int i = 0; i < pe.length; i++) {
            if(pe[i] instanceof Pemasaran)totalgaji=totalgaji+pe[i].gajiTotal();
            else totalgaji=totalgaji;
        }
        System.out.printf("\nTotal Gaji Pegawai Pemasaran = %.0f\n",totalgaji);
    }    
}



//            System.out.println("Nim           : "+pe[i].getNIP());
//            System.out.println("Nama          : "+pe[i].getNama());
//            System.out.println("Jabatan       : "+hasil[1]);
//            System.out.println("Gaji Pokok    : "+pe[i].getGaji_pokok());
//            if (pe[i] instanceof Manager)System.out.println("Tunjangan     : "+((Manager)pe[i]).TunLai());
//            else if (pe[i] instanceof Pemasaran)System.out.println("Tunjangan     : "+((Pemasaran)pe[i]).TunLai());
//            else if (pe[i] instanceof Umum)System.out.println("Tunjangan     : "+((Umum)pe[i]).TunLai());
//            System.out.println("Gaji Total    : "+pe[i].gajiTotal());