package UKM4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author Lycorice
 */
class AddUkm extends JInternalFrame{
    JLabel labelNama=new JLabel("Nama UKM ");
    JLabel labelAnggota=new JLabel("Anggota ");
    JTextField inputNama=new JTextField();
    JButton buttonSave=new JButton("Save");
    JTextArea textAreaOutput=new JTextArea(26, 5);
    JScrollPane scroll = new JScrollPane(textAreaOutput);
    JPanel panelMain,panelNamaUKM,panelAnggota;
    public AddUkm(){
    }
}
