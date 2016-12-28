/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismeDanAbstract;

import javax.swing.JOptionPane;

/**
 *
 * @author Kirizu
 */
public class Main {
    public static void main(String[] args) {
        //input nama UKM
        UKM ukm=new UKM(JOptionPane.showInputDialog("Nama UKM yang akan dimasukan datanya"));
        //input data ketua UKM
        String nama=JOptionPane.showInputDialog("Nama Ketua UKM");
        String nim=JOptionPane.showInputDialog("Nim Ketua UKM");
        String tempat=JOptionPane.showInputDialog("Tempat lahir Ketua UKM");
        String tglLahir=JOptionPane.showInputDialog("Tanggal lahir Ketua UKM");
        Mahasiswa ketua=new Mahasiswa(nim,nama,tempat+", "+tglLahir);
        ukm.setKetua(ketua);
        //input data sekretaris UKM
        nama=JOptionPane.showInputDialog("Nama sekretaris UKM");
        nim=JOptionPane.showInputDialog("Nim sekretaris UKM");
        tempat=JOptionPane.showInputDialog("Tempat lahir sekretaris UKM");
        tglLahir=JOptionPane.showInputDialog("Tanggal lahir sekretaris UKM");
        Mahasiswa sekretaris=new Mahasiswa(nim,nama,tempat+", "+tglLahir);
        ukm.setSekretaris(sekretaris);
        //input jumlah anggota UKM
        int jum=Integer.parseInt(JOptionPane.showInputDialog("Jumlah anggota"));
        Penduduk[] pe=new Penduduk[jum+2];
        pe[0]=ketua;
        pe[1]=sekretaris;
        double total=((Mahasiswa)pe[0]).hitungIuran()+((Mahasiswa)pe[1]).hitungIuran();
        //input data anggota UKM
        for (int i = 2; i < pe.length; i++) {
            String jenis=JOptionPane.showInputDialog("Mahasiswa atau Masyarakat?");
            switch (jenis){
                case"mahasiswa":case"Mahasiswa":
                    nama=JOptionPane.showInputDialog("Nama anggota UKM");
                    nim=JOptionPane.showInputDialog("NIM anggota UKM");
                    tempat=JOptionPane.showInputDialog("Tempat lahir anggota UKM");
                    tglLahir=JOptionPane.showInputDialog("Tanggal lahir anggota UKM");
                    pe[i]=new Mahasiswa(nim, nama, tempat+", "+tglLahir);
                    ((Mahasiswa)pe[i]).hitungIuran();
                    ukm.setAnggota(pe);
                    total+=((Mahasiswa)pe[i]).hitungIuran();
                    break;
                case"masyarakat":case"Masyarakat":
                    nama=JOptionPane.showInputDialog("Nama anggota UKM");
                    nim=JOptionPane.showInputDialog("Nomor anggota UKM");
                    tempat=JOptionPane.showInputDialog("Tempat lahir anggota UKM");
                    tglLahir=JOptionPane.showInputDialog("Tanggal lahir anggota UKM");
                    pe[i]=new MasyarakatSekitar(nim, nama, tempat+", "+tglLahir);
                    ((MasyarakatSekitar)pe[i]).hitungIuran();
                    ukm.setAnggota(pe);
                    total+=((MasyarakatSekitar)pe[i]).hitungIuran();
                    break;
            }
        }
        //output data UKM
        System.out.println("UKM "+ukm.getNamaUnit()+"\n");
        System.out.println("Data Ketua :");
        System.out.println("Nama Ketua                   : "+ketua.getNama());
        System.out.println("NIM Ketua                    : "+ketua.getNIM());
        System.out.println("Tmpt/tgl. lahir Ketua        : "+ketua.getTempatTglLahir());
        System.out.printf("Iuran                        : Rp%.0f",((Mahasiswa)pe[0]).hitungIuran());
        System.out.println("\nData Sekretaris :");
        System.out.println("Nama Sekretaris              : "+sekretaris.getNama());
        System.out.println("NIM Sekretaris               : "+sekretaris.getNIM());
        System.out.println("Tmpt/tgl. lahir Sekretaris   : "+sekretaris.getTempatTglLahir());
        System.out.printf("Iuran                        : Rp%.0f",((Mahasiswa)pe[1]).hitungIuran());
        System.out.println("\nData anggota :");
        for (int i = 2; i < pe.length; i++) {
            System.out.println("Anggota "+(i-1));
            String al=pe[i].getClass().getName();
            String[] a=al.split("[.]");
            if(pe[i] instanceof Mahasiswa){
                System.out.println("Nama                 : "+((Mahasiswa)pe[i]).getNama());
                System.out.println("NIM                  : "+((Mahasiswa)pe[i]).getNIM());
                System.out.println("Tmpt/tgl. lahir      : "+((Mahasiswa)pe[i]).getTempatTglLahir());
                System.out.printf("Iuran                : Rp%.0f\n",((Mahasiswa)pe[i]).hitungIuran());
            }
            else if(pe[i] instanceof MasyarakatSekitar){
                System.out.println("Nama                 : "+((MasyarakatSekitar)pe[i]).getNama());
                System.out.println("Nomor                : "+((MasyarakatSekitar)pe[i]).getNomor());
                System.out.println("Tmpt/tgl. lahir      : "+((MasyarakatSekitar)pe[i]).getTempatTglLahir());
                System.out.printf("Iuran                : Rp%.0f\n",((MasyarakatSekitar)pe[i]).hitungIuran());
            }
            System.out.println("Jenis anggota        : "+a[1]);
        }
        System.out.printf("\nTotal Iuran         : Rp%.0f\n",total);
    }
}
