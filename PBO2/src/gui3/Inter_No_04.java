/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui3;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/**
 *
 * @author Lycorice
 */
public class Inter_No_04 extends JInternalFrame implements ActionListener{
    Container content=getContentPane();
    
    JComboBox combobox=new JComboBox();
    JLabel lblicon,lbltxt;
    JTextArea text;
    JScrollPane scroll;
    //set image
    Image img1=ImageIO.read(new File("D:\\Task\\Material\\1. Straw Hat\\icon.png"));
    Image img2=ImageIO.read(new File("D:\\Task\\Material\\2. Red Hair\\icon.png"));
    Image img3=ImageIO.read(new File("D:\\Task\\Material\\3. Whitebeard\\icon.png"));
    Image img4=ImageIO.read(new File("D:\\Task\\Material\\4. Arlong\\icon.png"));
    Image imgrs1=img1.getScaledInstance(80, 80, 1);
    Image imgrs2=img2.getScaledInstance(80, 80, 1);
    Image imgrs3=img3.getScaledInstance(80, 80, 1);
    Image imgrs4=img4.getScaledInstance(80, 80, 1);
    String txt1="The Straw Hat Pirates are a pirate crew that originated from East Blue, but have various members from different areas. They are the main focus and protagonists of the anime and manga One Piece";
    String txt2="The Red Hair Pirates is a strong crew ruling in the New World, led by their captain, Red-Haired Shanks, who is one of the Yonko. This crew is responsible for influencing two of the Straw Hat Pirates to become pirates, Monkey D. Luffy and Usopp.";
    String txt3="The Whitebeard Pirates were formerly one of the strongest pirate crews in the world, as their captain Whitebeard was the only pirate to have ever been a match for the Pirate King, Gol D. Roger, in a fight.";
    String txt4="The Arlong Pirates were led by Arlong. Every member of the crew was a Fishman, except for Nami (who later left). They existed before the Sun Pirates, but joined with them when they were formed. After the death of Fisher Tiger, they split from Jinbe's crew, after he became a Shichibukai and became their own crew once again.";
    JPanel panelkiri=new JPanel();
    JPanel panelkanan=new JPanel();
    
    public Inter_No_04() throws IOException{
        setTitle("ComboBoxDemo");
        setSize(300, 170);
        setLocation(450, 290);
        setResizable(false);
        content.setLayout(new BorderLayout());
        //combobox
        combobox.addItem("Straw Hat");
        combobox.addItem("Red Hair");
        combobox.addItem("Whitebeard");
        combobox.addItem("Arlong");
        combobox.addActionListener(this);
        content.add(combobox,BorderLayout.NORTH);//
        //panel kiri
        panelkiri.setLayout(new FlowLayout());
        lblicon=new JLabel(new ImageIcon(imgrs1));
        lbltxt=new JLabel("Straw Hat");
        panelkiri.add(lblicon);
        panelkiri.add(lbltxt);
        content.add(panelkiri,BorderLayout.CENTER);
        //panel kanan
        text=new JTextArea(txt1);
        text.setColumns(15);
        text.setRows(6);
        text.setLineWrap(true);
        scroll=new JScrollPane(text,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panelkanan.add(scroll);
        content.add(panelkanan,BorderLayout.EAST);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (combobox.getSelectedItem()=="Straw Hat") {
            lblicon.setIcon(new ImageIcon(imgrs1));
            lbltxt.setText("Straw Hat");
            text.setText(txt1);
        }
        else if (combobox.getSelectedItem()=="Red Hair") {
            lblicon.setIcon(new ImageIcon(imgrs2));
            lbltxt.setText("Red Hair");
            text.setText(txt2);
        }
        else if (combobox.getSelectedItem()=="Whitebeard") {
            lblicon.setIcon(new ImageIcon(imgrs3));
            lbltxt.setText("Whitebeard");
            text.setText(txt3);
        }
        else if (combobox.getSelectedItem()=="Arlong") {
            lblicon.setIcon(new ImageIcon(imgrs4));
            lbltxt.setText("Arlong");
            text.setText(txt4);
        }
    }
}