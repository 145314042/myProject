/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class MainUKM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apa nama UKM yang akan dimasukkan datanya ? ");
        UKM ukm = new UKM(sc.next());

        System.out.print("Siapa nama ketua UKM " + ukm.getNamaUnit() + " : ");
        String nama = sc.next();
        System.out.print("Berapa nim ketua UKM " + ukm.getNamaUnit() + " : ");
        String nim = sc.next();
        System.out.print("Dimana tempat lahir ketua UKM " + ukm.getNamaUnit() + " : ");
        String tempat = sc.next();
        System.out.print("Berapa tanggal lahir ketua UKM " + ukm.getNamaUnit() + " : ");
        String tgllahir = sc.next();
        Mahasiswa ketua = new Mahasiswa(nim, nama, tempat + ", " + tgllahir);
        ukm.setKetua(ketua);

        System.out.print("Siapa nama sekretaris UKM " + ukm.getNamaUnit() + " : ");
        nama = sc.next();
        System.out.print("Berapa nim sekretaris UKM " + ukm.getNamaUnit() + " : ");
        nim = sc.next();
        System.out.print("Dimana tempat lahir sekretaris UKM " + ukm.getNamaUnit() + " : ");
        tempat = sc.next();
        System.out.print("Berapa tanggal lahir sekretaris UKM " + ukm.getNamaUnit() + " : ");
        tgllahir = sc.next();
        Mahasiswa sekretaris = new Mahasiswa(nim, nama, tempat + ", " + tgllahir);
        ukm.setSekretaris(sekretaris);

        System.out.print("Berapa anggota UKM yang akan dimasukkan ? ");
        Penduduk[] ang = new Penduduk[sc.nextInt() + 2];
        ang[0] = ketua;
        ang[1] = sekretaris;
        for (int i = 2; i < ang.length; i++) {
            System.out.println("Jenis anggota yang akan anda masukkan : "
                    + "\n1. Mahasiswa"
                    + "\n2. Masyarakat Sekitar");
            String pilih = sc.next();
            System.out.print("Siapa nama anggota UKM " + ukm.getNamaUnit() + " : ");
            nama = sc.next();
            switch (pilih) {
                case "1":
                    ang[i] = new Mahasiswa();
                    System.out.print("Berapa nim anggota UKM " + ukm.getNamaUnit() + " : ");
                    ((Mahasiswa) ang[i]).setNim(sc.next());
                    break;
                case "2":
                    ang[i] = new MasyarakatSekitar();
                    System.out.print("Berapa nomor anggota UKM " + ukm.getNamaUnit() + " : ");
                    ((MasyarakatSekitar) ang[i]).setNomor(sc.next());
                    break;
            }

            System.out.print("Dimana tempat lahir anggota UKM " + ukm.getNamaUnit() + " : ");
            tempat = sc.next();
            System.out.print("Berapa tanggal lahir angota UKM " + ukm.getNamaUnit() + " : ");
            tgllahir = sc.next();

            ang[i].setNama(nama);
            ang[i].setTempatTanggalLahir(tempat + ", " + tgllahir);
        }
        //set anggota UKM
        ukm.setAnggota(ang);
        //tampilkan data UKM
        System.out.println("DATA UKM " + ukm.getNamaUnit());
        System.out.println("======================================");
        System.out.println("Ketua      : " + ukm.getKetua().getNama());
        System.out.println("Sekretaris : " + ukm.getSekretaris().getNama());
        System.out.printf("%4s %12s %20s %25s %10.0s", "NO", "NIM/NOMOR", "NAMA", "STATUS", "IURAN");
        for (int i = 0; i < ang.length; i++) {
            if (ang[i] instanceof Mahasiswa) {
                nim = ((Mahasiswa) ang[i]).getNim();
            } else {
                nim = ((MasyarakatSekitar) ang[i]).getNomor();
            }
            System.out.printf("%4s %12s %20s %25s %10.0f", (i + 1), nim, ang[i].getNama(),
                    (ang[i].getClass().getName()).split("[.]")[1],
                    ang[i].hitungIuran());
        }
    }
}
