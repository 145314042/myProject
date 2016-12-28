package userInterface;
import data.DataMahasiswa;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.logging.*;
/**
 * @author BUDHI DARMA P
 */
public class FrameSaveConfirmation extends JFrame {
    private String bulan;
    private String tahun;
    FrameRegistration registration=new FrameRegistration();
    Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
    JPanel panelMain,panelIsi,panelButton;
    JButton buttonCancel,buttonSave;
    JLabel labelJudul;
    JTextArea textAreaIsi;
    JScrollPane scrollPanelIsi;
    private String kelengkapan,kelengkapanIndex,textKeluaran;
        public FrameSaveConfirmation(final String data) {
        //set frame
        this.setTitle("Confirmation");
        this.setSize(300, 215);
        int frameWidth=((dim.width-this.getSize().width)/2);
        int frameHeigth=((dim.height-this.getSize().height)/2);
        this.setLocation(frameWidth, frameHeigth);
        this.setResizable(false);
        this.setUndecorated(true);
        this.setBackground(Color.WHITE);
        this.setLayout(new FlowLayout());
        //set panel
        panelMain=new JPanel();
        panelMain.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panelIsi=new JPanel();
        panelButton=new JPanel();
        panelMain.setLayout(new BorderLayout());
        panelIsi.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
        //set label
        labelJudul=new JLabel("Data Mahasiswa");
        //set isi
        textAreaIsi=new JTextArea(6,24);
        String[] textSplit=data.split(";");
        String[] periodeSplit=textSplit[3].split("[ ]");
        kelengkapanIndex=textSplit[5];
        kelengkapan="";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(0)))) kelengkapan+="- Daftar Nilai\n";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(1)))) kelengkapan+="- Naskah TA\n";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(2)))) kelengkapan+="- Bebas Pinjam LAB\n";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(3)))) kelengkapan+="- Bebas Pinjam Dosen\n";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(4)))) kelengkapan+="- Bukti Laporan KP\n";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(5)))) kelengkapan+="- Surat KKL/KI";
        textAreaIsi.setText("Data Pribadi Mahasiswa\nNim : "+textSplit[0]+"\nNama : "+textSplit[1]+
                "\nNomor Hp : "+textSplit[2]+"\nPeriode : "+periodeSplit[0]+" "+periodeSplit[1]+"\nTanggal daftar : "+
                textSplit[4]+"\nKelengkapan : \n"+kelengkapan);
        scrollPanelIsi=new JScrollPane(textAreaIsi,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //set button
        buttonCancel=new JButton("Cancel");
        buttonSave=new JButton("Save");
        //add listener
        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataMahasiswa inputMahasiswa=new DataMahasiswa();
                try {
                    inputMahasiswa.goToFile(data);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FrameSaveConfirmation.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FrameSaveConfirmation.class.getName()).log(Level.SEVERE, null, ex);
                }
                setVisible(false);
            }
        });
        //add panel
        panelIsi.add(scrollPanelIsi);
        panelButton.add(buttonCancel);
        panelButton.add(buttonSave);
        panelMain.add(labelJudul,BorderLayout.NORTH);
        panelMain.add(panelIsi,BorderLayout.CENTER);
        panelMain.add(panelButton,BorderLayout.SOUTH);
        this.add(panelMain);
    }
}
