/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui2;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

/**
 *
 * @author Kirizu
 */
public class No_07 extends JDialog{
    String[] itemlist={"Straw Hat","Red Hair","Whitebeard","Arlong","Heart",
        "Blackbeard","Buggy","New Fishman","Marine","Rumbar","Roger","Donquixote"};
    JList list;
    Image[] img=new Image[12];
    Image[] imgrs=new Image[12];
    JLabel[] label=new JLabel[12];
    
    public No_07() throws IOException{
        Container content=getContentPane();
        setTitle("ListDemo");
        setSize(400, 200);
        setLocation(10, 10);
        setResizable(false);
        content.setLayout(new BorderLayout());
        //kiri
        JPanel panelkiri=new JPanel();
        list=new JList(itemlist);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scroll=new JScrollPane(list);
        scroll.setPreferredSize(new Dimension(100, 160));
        panelkiri.add(scroll);
        content.add(panelkiri,BorderLayout.WEST);
        //kanan
        JPanel panelkanan=new JPanel();
        panelkanan.setLayout(new GridLayout(3, 4));
        for (int i = 0; i < label.length; i++) {
            img[i]=ImageIO.read(new File("D:\\Wallpaper\\One Piece\\Logo\\Straw_Hat_Pirates.png"));
            imgrs[i]=img[i].getScaledInstance(63, 50, 1);
//            label[i]=new JLabel(new ImageIcon(imgrs[i]));
//            panelkanan.add(label[i]);
        }
        content.add(panelkanan,BorderLayout.CENTER);
    }
}

//        label1.setVisible(false);
//        label2.setVisible(false);
//        label3.setVisible(false);
//        label4.setVisible(false);
//    @Override
//    public void itemStateChanged(ItemEvent e) {
//        
//    }

//    @Override
//    public void valueChanged(ListSelectionEvent e) {
//        JList listaction=(JList) e.getSource();
//        int listselect=listaction.getSelectedIndex();
//        if (listselect==0){
//            this.label1.setVisible(true);
//        }
//        else if (listselect==1){
//            this.label2.setVisible(true);
//        }
//        else if (listselect==2){
//            this.label3.setVisible(true);
//        }
//        else if (listselect==3){
//            this.label4.setVisible(true);
//        }
//        
//        if (listselect==0&&this.label1.isVisible()){
//            this.label1.setVisible(false);
//        }
//        else if (listselect==1&&this.label2.isVisible()){
//            this.label2.setVisible(false);
//        }
//        else if (listselect==2&&this.label3.isVisible()){
//            this.label3.setVisible(false);
//        }
//        else if (listselect==3&&this.label4.isVisible()){
//            this.label4.setVisible(false);
//        }
//        if (listselect==0){
//            if (this.label1.isVisible())this.label1.setVisible(false);
//            else this.label1.setVisible(true);
//        }
