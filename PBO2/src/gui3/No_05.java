/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui3;

import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author Lycorice
 */
public class No_05 extends JFrame implements ListSelectionListener {
    Container content=getContentPane();
    String[] itemlist={"Straw Hat","Red Hair","Whitebeard","Arlong","Heart",
        "Blackbeard","Buggy","New Fishman","Marine","Rumbar","Roger","Donquixote"};
    JList list;
    Image[] img={
        ImageIO.read(new File("D:\\Task\\Material\\1. Straw Hat\\icon.png")),
        ImageIO.read(new File("D:\\Task\\Material\\2. Red Hair\\icon.png")),
        ImageIO.read(new File("D:\\Task\\Material\\3. Whitebeard\\icon.png")),
        ImageIO.read(new File("D:\\Task\\Material\\4. Arlong\\icon.png")),
        ImageIO.read(new File("D:\\Task\\Material\\5. Heart\\icon.png")),
        ImageIO.read(new File("D:\\Task\\Material\\6. Blackbeard\\icon.png")),
        ImageIO.read(new File("D:\\Task\\Material\\7. Buggy\\icon.png")),
        ImageIO.read(new File("D:\\Task\\Material\\8. New Fishman\\icon.png")),
        ImageIO.read(new File("D:\\Task\\Material\\9. Golden Lion\\icon.png")),
        ImageIO.read(new File("D:\\Task\\Material\\10. Rumbar\\icon.png")),
        ImageIO.read(new File("D:\\Task\\Material\\11. Roger\\icon.png")),
        ImageIO.read(new File("D:\\Task\\Material\\12. Donquixote\\icon.png"))};
    Image[] imgrs;
    JLabel[] lbl;
    JPanel panelkiri=new JPanel();
    JPanel panelkanan=new JPanel();
    public No_05() throws IOException{
        setTitle("ListDemo");
        setSize(400, 200);
        setLocation(10, 10);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        content.setLayout(new BorderLayout());
        //set image
        this.imgrs = new Image[itemlist.length];
        for (int i = 0; i < itemlist.length; i++) {
            imgrs[i]=img[i].getScaledInstance(80, 80, 1);
        }
        this.lbl = new JLabel[itemlist.length];
        for (int i = 0; i < itemlist.length; i++) {
            lbl[i]=new JLabel(new ImageIcon(imgrs[i]));
        }
        //kiri
        list=new JList(itemlist);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        list.addListSelectionListener(this);
        JScrollPane scroll=new JScrollPane(list);
        scroll.setPreferredSize(new Dimension(100, 160));
        panelkiri.add(scroll);
        content.add(panelkiri,BorderLayout.WEST);
        //kanan
        panelkanan.setLayout(new GridLayout(3, 4));
        content.add(panelkanan,BorderLayout.CENTER);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        panelkanan.removeAll();
        for (int i = 0; i < itemlist.length; i++) {
            if (list.isSelectedIndex(i)==true) {
                panelkanan.add(lbl[i]);
                lbl[i].setVisible(true);
            }
        }
        for (int i = 0; i < itemlist.length; i++) {
            if(list.isSelectedIndex(i)==false){
                panelkanan.add(lbl[i]);
                lbl[i].setVisible(false);
            }
        }
    }
}

//    JLabel lbl1=new JLabel(new ImageIcon(imgrs1));
//    JLabel lbl2=new JLabel(new ImageIcon(imgrs2));
//    JLabel lbl3=new JLabel(new ImageIcon(imgrs3));
//    JLabel lbl4=new JLabel(new ImageIcon(imgrs4));
//    JLabel lbl5=new JLabel(new ImageIcon(imgrs5));
//    JLabel lbl6=new JLabel(new ImageIcon(imgrs6));
//    JLabel lbl7=new JLabel(new ImageIcon(imgrs7));
//    JLabel lbl8=new JLabel(new ImageIcon(imgrs8));
//    JLabel lbl9=new JLabel(new ImageIcon(imgrs9));
//    JLabel lbl10=new JLabel(new ImageIcon(imgrs10));
//    JLabel lbl11=new JLabel(new ImageIcon(imgrs11));
//    JLabel lbl12=new JLabel(new ImageIcon(imgrs12));

//        panelkanan.add(lbl1);
//        panelkanan.add(lbl2);
//        panelkanan.add(lbl3);
//        panelkanan.add(lbl4);
//        panelkanan.add(lbl5);
//        panelkanan.add(lbl6);
//        panelkanan.add(lbl7);
//        panelkanan.add(lbl8);
//        panelkanan.add(lbl9);
//        panelkanan.add(lbl10);
//        panelkanan.add(lbl11);
//        panelkanan.add(lbl12);


    
//    Image img1=ImageIO.read(new File("D:\\Task\\Material\\1. Straw Hat\\icon.png"));
//    Image img2=ImageIO.read(new File("D:\\Task\\Material\\2. Red Hair\\icon.png"));
//    Image img3=ImageIO.read(new File("D:\\Task\\Material\\3. Whitebeard\\icon.png"));
//    Image img4=ImageIO.read(new File("D:\\Task\\Material\\4. Arlong\\icon.png"));
//    Image img5=ImageIO.read(new File("D:\\Task\\Material\\5. Heart\\icon.png"));
//    Image img6=ImageIO.read(new File("D:\\Task\\Material\\6. Blackbeard\\icon.png"));
//    Image img7=ImageIO.read(new File("D:\\Task\\Material\\7. Buggy\\icon.png"));
//    Image img8=ImageIO.read(new File("D:\\Task\\Material\\8. New Fishman\\icon.png"));
//    Image img9=ImageIO.read(new File("D:\\Task\\Material\\9. Golden Lion\\icon.png"));
//    Image img10=ImageIO.read(new File("D:\\Task\\Material\\10. Rumbar\\icon.png"));
//    Image img11=ImageIO.read(new File("D:\\Task\\Material\\11. Roger\\icon.png"));
//    Image img12=ImageIO.read(new File("D:\\Task\\Material\\12. Donquixote\\icon.png"));
//    Image imgrs1=img1.getScaledInstance(80, 80, 1);
//    Image imgrs2=img2.getScaledInstance(80, 80, 1);
//    Image imgrs3=img3.getScaledInstance(80, 80, 1);
//    Image imgrs4=img4.getScaledInstance(80, 80, 1);
//    Image imgrs5=img5.getScaledInstance(80, 80, 1);
//    Image imgrs6=img6.getScaledInstance(80, 80, 1);
//    Image imgrs7=img7.getScaledInstance(80, 80, 1);
//    Image imgrs8=img8.getScaledInstance(80, 80, 1);
//    Image imgrs9=img9.getScaledInstance(80, 80, 1);
//    Image imgrs10=img10.getScaledInstance(80, 80, 1);
//    Image imgrs11=img11.getScaledInstance(80, 80, 1);
//    Image imgrs12=img12.getScaledInstance(80, 80, 1);
//    JLabel[] lbl={new JLabel(new ImageIcon(imgrs1)),new JLabel(new ImageIcon(imgrs2)),new JLabel(new ImageIcon(imgrs3)),
//    new JLabel(new ImageIcon(imgrs4)),new JLabel(new ImageIcon(imgrs5)),new JLabel(new ImageIcon(imgrs6)),
//    new JLabel(new ImageIcon(imgrs7)),new JLabel(new ImageIcon(imgrs8)),new JLabel(new ImageIcon(imgrs9)),
//    new JLabel(new ImageIcon(imgrs10)),new JLabel(new ImageIcon(imgrs11)),new JLabel(new ImageIcon(imgrs12)),};
