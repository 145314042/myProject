/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKMFINAL;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author Lycorice
 */
class AddMasyarakat extends JInternalFrame{
    MasyarakatSekitar mys;
    private String nama;
    private String nomor;
    private String tempat;
    private String tanggalLahir;
    Container content=getContentPane();
    JLabel labelNama=new JLabel("Nama Masyarakat");
    JLabel labelNomor=new JLabel("Nomor Masyarakat");
    JLabel labelTempat=new JLabel("Tempat Lahir ");
    JLabel labelTanggalLahir=new JLabel("Tanggal Lahir");
    JTextField inputNama=new JTextField();
    JTextField inputNomor=new JTextField();
    JTextField inputTempat=new JTextField();
    JTextField inputTanggalLahir=new JTextField();
    JButton buttonSave=new JButton("Save");
    public AddMasyarakat() throws IOException{
        setTitle("Tambah Masyarakat");
        setSize(500, 200);
        buttonSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    Data data=new Data();
                    setNomor(String.valueOf(inputNomor.getText()));
                    setNama(String.valueOf(inputNama.getText()));
                    setTempat(String.valueOf(inputTempat.getText()));
                    setTanggalLahir(String.valueOf(inputTanggalLahir.getText()));
                    mys=new MasyarakatSekitar(getNomor(),getNama(),getTempat()+", "+getTanggalLahir());
                    String text = mys.getNomor()+";"+mys.getNama()+";"+mys.getTempatTanggalLahir()+";"+"MasyarakatSekitar";
                    int confirmation = JOptionPane.showConfirmDialog(null, "Nomor : "+mys.getNomor()+"\nNama : "+mys.getNama()+
                            "\nTempat, tanggal lahir : "+mys.getTempatTanggalLahir()+
                            "\nJenis anggota : "+"MasyarakatSekitar", "Save", JOptionPane.YES_NO_OPTION);
                    if (confirmation==JOptionPane.YES_OPTION) {
                        data.addCount();
                        data.addData(text);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                }
            }
        });
        content.setLayout(new BorderLayout());
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(4, 2));
        panel1.add(labelNomor);
        panel1.add(inputNomor);
        panel1.add(labelNama);
        panel1.add(inputNama);
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
    public String getNomor() {
        return nomor;
    }
    public void setNomor(String nomor) throws Exception {
        if (nomor.matches("\\d{4}")) this.nomor = nomor;
        else throw new Exception("Nomor harus angka dan berjumlah 9 digit.");
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
