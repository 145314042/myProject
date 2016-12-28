/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKMFINAL;

//import data.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.text.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;

/**
 *
 * @author Lycorice
 */
public class OpenData extends JFrame{
    UKM ukm=new UKM();
    JPanel panelTop,panelCenter;
    JLabel labelUkm,labelKetua,labelSekretaris;
    JTextArea textArea;
    JTextField textFieldUkm,textFieldKetua,textFieldSekretaris;
    JScrollPane scroll;
    public OpenData() throws IOException{
        this.setTitle("Data Mahasiswa");
        this.setBounds(500,200,400,200);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        //set label
        labelUkm=new JLabel("Nama UKM");
        labelKetua=new JLabel("Nama Ketua");
        labelSekretaris=new JLabel("Nama Sekretaris");
        //set textfield
        Data readUkm=new Data();
        String[] dataSplit=readUkm.Ukm().split("[;]");
        String unit=dataSplit[0];
        String ketua=dataSplit[1];
        String sekretaris=dataSplit[2];
        textFieldUkm=new JTextField(unit);
        textFieldKetua=new JTextField(ketua);
        textFieldSekretaris=new JTextField(sekretaris);
        textFieldUkm.setEditable(false);
        textFieldKetua.setEditable(false);
        textFieldSekretaris.setEditable(false);
        //set text area
        AddUkm data=new AddUkm();
        String text="";
        for (int i = 0; i < data.penduduk.length; i++) {
            if (data.penduduk[i] instanceof Mahasiswa) {
                text=text+"Anggota "+(i+1)+"\nNIM                       : "+((Mahasiswa)data.penduduk[i]).getNim()
                +"\nNama                    : "+((Mahasiswa)data.penduduk[i]).getNama()
                +"\nTempat, Tanggal Lahir   : "+((Mahasiswa)data.penduduk[i]).getTempatTanggalLahir()+"\n";
            }
            else if (data.penduduk[i] instanceof MasyarakatSekitar) {
                text=text+"Anggota "+(i+1)+"\nNIM                       : "+((MasyarakatSekitar)data.penduduk[i]).getNomor()
                +"\nNama                    : "+((MasyarakatSekitar)data.penduduk[i]).getNama()
                +"\nTempat, Tanggal Lahir   : "+((MasyarakatSekitar)data.penduduk[i]).getTempatTanggalLahir()+"\n";
            }
        }
        textArea=new JTextArea(text, 5, 30);
//        textArea.setLineWrap(true);
        textArea.setEditable(false);
        scroll=new JScrollPane(textArea,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //set panel
        panelTop=new JPanel();
        panelTop.setLayout(new GridLayout(3, 2));
        panelCenter=new JPanel();
        //add panel
        panelTop.add(labelUkm);
        panelTop.add(textFieldUkm);
        panelTop.add(labelKetua);
        panelTop.add(textFieldKetua);
        panelTop.add(labelSekretaris);
        panelTop.add(textFieldSekretaris);
        panelCenter.add(scroll);
        this.add(panelTop,BorderLayout.NORTH);
        this.add(panelCenter,BorderLayout.CENTER);
    }
}
