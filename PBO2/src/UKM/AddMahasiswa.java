/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKM;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author Lycorice
 */
class AddMahasiswa extends JInternalFrame{
    Mahasiswa mhs;
    private String nama;
    private String NIM;
    private String tempat;
    private String tanggalLahir;
    Container content=getContentPane();
    JLabel labelNama=new JLabel("Nama Mahasiswa");
    JLabel labelNIM=new JLabel("NIM Mahasiswa");
    JLabel labelTempat=new JLabel("Tempat Lahir ");
    JLabel labelTanggalLahir=new JLabel("Tanggal Lahir");
    JTextField inputNama=new JTextField();
    JTextField inputNIM=new JTextField();
    JTextField inputTempat=new JTextField();
    JTextField inputTanggalLahir=new JTextField();
    JButton buttonSave=new JButton("Save");
    public AddMahasiswa(){
        setTitle("Tambah Masyarakat");
        setSize(500, 200);
        buttonSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    setNama(String.valueOf(inputNama.getText()));
                    getNama().contains("[a-zA-Z]");
                    setNIM(String.valueOf(inputNIM.getText()));
                    setTempat(String.valueOf(inputTempat.getText()));
                    setTanggalLahir(String.valueOf(inputTanggalLahir.getText()));
                    int cek=Integer.parseInt(inputNIM.getText());
                    mhs=new Mahasiswa(getNIM(),getNama(),getTempat()+", "+getTanggalLahir());
                    JOptionPane.showMessageDialog(null,"Nama : "+mhs.getNama()+"\nNomor : "+
                            mhs.getNim()+"\nTempat, tanggal lahir : "+mhs.getTempatTanggalLahir());
                }catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null,"Nomor masyarakat harus berisi angka.");
                }
            }
        });
        content.setLayout(new BorderLayout());
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(4, 2));
        panel1.add(labelNama);
        panel1.add(inputNama);
        panel1.add(labelNIM);
        panel1.add(inputNIM);
        panel1.add(labelTempat);
        panel1.add(inputTempat);
        panel1.add(labelTanggalLahir);
        panel1.add(inputTanggalLahir);
        JPanel panel2=new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(buttonSave);
        content.add(panel1,BorderLayout.CENTER);
        content.add(panel2,BorderLayout.SOUTH);
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNIM() {
        return NIM;
    }
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    public String getTempat() {
        return tempat;
    }
    public void setTempat(String tempat) {
        this.tempat = tempat;
    }
    public String getTanggalLahir() {
        return tanggalLahir;
    }
    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
}
