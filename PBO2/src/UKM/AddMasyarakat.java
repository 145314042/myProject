/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKM;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
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
        Image img1=ImageIO.read(new File("D:\\Task\\Material\\1. Straw Hat\\icon.png"));
        Image imgrs1=img1.getScaledInstance(80, 80, 1);
        ImageIcon icon=new ImageIcon(imgrs1);
        setTitle("Tambah Masyarakat");
        setSize(500, 200);
        buttonSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    setNama(String.valueOf(inputNama.getText()));
                    getNama().contains("[a-zA-Z]");
                    setNomor(String.valueOf(inputNomor.getText()));
                    setTempat(String.valueOf(inputTempat.getText()));
                    setTanggalLahir(String.valueOf(inputTanggalLahir.getText()));
                    int cek=Integer.parseInt(inputNomor.getText());
                    mys=new MasyarakatSekitar(getNomor(),getNama(),getTempat()+", "+getTanggalLahir());
                    JOptionPane.showMessageDialog(null,"Nama : "+mys.getNama()+"\nNomor : "+
                            mys.getNomor()+"\nTempat, tanggal lahir : "+mys.getTempatTanggalLahir(),
                            "Informasi",JOptionPane.INFORMATION_MESSAGE);
                }catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null,"Nomor masyarakat harus berisi angka.","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        content.setLayout(new BorderLayout());
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(4, 2));
        panel1.add(labelNama);
        panel1.add(inputNama);
        panel1.add(labelNomor);
        panel1.add(inputNomor);
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
    public String getNomor() {
        return nomor;
    }
    public void setNomor(String nomor) {
        this.nomor = nomor;
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
