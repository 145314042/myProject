/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKMFINAL;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author Lycorice
 */
public class FrameMahasiswa extends JFrame implements ActionListener {
    Container content=getRootPane();
    JMenuBar menubar=new JMenuBar();
    JMenu menuFile=new JMenu("File");
    JMenu menuEdit=new JMenu("Edit");
    JMenu menuHelp=new JMenu("Help");
    JMenuItem menuItemFile1=new JMenuItem("Exit");
    JMenuItem menuItemFile2=new JMenuItem("Open Data");
    JMenuItem menuItemEdit1=new JMenuItem("Tambah Mahasiswa");
    JMenuItem menuItemEdit2=new JMenuItem("Tambah Masyarakat Sekitar");
    JMenuItem menuItemEdit3=new JMenuItem("Tambah UKM");
    public FrameMahasiswa(){
        setTitle("Mahasiswa");
        setSize(600, 400);
        setLocation(410,160);
        setResizable(false);
        menuItemFile1.addActionListener(this);
        menuItemFile2.addActionListener(this);
        menuItemEdit1.addActionListener(this);
        menuItemEdit2.addActionListener(this);
        menuItemEdit3.addActionListener(this);
        menubar.add(menuFile);
        menubar.add(menuEdit);
        menubar.add(menuHelp);
        menuFile.add(menuItemFile2);
        menuFile.addSeparator();
        menuFile.add(menuItemFile1);
        menuEdit.add(menuItemEdit1);
        menuEdit.add(menuItemEdit2);
        menuEdit.add(menuItemEdit3);
        this.setJMenuBar(menubar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            JDesktopPane desktoppane=new JDesktopPane();
            switch (e.getActionCommand()) {
                case "Exit":
                    System.exit(0);
                    break;
                case "Open Data":
                    OpenData openData=new OpenData();
                    openData.setVisible(true);
                    openData.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                    break;
                case "Tambah Mahasiswa":
                    this.getContentPane().removeAll();
                    AddMahasiswa addmhs=new AddMahasiswa();
                    addmhs.setVisible(true);
                    setContentPane(desktoppane);
                    this.getContentPane().add(addmhs);
                    break;
                case "Tambah Masyarakat Sekitar":
                    this.getContentPane().removeAll();
                    AddMasyarakat addmys=new AddMasyarakat();
                    addmys.setVisible(true);
                    setContentPane(desktoppane);
                    this.getContentPane().add(addmys);
                    break;
                case "Tambah UKM":
                    this.getContentPane().removeAll();
                    AddUkm addukm=new AddUkm();
                    setContentPane(desktoppane);
                    addukm.setVisible(true);
                    
                    this.getContentPane().add(addukm);
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(FrameMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
