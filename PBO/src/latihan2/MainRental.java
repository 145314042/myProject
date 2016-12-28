/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

import javax.swing.JOptionPane;

/**
 *
 * @author Kirizu
 */
public class MainRental {
    public static void main(String[] args) {
        int jum=Integer.parseInt(JOptionPane.showInputDialog("Jumlah alat :"));
        Alat[] a=new Alat[jum];
        for (int i = 0; i < a.length; i++) {
            String alat=JOptionPane.showInputDialog("No. Alat :");
            boolean s;
            do{
                String jen=JOptionPane.showInputDialog("Jenis : (1)Computer,(2)Printer,(3)Modem");
                switch (jen){
                    case "1":
                        int jp=Integer.parseInt(JOptionPane.showInputDialog("Jumlah jam pinjam :"));
                        a[i]=new Computer(jum, alat);
                        s=true;break;
                    case "2":
                        int jk=Integer.parseInt(JOptionPane.showInputDialog("Jumlah jumlah kertas :"));
                        a[i]=new Printer(jum, alat);
                        s=true;break;
                    case "3":
                        double kb=Double.parseDouble(JOptionPane.showInputDialog("Besar KBps :"));
                        a[i]=new Modem(kb, alat);
                        s=true;break;
                    default:JOptionPane.showMessageDialog(null, "Pilihan salah!");s=false;
                }
            }while (s==false);
        }
        System.out.println("Data Pembayaran");
        System.out.println("No. Alat       |Jenis          |Biaya");
        System.out.println("---------------+---------------+--------------------");
        for (int i = 0; i < a.length; i++) {
            String j=a[i].getClass().getName();
            String[] jj=j.split("[.]");
            if(a[i] instanceof Computer)System.out.printf("%-15s|%-15s|%.0f\n",((Computer)a[i]).getNoAlat(),jj[1],((Computer)a[i]).hitungBiaya());
            else if(a[i] instanceof Printer)System.out.printf("%-15s|%-15s|%.0f\n",((Printer)a[i]).getNoAlat(),jj[1],((Printer)a[i]).hitungBiaya());
            else if(a[i] instanceof Modem)System.out.printf("%-15s|%-15s|%.0f\n",((Modem)a[i]).getNoAlat(),jj[1],((Modem)a[i]).hitungBiaya());
        }
    }
}
