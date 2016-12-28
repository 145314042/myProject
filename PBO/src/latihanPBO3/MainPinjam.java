/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanPBO3;

import javax.swing.JOptionPane;

/**
 *
 * @author Kirizu
 */
public class MainPinjam {
    public static void main(String[] args) {
        int jum=Integer.parseInt(JOptionPane.showInputDialog("Jumlah buku yang dipinjaman :"));
        Koleksi[] k=new Koleksi[jum];
        for (int i = 0; i < k.length; i++) {
            String no=JOptionPane.showInputDialog("No. Referensi :");
            String judul=JOptionPane.showInputDialog("Judul Buku :");
            int l;
            do{
                String jenis=JOptionPane.showInputDialog("Jenis Buku : (A)Buku, (B)Majalah, (C)Prosiding");
                switch(jenis){
                    case"A":case"a":
                        k[i]=new Buku(no, judul);
                        ((Buku)k[i]).setTebal(Integer.parseInt(JOptionPane.showInputDialog("Tebal Buku :")));
                        l=1;break;
                    case"B":case"b":
                        k[i]=new Majalah(no, judul);
                        ((Majalah)k[i]).setTahun(Integer.parseInt(JOptionPane.showInputDialog("Tahun Terbit Buku : (yyyy)")));
                        l=1;break;
                    case"C":case"c":
                        k[i]=new Prosiding(no, judul);
                        do{
                            ((Prosiding)k[i]).setTingkat(Integer.parseInt(JOptionPane.showInputDialog("Tingkat Buku : (1)Lokal, (2)Nasional, (3)Internasional")));
                            switch(((Prosiding)k[i]).getTingkat()){
                                case 1:l=1;break;
                                case 2:l=1;break;
                                case 3:l=1;break;
                                default:l=0;
                            }
                        }while(l!=1);
                        l=1;break;
                    default:JOptionPane.showMessageDialog(null,"Pilihan salah");l=0;
                }
            }while(l!=1);
            k[i].setLama(Integer.parseInt(JOptionPane.showInputDialog("Lama Meminjam :")));
        }
        System.out.println("DATA PEMINJAMAN");
        System.out.println("---+---------------+-----------------------------+------------+----------+----------------");
        System.out.println("No.|No Referensi   |Nama                         |Lama pinjam |Jenis     |Biaya (Rp)      ");
        System.out.println("---+---------------+-----------------------------+------------+----------+----------------");
        for (int i = 0; i < k.length; i++) {
            String j=k[i].getClass().getName();
            String[] jk=j.split("[.]");
            System.out.printf("%-3d|%-15s|%-29s|%-12d|%-10s|",(1+i),k[i].getNoRef(),k[i].getJudul(),k[i].getLama(),jk[1]);
            if (k[i] instanceof Buku)System.out.printf("%-16.0f\n",((Buku)k[i]).biaya());
            else if (k[i] instanceof Majalah)System.out.printf("%-16.0f\n",((Majalah)k[i]).biaya());
            else if (k[i] instanceof Prosiding)System.out.printf("%-16.0f\n",((Prosiding)k[i]).biaya());
        }
        System.out.println("---+---------------+-----------------------------+------------+----------+----------------");
    }
}
