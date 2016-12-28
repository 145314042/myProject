/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import javax.swing.JOptionPane;

/**
 *
 * @author Kirizu
 */
public class PegawaiInherMainSecond {
    public static void main(String[] args) {
        int jum=Integer.parseInt(JOptionPane.showInputDialog("Jumlah Pegawai :", null));
        Pegawai[] pe=new Pegawai[jum];
        int j;
        //// input
        for (int i = 0; i < pe.length; i++) {
            String nip=JOptionPane.showInputDialog("NIP :",null);
            String nama=JOptionPane.showInputDialog("Nama :",null);
            String pilih;
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
        //// output
        System.out.println("DATA PEGAWAI PERUSAHAAN HIDUP SEHAT-SEHAT\n"
                + "---------------------------------------------------------------------------------------------");
        System.out.println("No. NIP   Nama             Status      Gaji Pokok      Tunjangan       Gaji Total");
        System.out.println("=============================================================================================");
        for (int i = 0; i < pe.length; i++) {
            String namaJab=(pe[i].getClass().getName());
            String[] hasil=namaJab.split("[.]");
            System.out.printf("%-4d%-6s%-17s%-12s%-16.0f",(1+i),pe[i].getNIP(),pe[i].getNama(),hasil[1],pe[i].getGaji_pokok());            
            if (pe[i] instanceof Manager)System.out.printf("%-16.0f",((Manager)pe[i]).TunLai());
            else if (pe[i] instanceof Pemasaran)System.out.printf("%-16.0f",((Pemasaran)pe[i]).TunLai());
            else if (pe[i] instanceof Umum)System.out.printf("%-16.0f",((Umum)pe[i]).TunLai());
            System.out.printf("%-16.0f",pe[i].gajiTotal());
            System.out.println("");
        }
    }    
}


//            System.out.printf("%-4d",(1+i));
//            System.out.printf("%-6s",pe[i].getNIP());
//            System.out.printf("%-17s",pe[i].getNama());
//            System.out.printf("%-12s",hasil[1]);
//            System.out.printf("%-16.0f",pe[i].getGaji_pokok());
//            if (pe[i] instanceof Manager)System.out.printf("%-16.0f",((Manager)pe[i]).TunLai());
//            else if (pe[i] instanceof Pemasaran)System.out.printf("%-16.0f",((Pemasaran)pe[i]).TunLai());
//            else if (pe[i] instanceof Umum)System.out.printf("%-16.0f",((Umum)pe[i]).TunLai());
//            System.out.printf("%-16.0f",pe[i].gajiTotal());

//            System.out.printf("%2d.",(1+i));
//            System.out.printf(" %4d",pe[i].getNIP());
//            System.out.printf("  %7s",pe[i].getNama());
//            System.out.printf("%9s",hasil[1]);
//            System.out.printf("   %10d",pe[i].getGaji_pokok());
//            if (pe[i] instanceof Manager)System.out.print("      "+((Manager)pe[i]).TunLai()+"   ");
//            else if (pe[i] instanceof Pemasaran)System.out.print("      "+((Pemasaran)pe[i]).TunLai()+" ");
//            else if (pe[i] instanceof Umum)System.out.print("      "+((Umum)pe[i]).TunLai()+"      ");
//            System.out.printf("      %10d",pe[i].gajiTotal());



//            System.out.print(" "+pe[i].getNIP());
//            System.out.print("\t"+pe[i].getNama());
//            System.out.print("\t\t"+hasil[1]);
//            System.out.print("\t\t"+pe[i].getGaji_pokok());
//            if (pe[i] instanceof Manager)System.out.print("\t\t"+((Manager)pe[i]).TunLai());
//            else if (pe[i] instanceof Pemasaran)System.out.print("\t\t"+((Pemasaran)pe[i]).TunLai());
//            else if (pe[i] instanceof Umum)System.out.print("\t\t"+((Umum)pe[i]).TunLai());
//            System.out.print("\t\t"+pe[i].gajiTotal());