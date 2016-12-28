/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Kirizu
 */
public class No_01 extends JFrame implements ActionListener{
    public  No_01(){
        Container content=getContentPane();
        setTitle("Buttom test");
        setSize(400, 200);
        setLocation(450, 290);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        content.setLayout(new FlowLayout(1));
        //tombol
        JButton tombol1=new JButton("Red");
        JButton tombol2=new JButton("Yellow");
        JButton tombol3=new JButton("Green");
        tombol1.addActionListener(this);
        tombol2.addActionListener(this);
        tombol3.addActionListener(this);
        content.add(tombol1);
        content.add(tombol2);
        content.add(tombol3);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String text=e.getActionCommand();
        if ("Red".equals(text))
            this.getContentPane().setBackground(Color.red);
        else if ("Yellow".equals(text))
            this.getContentPane().setBackground(Color.yellow);
        else if ("Green".equals(text))
            this.getContentPane().setBackground(Color.green);
    }
}
