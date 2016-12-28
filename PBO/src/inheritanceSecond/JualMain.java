/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceSecond;

import javax.swing.JOptionPane;

/**
 *
 * @author Kirizu
 */
public class JualMain {
    public static void main(String[] args) {
        int jb=Integer.parseInt(JOptionPane.showInputDialog("Jumlah Barang"));
        DataBarang[] db=new DataBarang[jb];
        int j;
        for (int i = 0; i < db.length; i++) {
            String kode=JOptionPane.showInputDialog("Kode Barang");
            String nama=JOptionPane.showInputDialog("Nama Barang");
            do{
                String jenis=JOptionPane.showInputDialog("Jenis : (A)Pakaian, (B)Makanan, (C)Obat");
                switch (jenis){
                    case "A" :case "a" :db[i]=new Pakaian(kode,nama);j=1;break;
                    case "B" :case "b" :db[i]=new Makanan(kode,nama);j=1;break;
                    case "C" :case "c" :db[i]=new Obat(kode,nama);j=1;break;
                    default:JOptionPane.showMessageDialog(null,"Maaf pilihan salah!");j=0;}
            }while (j!=1);
            db[i].setHarga(Double.parseDouble(JOptionPane.showInputDialog("Harga Barang")));
            if(db[i] instanceof Pakaian){
                ((Pakaian)db[i]).setUkuran(JOptionPane.showInputDialog("Ukuran Pakaian"));
                ((Pakaian)db[i]).setWarna(JOptionPane.showInputDialog("Warna Pakaian"));
                ((Pakaian)db[i]).setDiskon(Double.parseDouble(JOptionPane.showInputDialog("Discount")));
            }
            else if(db[i] instanceof Makanan){
                ((Makanan)db[i]).setExp(JOptionPane.showInputDialog("Tanggal Kadaluwarsa (TT/BB/TTTT)"));
                ((Makanan)db[i]).setAsal(JOptionPane.showInputDialog("Asal Makanan"));
            }
            else if(db[i] instanceof Obat){
                ((Obat)db[i]).setExp(JOptionPane.showInputDialog("Tanggal Kadaluwarsa (TT/BB/TTTT)"));
                ((Obat)db[i]).setDosis(JOptionPane.showInputDialog("Dosis Obat"));
            }
        }
        System.out.println("===========================================================================================================================");
        System.out.println("No. Kode  Nama Barang   Jenis   Harga        Ukuran Warna       Diskon Tgl. Kadaluwarsa Asal            Dosis");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><");
        for (int i = 0; i < db.length; i++) {
            String Jenis=db[i].getClass().getName();
            String[] kinds=Jenis.split("[.]");
            System.out.printf("%-4d%-6s%-14s%-8sRp%-11.0f",(i+1),db[i].getKode(),db[i].getNama(),kinds[1],db[i].getHarga());
            if(db[i] instanceof Pakaian){
                System.out.printf("   %-4s%-12s%5.2f%%         -           -              -",((Pakaian)db[i]).getUkuran(),
                        ((Pakaian)db[i]).getWarna(),((Pakaian)db[i]).getDiskon());
            }
            else if(db[i] instanceof Makanan){
                System.out.printf("   -     -           -    %-17s%-16s  -",((Makanan)db[i]).getExp(),((Makanan)db[i]).getAsal());
            }
            else if(db[i] instanceof Obat){
                System.out.printf("   -     -           -    %-17s   -            %s",((Obat)db[i]).getExp(),((Obat)db[i]).getDosis());
            }
            System.out.println("");
        }
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><");
    }
}


//   %-4s%-12s  %5.2f%-17s%-16s%s