/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

import javax.swing.JOptionPane;

/**
 *
 * @author Kirizu
 */
public class MainPenyebrangan {
    public static void main(String[] args) {
        int jum= Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah kendaraan :"));
        Kendaraan[] ken=new Kendaraan[jum];
        for (int i = 0; i < ken.length; i++) {
            int j=0;
            do{
                String jenis=JOptionPane.showInputDialog("Jenis : (A)Bus,(B)Truck,(C)Motor");                
                String plat=JOptionPane.showInputDialog("Masukkan nomor polisi :");
                switch (jenis){
                    case "A":case "a":
                        ken[i]=new Bus(plat);
                        ((Bus)ken[i]).setJumlahPenumpang(Double.parseDouble(JOptionPane.showInputDialog("Jumlah penumpang (Orang) :")));
                        j=0;break;
                    case "B":case "b":
                        ken[i]=new Truck(plat);
                        ((Truck)ken[i]).setBeratTotal(Double.parseDouble(JOptionPane.showInputDialog("Berat muatan (Kg) :")));
                        j=0;break;
                    case "C":case "c":
                        ken[i]=new Motor(plat);j=0;break;
                    default:j=1;JOptionPane.showMessageDialog(null,"Pilihan salah!");
                }
            }while(j==1);
        }
        System.out.println("Data Tarif :");
        System.out.println("+---+-------------------+---------------+-----------------+");
        System.out.println("|No.|Jenis Kendaraan    |No. Polisi     |Tarif            |");
        System.out.println("+---+-------------------+---------------+-----------------+");
        for (int i = 0; i < ken.length; i++) {
            String np=ken[i].getClass().getName();
            String[] jk=np.split("[.]");
            System.out.printf("|%-3d|%-19s",(i+1),jk[1]);
            if (ken[i] instanceof Bus)
                System.out.printf("|%-15s|%-17.0f|\n",((Bus)ken[i]).getNoPlat(),((Bus)ken[i]).hitungTarif());
            else if (ken[i] instanceof Truck)
                System.out.printf("|%-15s|%-17.0f|\n",((Truck)ken[i]).getNoPlat(),((Truck)ken[i]).hitungTarif());
            else if (ken[i] instanceof Motor)
                System.out.printf("|%-15s|%-17.0f|\n",((Motor)ken[i]).getNoPlat(),((Motor)ken[i]).hitungTarif());
        }
        System.out.println("+---+-------------------+---------------+-----------------+");
    }
}



//for (int i = 0; i < ken.length; i++) {
//            int j=0;
//            do{
//                String jenis=JOptionPane.showInputDialog("Jenis : (A)Bus,(B)Truck,(C)Motor");                
//                String plat=JOptionPane.showInputDialog("Masukkan nomor polisi :");
//                switch (jenis){
//                    case "A":case "a":
//                        ((Bus)ken[i]).setJumlahPenumpang(Double.parseDouble(JOptionPane.showInputDialog("Jumlah penumpang (Orang) :")));
//                        ken[i]=new Bus(plat);j=0;break;
//                    case "B":case "b":
//                        ((Truck)ken[i]).setBeratTotal(Double.parseDouble(JOptionPane.showInputDialog("Berat muatan (Kg) :")));
//                        ken[i]=new Truck(plat);j=0;break;
//                    case "C":case "c":
//                        ken[i]=new Motor(plat);j=0;break;
//                    default:j=1;JOptionPane.showMessageDialog(null,"Pilihan salah!");
//                }
//            }while(j==1);
//        }


//for (int i = 0; i < ken.length; i++) {
//            String jenis=JOptionPane.showInputDialog("Jenis : (A)Bus,(B)Truck,(C)Motor");
//            String plat=JOptionPane.showInputDialog("Masukkan nomor polisi :");
//            switch (jenis){
//                case "A":case "a":
//                    ((Bus)ken[i]).setJumlahPenumpang(Double.parseDouble(JOptionPane.showInputDialog("Jumlah penumpang (Orang) :")));
//                    ken[i]=new Bus(plat);break;
//                case "B":case "b":
//                    ((Truck)ken[i]).setBeratTotal(Double.parseDouble(JOptionPane.showInputDialog("Berat muatan (Kg) :")));
//                    ken[i]=new Truck(plat);break;
//                case "C":case "c":
//                    ken[i]=new Motor(plat);break;
//                default:JOptionPane.showMessageDialog(null,"Pilihan salah!");
//            }
//        }