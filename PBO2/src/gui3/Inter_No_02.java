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
 * @author Kirizu
 */
public class Inter_No_02 extends JInternalFrame implements ItemListener,ActionListener{
    JCheckBox checkbold,checkitalic;
    JButton tombolkiri,tomboltengah,tombolkanan;
    JLabel lbl;
    public Inter_No_02(){
        Container content=getContentPane();
        setTitle("Buttom test");
        setSize(400, 200);
        setLocation(450, 290);
        setResizable(false);
        content.setLayout(new BorderLayout());
        //panel kiri
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel1.setBackground(Color.WHITE);
        lbl = new JLabel("Welcome to Java",SwingConstants.CENTER);
        lbl.setFont(new Font("Calibri", Font.PLAIN, 18));
        lbl.setVerticalAlignment(SwingConstants.CENTER);
        panel1.add(lbl);
        content.add(panel1, BorderLayout.CENTER);
        //kanan
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2, 1));
        checkbold = new JCheckBox("Bold");
        checkitalic = new JCheckBox("Italic");
        checkbold.addItemListener(this);
        checkitalic.addItemListener(this);
        panel2.add(checkbold);
        panel2.add(checkitalic);
        panel2.setBorder(BorderFactory.createBevelBorder(1));
        content.add(panel2, BorderLayout.EAST);
        //bawah
        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        tombolkiri = new JButton("Left");
        tomboltengah = new JButton("Centered");
        tombolkanan = new JButton("Right");
        tombolkiri.addActionListener(this);
        tomboltengah.addActionListener(this);
        tombolkanan.addActionListener(this);
        panel3.add(tombolkiri);
        panel3.add(tomboltengah);
        panel3.add(tombolkanan);
        content.add(panel3, BorderLayout.SOUTH);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        Font f =lbl.getFont();
        if (e.getItem().equals(checkbold)) {
            if (e.getStateChange()==ItemEvent.SELECTED) 
                lbl.setFont(f.deriveFont(f.getStyle()|Font.BOLD));
            else 
                lbl.setFont(f.deriveFont(f.getStyle()&~Font.BOLD));
        }
        else if (e.getItem().equals(checkitalic)) {
            if (e.getStateChange()==ItemEvent.SELECTED)
                lbl.setFont(f.deriveFont(f.getStyle()|Font.ITALIC));
            else
                lbl.setFont(f.deriveFont(f.getStyle()&~Font.ITALIC));
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String text=e.getActionCommand();
        if (text.equals("Left"))
            lbl.setHorizontalAlignment(SwingConstants.LEFT);
        else if (text.equals("Centered"))
            lbl.setHorizontalAlignment(SwingConstants.CENTER);
        else if (text.equals("Right"))
            lbl.setHorizontalAlignment(SwingConstants.RIGHT);
    }
}
