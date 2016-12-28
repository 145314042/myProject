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
class AddUkm extends JInternalFrame{
    Container content=getContentPane();
    JLabel labelNama=new JLabel("Nama UKM ");
    JTextField inputNama=new JTextField();
    JButton buttonSave=new JButton("Save");
    public AddUkm(){
        setSize(500, 180);
        content.setLayout(new BorderLayout());
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(4, 2));
        panel1.add(labelNama);
        panel1.add(inputNama);
        JPanel panel2=new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(buttonSave);
        content.add(panel1,BorderLayout.CENTER);
        content.add(panel2,BorderLayout.SOUTH);
    }
}
