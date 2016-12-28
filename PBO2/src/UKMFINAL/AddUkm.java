package UKMFINAL;

import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author Lycorice
 */
public class AddUkm extends JInternalFrame{
    Data data=new Data();
    UKM ukm=new UKM();
    Penduduk[] penduduk;
    JPanel panelMain=new JPanel();
    JLabel labelSetUkm=new JLabel("Nama UKM ");
    JLabel labelSetKetua=new JLabel("Pilih Ketua ");
    JLabel labelSetSekretaris=new JLabel("Pilih Sekretaris ");
    private JTextField inputUkm=new JTextField();
    JButton buttonSave=new JButton("Save");
    JComboBox comboBoxKetua,comboBoxSekretaris;
    int count;
    public AddUkm() throws IOException{
        this.setTitle("Tambah UKM");
        this.setSize(500,200);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        //set penduduk
        count=data.readCount();
        penduduk=new Penduduk[count];
        for (int i = 0; i < count; i++) {
            String[] dataSplit=data.readData(i).split("[;]");
            String nomor=dataSplit[0];
            String nama=dataSplit[1];
            String ttl=dataSplit[2];
            String jenis=dataSplit[3];
            if ("Mahasiswa".equals(jenis)) {
                penduduk[i]=new Mahasiswa(nomor, nama, ttl);
            }
            else if ("MasyarakatSekitar".equals(jenis)){
                penduduk[i]=new MasyarakatSekitar(nomor, nama, ttl);
            }
        }
        //set combobox
        comboBoxKetua=new JComboBox();
        comboBoxSekretaris=new JComboBox();
        String[] listAnggota=new String[count];
        for (int i = 0; i < count; i++) {
            String[] dataSplit=data.readData(i).split("[;]");
            String nomor=dataSplit[0];
            String nama=dataSplit[1];
            String ttl=dataSplit[2];
            String jenis=dataSplit[3];
            if ("Mahasiswa".equals(jenis)) {
                comboBoxKetua.addItem(((Mahasiswa)penduduk[i]).getNama());
                comboBoxSekretaris.addItem(((Mahasiswa)penduduk[i]).getNama());
            }
        }
        //set button
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    data.addUkm(getInputUkm().getText(),String.valueOf(comboBoxKetua.getSelectedItem()),String.valueOf(comboBoxSekretaris.getSelectedItem()));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(AddUkm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        //set panel
        panelMain.setLayout(new GridLayout(3, 2));
        //add to panel
        panelMain.add(labelSetUkm);
        panelMain.add(inputUkm);
        panelMain.add(labelSetKetua);
        panelMain.add(comboBoxKetua);
        panelMain.add(labelSetSekretaris);
        panelMain.add(comboBoxSekretaris);
        this.add(panelMain,BorderLayout.CENTER);
        this.add(buttonSave,BorderLayout.SOUTH);
    }
    public JTextField getInputUkm() {
        return inputUkm;
    }
    public void setInputUkm(JTextField inputUkm) {
        this.inputUkm = inputUkm;
    }
}
