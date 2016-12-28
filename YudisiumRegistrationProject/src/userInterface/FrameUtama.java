package userInterface;
import data.DataMahasiswa;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.*;
/**
 * @author Lycorice
 */
public class FrameUtama extends JFrame implements ActionListener{
    Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
    JLabel labelBackground;
    JPanel panel;
    public FrameUtama(){
        //frame
        this.setTitle("Registrasi Yudisium");
        this.setSize(500,300);
        int frameWidth=((dim.width-this.getSize().width)/2);
        int frameHeigth=((dim.height-this.getSize().height)/2);
        this.setLocation(frameWidth, frameHeigth);
        this.setResizable(false);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //set background
        panel=new JPanel();
        panel.setLayout(new FlowLayout());
        labelBackground=new JLabel(new ImageIcon("image/logousd2.png"));
        //create menu
        JMenuBar menubar=new JMenuBar();
        JMenu menuFile=new JMenu("File");
        JMenuItem menuFileItemNewRegistration=new JMenuItem("New Registration");
        JMenuItem menuFileItemExit=new JMenuItem("Exit");
        JMenuItem menuEditItemOpenData=new JMenuItem("Open Data");
        JMenuItem menuEditItemClearData=new JMenuItem("Clear Data");
        //add action listener
        menuFileItemNewRegistration.addActionListener(this);
        menuFileItemExit.addActionListener(this);
        menuEditItemOpenData.addActionListener(this);
        menuEditItemClearData.addActionListener(this);
        //add to frame
        panel.add(labelBackground);
        this.add(panel);
        menubar.add(menuFile);
        menuFile.add(menuFileItemNewRegistration);
        menuFile.addSeparator();
        menuFile.add(menuEditItemOpenData);
        menuFile.add(menuEditItemClearData);
        menuFile.addSeparator();
        menuFile.add(menuFileItemExit);
        this.setJMenuBar(menubar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectMenu=e.getActionCommand();
        if (selectMenu.equals("New Registration")) {
            panel.removeAll();
            FrameRegistration addpage=new FrameRegistration();
            panel.add(addpage.panelMain);
            panel.revalidate();
            }
        else if (selectMenu.equals("Exit"))System.exit(0);
        else if (selectMenu.equals("Open Data")){
            FrameOpenData open;
            try {
                open = new FrameOpenData();
                open.setVisible(true);
                open.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            } catch (IOException ex) {
                Logger.getLogger(FrameUtama.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (selectMenu.equals("Clear Data")){
            try {
                DataMahasiswa mahasiswa=new DataMahasiswa();
                mahasiswa.clearData();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FrameUtama.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
