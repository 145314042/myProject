/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Lycorice
 */
class Inter_No_03 extends JInternalFrame implements ItemListener,ActionListener{
    JCheckBox checkbold,checkitalic;
    JButton tombolkiri,tomboltengah,tombolkanan;
    JLabel lbl;
    
    public Inter_No_03(){
        Container content=getContentPane();
        setTitle("Buttom test");
        setSize(400, 200);
        setLocation(450, 290);
        setResizable(false);
        content.setLayout(new BorderLayout());
        //panel kiri
        JPanel panelkiri=new JPanel();
        panelkiri.setLayout(new GridLayout(3,1));
        JRadioButton radiored=new JRadioButton("Red");
        JRadioButton radiogreen=new JRadioButton("Green");
        JRadioButton radioblue=new JRadioButton("Blue");
        ButtonGroup group=new ButtonGroup();
        group.add(radiored);
        group.add(radiogreen);
        group.add(radioblue);
        radiored.addActionListener(this);
        radiogreen.addActionListener(this);
        radioblue.addActionListener(this);
        panelkiri.add(radiored);
        panelkiri.add(radiogreen);
        panelkiri.add(radioblue);
        content.add(panelkiri,BorderLayout.WEST);
        //panel tengah
        JPanel paneltengah = new JPanel();
        paneltengah.setLayout(new BorderLayout());
        paneltengah.setBackground(Color.WHITE);
        lbl = new JLabel("Welcome to Java",SwingConstants.CENTER);
        lbl.setFont(new Font("Calibri", Font.PLAIN, 18));
        lbl.setVerticalAlignment(SwingConstants.CENTER);
        paneltengah.add(lbl);
        content.add(paneltengah, BorderLayout.CENTER);
        //kanan
        JPanel panelkanan = new JPanel();
        panelkanan.setLayout(new GridLayout(2, 1));
        checkbold = new JCheckBox("Bold");
        checkitalic = new JCheckBox("Italic");
        checkbold.addItemListener(this);
        checkitalic.addItemListener(this);
        panelkanan.add(checkbold);
        panelkanan.add(checkitalic);
        panelkanan.setBorder(BorderFactory.createBevelBorder(1));
        content.add(panelkanan, BorderLayout.EAST);
        //bawah
        JPanel panelbawah = new JPanel();
        panelbawah.setLayout(new FlowLayout());
        tombolkiri = new JButton("Left");
        tomboltengah = new JButton("Centered");
        tombolkanan = new JButton("Right");
        tombolkiri.addActionListener(this);
        tomboltengah.addActionListener(this);
        tombolkanan.addActionListener(this);
        panelbawah.add(tombolkiri);
        panelbawah.add(tomboltengah);
        panelbawah.add(tombolkanan);
        content.add(panelbawah, BorderLayout.SOUTH);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Font f =lbl.getFont();
        if (e.getItem().equals(checkbold)) {
            if (e.getStateChange()==ItemEvent.SELECTED) {
                lbl.setFont(f.deriveFont(f.getStyle()|Font.BOLD));
            }
            else {
                lbl.setFont(f.deriveFont(f.getStyle()&~Font.BOLD));
            }
        }
        else if (e.getItem().equals(checkitalic)) {
            if (e.getStateChange()==ItemEvent.SELECTED) {
                lbl.setFont(f.deriveFont(f.getStyle()|Font.ITALIC));
            }
            else{
                lbl.setFont(f.deriveFont(f.getStyle()&~Font.ITALIC));
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text=e.getActionCommand();
        if (text.equals("Left")) {
            lbl.setHorizontalAlignment(SwingConstants.LEFT);
        }
        else if (text.equals("Centered")) {
            lbl.setHorizontalAlignment(SwingConstants.CENTER);
        }
        else if (text.equals("Right")) {
            lbl.setHorizontalAlignment(SwingConstants.RIGHT);
        }
        else if (e.getActionCommand().equals("Red")){
            lbl.setForeground(Color.red);
        }
        else if (e.getActionCommand().equals("Green")){
            lbl.setForeground(Color.green);
        }
        else if (e.getActionCommand().equals("Blue")){
            lbl.setForeground(Color.blue);
        }
    }
    
        
    
}
