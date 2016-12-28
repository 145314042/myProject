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
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.event.*;

/**
 *
 * @author Lycorice
 */
public class Inter_No_05 extends JInternalFrame implements ListSelectionListener {
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
    public Inter_No_05() throws IOException{
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
