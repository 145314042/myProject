/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKM2;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public AddMahasiswa() throws FileNotFoundException{
        setTitle("Tambah Masyarakat");
        setSize(500, 200);
        File outFile = new File("Penduduk.data");
        FileOutputStream outFileStream = new FileOutputStream(outFile);
        PrintWriter outStream = new PrintWriter(outFile);
        buttonSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    setNama(String.valueOf(inputNama.getText()));
                    setNIM(String.valueOf(inputNIM.getText()));
                    setTempat(String.valueOf(inputTempat.getText()));
                    setTanggalLahir(String.valueOf(inputTanggalLahir.getText()));
                    mhs=new Mahasiswa(getNIM(),getNama(),getTempat()+", "+getTanggalLahir());
                    JOptionPane.showMessageDialog(null,"Nama : "+mhs.getNama()+"\nNomor : "+
                            mhs.getNim()+"\nTempat, tanggal lahir : "+mhs.getTempatTanggalLahir());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
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
    public void setNama(String nama) throws Exception {
        if (nama.matches("\\D*")) this.nama = nama;
        else throw new Exception("Karakter salah. Hanya boleh huruf.");
    }
    public String getNIM() {
        return NIM;
    }
    public void setNIM(String NIM) throws Exception {
        if (NIM.matches("\\d{9}")) this.NIM = NIM;
        else throw new Exception("NIM harus angka dan berjumlah 9 digit.");
    }
    public String getTempat() {
        return tempat;
    }
    public void setTempat(String tempat) throws Exception {
        if (tempat.matches("\\D*")) this.tempat = tempat;
        else throw new Exception("Penulisan tempat salah");
    }
    public String getTanggalLahir() {
        return tanggalLahir;
    }
    public void setTanggalLahir(String tanggalLahir) throws Exception {
        if (tanggalLahir.matches("[0-3][0-9][ ][a-zA-Z]*[ ][0-9]{4}")) this.tanggalLahir = tanggalLahir;
        else throw new Exception("Format penulisan tanggal (dd mmmmm yyyy)");
    }
}
