/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKM4;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author Lycorice
 */
class Data extends JDialog{
    JPanel panelMain;
    JTextArea textAreaData;
    JScrollPane scrollData;
    
    public void OpenData() throws FileNotFoundException, IOException{
        this.setTitle("Open Data");
        this.setSize(400,300);
        this.setLocation(510, 180);
        File inFile = new File("DataPenduduk.data");
        FileReader fileReader = new FileReader(inFile);
        BufferedReader bufReader = new BufferedReader(fileReader);
        panelMain=new JPanel();
        
        for (int i = 0; i < (int)inFile.length(); i++) {
            textAreaData=new JTextArea(bufReader.readLine());
            System.out.println(i);
        }
        textAreaData.setPreferredSize(new Dimension(355,233));
        textAreaData.setLineWrap(true);
        textAreaData.setEditable(false);
        scrollData=new JScrollPane(textAreaData,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        panelMain.add(scrollData);
        this.add(panelMain);
    }
}
