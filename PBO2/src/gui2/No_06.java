/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui2;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;


/**
 *
 * @author Kirizu
 */
public class No_06 extends JDialog {
    String[] itemlist={"Straw Hat","Red Hair","Whitebeard","Arlong"};
    JComboBox combo1=new JComboBox(itemlist);
    JLabel labelicon,labeltext;
    JTextArea textarea1;
    JScrollPane scroll;
    public No_06()throws IOException{
        Container content=getContentPane();
        setTitle("ComboBoxDemo");
        setBounds(10, 10, 400, 150);
        content.setLayout(new BorderLayout());
        //atas
        content.add(combo1,BorderLayout.NORTH);
        //kiri
        JPanel panelkiri=new JPanel();
        panelkiri.setLayout(new FlowLayout());
        Image img1=ImageIO.read(new File("D:\\Thomas\\NetBeans\\Material\\1. Straw Hat\\icon.png"));
        Image imgrs1=img1.getScaledInstance(50, 50, 1);
        labelicon=new JLabel(new ImageIcon(imgrs1));
        labeltext=new JLabel("Straw Hat");
        panelkiri.add(labelicon);        
        panelkiri.add(labeltext);
        content.add(panelkiri,BorderLayout.CENTER);
        //kanan
        JPanel panelkanan=new JPanel();
        textarea1=new JTextArea("The Straw Hat Pirates are a pirate crew that originated from East Blue, but have various members from different areas."
                + " They are the main focus and protagonists of the anime and manga One Piece, and are led by the main protagonist."
                + "Monkey D. Luffy. The \"Straw Hats\" are named after Luffy's signature hat that was given to him by Red-Haired Shanks, "
                + "and are first referred to as the Straw Hat Pirates by Smoker in Alabasta."
                ,4,26);
        textarea1.setLineWrap(true);
        scroll=new JScrollPane(textarea1,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panelkanan.add(scroll);
        content.add(panelkanan,BorderLayout.EAST);
    }
}

//implements 
//        ActionListener
//{
//    String[] itemlist={"Straw Hat","Red Hair","Whitebeard","Arlong","Heart",
//        "Blackbeard","Buggy","New Fishman","Marine","Rumbar","Roger","Donquixote"};
//    JLabel icon;
//    JTextArea keterangan;
//    
//    public No_06() throws IOException{
//        Container content = getContentPane();
//        setTitle("ComboBoxDemo");
//        setSize(400, 150);
//        setLocation(10, 10);
//        setResizable(false);
//        content.setLayout(new BorderLayout());
//        //atas
//        JComboBox combobox=new JComboBox(itemlist);
//        content.add(combobox,BorderLayout.NORTH);
//        combobox.addActionListener(this);
//        //kiri
//        JPanel panelkiri=new JPanel();
//        panelkiri.setSize(70, 100);
//        panelkiri.setLayout(new FlowLayout(1));
//        //icon
//        Image img1=ImageIO.read(new File("D:\\Tugas\\USD\\Kuliah\\Semester 3\\Prak. Pemrograman Berorientasi Obyek II\\Material\\Icon\\Straw_Hat_Pirates.png"));
//        Image img2=ImageIO.read(new File("D:\\Tugas\\USD\\Kuliah\\Semester 3\\Prak. Pemrograman Berorientasi Obyek II\\Material\\Icon\\Red_Hair_Pirates.png"));
//        Image img3=ImageIO.read(new File("D:\\Tugas\\USD\\Kuliah\\Semester 3\\Prak. Pemrograman Berorientasi Obyek II\\Material\\Icon\\Whitebeard_Pirates.png"));
//        Image img4=ImageIO.read(new File("D:\\Tugas\\USD\\Kuliah\\Semester 3\\Prak. Pemrograman Berorientasi Obyek II\\Material\\Icon\\Arlong_Pirates.png"));
//        Image imgrs1=img1.getScaledInstance(50, 50, 1);
//        Image imgrs2=img2.getScaledInstance(50, 50, 1);
//        Image imgrs3=img3.getScaledInstance(50, 50, 1);
//        Image imgrs4=img4.getScaledInstance(50, 50, 1);
//        icon=new JLabel(new ImageIcon(imgrs1));
////        icon2=new JLabel(new ImageIcon(imgrs2));
////        icon3=new JLabel(new ImageIcon(imgrs3));
////        icon4=new JLabel(new ImageIcon(imgrs4));
//        //judul
//        judul=new JLabel("Straw Hat");
////        judul2=new JLabel("Red Hair");
////        judul3=new JLabel("Whtiebeard");
////        judul4=new JLabel("Arlong");
//        //visible
//        icon.setVisible(false);
//        icon2.setVisible(false);
//        icon3.setVisible(false);
//        icon4.setVisible(false);
//        judul1.setVisible(false);
//        judul2.setVisible(false);
//        judul3.setVisible(false);
//        judul4.setVisible(false);
//        //add ke panel
//        panelkiri.add(icon1);
//        panelkiri.add(judul1);
//        panelkiri.add(icon2);
//        panelkiri.add(judul2);
//        panelkiri.add(icon3);
//        panelkiri.add(judul3);
//        panelkiri.add(icon4);
//        panelkiri.add(judul4);
//        content.add(panelkiri);
//        //kanan
//        JPanel panelkanan=new JPanel();
//        panelkanan.setLayout(new BorderLayout());
//        String text1,text2,text3,text4;
//        text1="The Straw Hat Pirates are a pirate crew that originated from East Blue, but have various members from different areas. They are the main focus and protagonists of the anime and manga One Piece, and are led by the main protagonist, Monkey D. Luffy. The \"Straw Hats\" are named after Luffy's signature hat that was given to him by Red-Haired Shanks, and are first referred to as the Straw Hat Pirates by Smoker in Alabasta. The crew sailed on the Going Merry, their first official Straw Hat ship, up until the Water 7 Arc. After the Enies Lobby Arc, they obtain a new ship called the Thousand Sunny. The Straw Hats currently consist of nine members whose combined bounties equal 900,000,050 Beli, whilst including Straw Hat Grand Fleet their total bounty is at least 1,397,000,050 Beli.\n" +
//            "Following the events on the Sabaody Archipelago, all nine members were separated from one another. For two years, they trained in relatively isolated locations, becoming stronger for the sake of helping each other. ";
//        text2="The Red Hair Pirates is a strong crew ruling in the New World, led by their captain, Red-Haired Shanks, who is one of the Yonko. This crew is responsible for influencing two of the Straw Hat Pirates to become pirates, Monkey D. Luffy and Usopp.";
//        text3="The Whitebeard Pirates were formerly one of the strongest pirate crews in the world, as their captain Whitebeard was the only pirate to have ever been a match for the Pirate King, Gol D. Roger, in a fight. Whitebeard's crew is segmented into divisions, instead of all under their captain's direct command. Following the deaths of Whitebeard and Ace, as well as the actions of the Blackbeard Pirates conquering the Whitebeard Pirates' former territories and their captain usurping Whitebeard's position in the Yonko, the whereabouts and status of the remaining crew is currently unknown.";
//        text4="The Arlong Pirates were led by Arlong. Every member of the crew was a Fishman, except for Nami (who later left). They existed before the Sun Pirates, but joined with them when they were formed. After the death of Fisher Tiger, they split from Jinbe's crew, after he became a Shichibukai and became their own crew once again. They believed they were above humans as the stronger species, and looked down on them as inferior. After they were defeated, they were arrested. Mohmoo was never taken into custody and Hachi later escaped. The crew is no longer active.";
//        keterangan1=new JTextArea(text1,1,5);
//        keterangan2=new JTextArea(text2,1,5);
//        keterangan3=new JTextArea(text3,1,5);
//        keterangan4=new JTextArea(text4,1,5);
//        //scroll
//        JScrollPane scroll1=new JScrollPane(keterangan1);
//        JScrollPane scroll2=new JScrollPane(keterangan2);
//        JScrollPane scroll3=new JScrollPane(keterangan3);
//        JScrollPane scroll4=new JScrollPane(keterangan4);
//        panelkanan.add(scroll1);
//        //size
////        keterangan1.setPreferredSize(new Dimension(200, 130));
//        //visible
//        keterangan1.setVisible(false);
//        keterangan2.setVisible(false);
//        keterangan3.setVisible(false);
//        keterangan4.setVisible(false);
//        //add
//        panelkanan.add(scroll1,BorderLayout.CENTER);
//        panelkanan.add(scroll2,BorderLayout.CENTER);
//        panelkanan.add(scroll3,BorderLayout.CENTER);
//        panelkanan.add(scroll4,BorderLayout.CENTER);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent event) {
//        JComboBox combo=(JComboBox)event.getSource();
//        int pilih=combo.getSelectedIndex();
//        if (pilih==1){
//            this.icon1.setVisible(true);
//            this.icon2.setVisible(false);
//            this.icon3.setVisible(false);
//            this.icon4.setVisible(false);
//            this.judul1.setVisible(true);
//            this.judul2.setVisible(false);
//            this.judul3.setVisible(false);
//            this.judul4.setVisible(false);
////            this.keterangan1.setVisible(true);
////            this.keterangan2.setVisible(false);
////            this.keterangan3.setVisible(false);
////            this.keterangan4.setVisible(false);
//        }
//        else if (pilih==2){
//            this.icon1.setVisible(false);
//            this.icon2.setVisible(true);
//            this.icon3.setVisible(false);
//            this.icon4.setVisible(false);
//            this.judul1.setVisible(false);
//            this.judul2.setVisible(true);
//            this.judul3.setVisible(false);
//            this.judul4.setVisible(false);
//            this.keterangan1.setVisible(false);
//            this.keterangan2.setVisible(true);
//            this.keterangan3.setVisible(false);
//            this.keterangan4.setVisible(false);
//        }
//        else if (pilih==3){
//            this.icon1.setVisible(false);
//            this.icon2.setVisible(false);
//            this.icon3.setVisible(true);
//            this.icon4.setVisible(false);
//            this.judul1.setVisible(false);
//            this.judul2.setVisible(false);
//            this.judul3.setVisible(true);
//            this.judul4.setVisible(false);
//            this.keterangan1.setVisible(false);
//            this.keterangan2.setVisible(false);
//            this.keterangan3.setVisible(true);
//            this.keterangan4.setVisible(false);
//        }
//        else if (pilih==4){
//            this.icon1.setVisible(false);
//            this.icon2.setVisible(false);
//            this.icon3.setVisible(false);
//            this.icon4.setVisible(true);
//            this.judul1.setVisible(false);
//            this.judul2.setVisible(false);
//            this.judul3.setVisible(false);
//            this.judul4.setVisible(true);
//            this.keterangan1.setVisible(false);
//            this.keterangan2.setVisible(false);
//            this.keterangan3.setVisible(false);
//            this.keterangan4.setVisible(true);
//        }
//        else {
//            this.icon1.setVisible(false);
//            this.icon2.setVisible(false);
//            this.icon3.setVisible(false);
//            this.icon4.setVisible(false);
//            this.judul1.setVisible(false);
//            this.judul2.setVisible(false);
//            this.judul3.setVisible(false);
//            this.judul4.setVisible(false);
//            this.keterangan1.setVisible(false);
//            this.keterangan2.setVisible(false);
//            this.keterangan3.setVisible(false);
//            this.keterangan4.setVisible(false);
//        }
//    }
//}
