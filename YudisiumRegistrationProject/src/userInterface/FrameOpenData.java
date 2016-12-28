package userInterface;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import data.*;
import java.util.logging.*;
/**
 * @author Lycorice
 */
public class FrameOpenData extends JDialog implements ActionListener{
    
    private String isi="";
    private int count;
    private DataMahasiswa outputMahasiswa;
    Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
    JPanel panelMain;
    JLabel labelJudul;
    JTextArea textAreaIsi;
    JScrollPane scrollIsi;
    JMenuBar menuBar=new JMenuBar();
    JMenu menuView=new JMenu("View");
    JMenuItem menuItemViewDefault=new JMenuItem("Sort default");
    JMenuItem menuItemViewByNim=new JMenuItem("Sort by NIM");
    JMenuItem menuItemViewByPeriode=new JMenuItem("Sort by periode");
    JMenuItem menuItemViewByTglDaftar=new JMenuItem("Sort by tanggal daftar");
    JMenuItem menuItemViewSearch=new JMenuItem("Search");
    //search
    private int inputIndex;
    private String inputField,inputBulan,inputTahun;
    JPanel panelLabel,panelField,panelFieldWord;
    JComboBox comboBoxTahun, comboBoxBulan;
    String[] tahun = {"Bulan","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005"};
    String[] bulan = {"Tahun","Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
    JLabel labelFilter,labelWord;
    JComboBox comboBoxFilter;
    JTextField textFieldWord;
    JButton buttonSearch;
    public FrameOpenData() throws IOException{
        this.setTitle("Data Mahasiswa");
        this.setSize(300, 225);
        int frameWidth=((dim.width-this.getSize().width)/2);
        int frameHeigth=((dim.height-this.getSize().height)/2);
        this.setLocation(frameWidth, frameHeigth);
        this.setResizable(false);
        this.setLayout(new FlowLayout());
        //set panel
        panelMain=new JPanel();
        panelMain.setLayout(new BorderLayout());
        //set judul
        labelJudul=new JLabel("Data Mahasiswa : ");
        //set isi
        textAreaIsi=new JTextArea(8,24);
        textAreaIsi.setEditable(false);
        outputMahasiswa=new DataMahasiswa();
        count=outputMahasiswa.readCount();
        for (int i = 0; i < count; i++) {
            outputMahasiswa.goToMahasiswa();
            isi+=outputMahasiswa.toString(i);
            textAreaIsi.setText(isi);
        }
        scrollIsi=new JScrollPane(textAreaIsi,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //add panel
        panelMain.add(labelJudul,BorderLayout.NORTH);
        panelMain.add(scrollIsi,BorderLayout.CENTER);
        this.add(panelMain);
        //add action
        menuItemViewDefault.addActionListener(this);
        menuItemViewByNim.addActionListener(this);
        menuItemViewByPeriode.addActionListener(this);
        menuItemViewSearch.addActionListener(this);
        //add menubar
        menuView.add(menuItemViewDefault);
        menuView.add(menuItemViewByNim);
        menuView.add(menuItemViewByPeriode);
        menuView.addSeparator();
        menuView.add(menuItemViewSearch);
        menuBar.add(menuView);
        this.add(menuBar);
        this.setJMenuBar(menuBar);
        //search
        //label
        labelFilter=new JLabel("Filter            : ");
        labelWord=new JLabel("Kata kunci  : ");
        //combobox
        comboBoxBulan=new JComboBox();
        for (int i = 0; i < bulan.length; i++) {
            comboBoxBulan.addItem(bulan[i]);
        }
        comboBoxTahun = new JComboBox();
        for (int i = 0; i < tahun.length; i++) {
            comboBoxTahun.addItem(tahun[i]);
        }
        comboBoxFilter=new JComboBox();
        comboBoxFilter.addItem("Pilih");
        comboBoxFilter.addItem("NIM");
        comboBoxFilter.addItem("Nama");
        comboBoxFilter.addItem("No HP");
        comboBoxFilter.addItem("Periode");
        comboBoxFilter.addItem("Tanggal");
        comboBoxFilter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            panelFieldWord.removeAll();
                if (comboBoxFilter.getSelectedIndex()==4) {
                    panelFieldWord.setLayout(new FlowLayout());
                    panelFieldWord.add(comboBoxBulan);
                    panelFieldWord.add(comboBoxTahun);
                }
                else if (comboBoxFilter.getSelectedIndex()!=4) {
                    panelFieldWord.setLayout(new GridLayout(1, 1));
                    panelFieldWord.add(textFieldWord);
                }
                panelField.add(panelFieldWord);
                revalidate();
            }
        });
        //textfieald
        textFieldWord=new JTextField();
        textFieldWord.setSize(50, 10);
        //button
        buttonSearch=new JButton("Cari");
        buttonSearch.addActionListener(this);
        //panel
        panelLabel=new JPanel(new GridLayout(2, 1));
        panelField=new JPanel(new GridLayout(2, 1));
        panelFieldWord=new JPanel();
        //add content
        panelLabel.add(labelFilter);
        panelLabel.add(labelWord);
        panelField.add(comboBoxFilter);
        panelFieldWord.add(comboBoxBulan);
        panelFieldWord.add(comboBoxTahun);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        outputMahasiswa=new DataMahasiswa();
        panelMain.removeAll();
        if ("Sort default".equals(e.getActionCommand())) {
            try {
                panelMain.removeAll();
                isi="";
                count=outputMahasiswa.readCount();
                for (int i = 0; i < count; i++) {
                    outputMahasiswa.goToMahasiswa();
                    isi+=outputMahasiswa.toString(i);
                    textAreaIsi.setText(isi);
                    panelMain.add(labelJudul,BorderLayout.NORTH);
                    panelMain.add(scrollIsi,BorderLayout.CENTER);
                }
                this.revalidate();
            } catch (IOException ex) {
                Logger.getLogger(FrameOpenData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if ("Sort by NIM".equals(e.getActionCommand())) {
            try {
                panelMain.removeAll();
                isi="";
                count=outputMahasiswa.readCount();
                for (int i = 0; i < count; i++) {
                    outputMahasiswa.goToTextSortByNim();
                    isi+=outputMahasiswa.toStringNim(i);
                    textAreaIsi.setText(isi);
                    panelMain.add(labelJudul,BorderLayout.NORTH);
                    panelMain.add(scrollIsi,BorderLayout.CENTER);
                }
                this.revalidate();
            } catch (IOException ex) {
                Logger.getLogger(FrameOpenData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if ("Sort by periode".equals(e.getActionCommand())) {
            try {
                panelMain.removeAll();
                isi="";
                count=outputMahasiswa.readCount();
                for (int i = 0; i < count; i++) {
                    outputMahasiswa.goToTextSortByPeriode();
                    isi+=outputMahasiswa.toStringPeriode(i);
                    textAreaIsi.setText(isi);
                    panelMain.add(labelJudul,BorderLayout.NORTH);
                    panelMain.add(scrollIsi,BorderLayout.CENTER);
                }
                this.revalidate();
            } catch (IOException ex) {
                Logger.getLogger(FrameOpenData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if ("Search".equals(e.getActionCommand())){
            panelMain.add(panelLabel,BorderLayout.WEST);
            panelMain.add(panelField,BorderLayout.CENTER);
            panelMain.add(buttonSearch,BorderLayout.SOUTH);
            this.revalidate();
        }
        else if ("Cari".equals(e.getActionCommand())){
            try {
                panelMain.removeAll();
                setInputIndex(comboBoxFilter.getSelectedIndex());
                if (comboBoxFilter.getSelectedIndex()==4) {
                    DataMahasiswa data=new DataMahasiswa();
                    setInputBulan(data.periodeMonthToNumber(String.valueOf(comboBoxBulan.getSelectedItem())));
                    setInputTahun(String.valueOf(comboBoxTahun.getSelectedItem()));
                    setInputField(getInputBulan()+" "+getInputTahun());
                }
                else if (comboBoxFilter.getSelectedIndex()!=4) {
                    setInputField(textFieldWord.getText());
                }
                isi="";
                count=outputMahasiswa.readCount();
                for (int i = 0; i < count; i++) {
                    outputMahasiswa.goToMahasiswa();
                    isi+=outputMahasiswa.SearchData(i,getInputIndex(),getInputField());
                    textAreaIsi.setText(isi);
                    panelMain.add(labelJudul,BorderLayout.NORTH);
                    panelMain.add(scrollIsi,BorderLayout.CENTER);
                }
                this.revalidate();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }
    public int getInputIndex() {
        return inputIndex;
    }
    public String getInputField() {
        return inputField;
    }
    public String getInputBulan() {
        return inputBulan;
    }
    public String getInputTahun() {
        return inputTahun;
    }
    public void setInputIndex(int inputIndex) throws Exception {
        if (comboBoxFilter.getSelectedIndex()==0) throw new Exception("Pilihan salah.");
        else this.inputIndex = inputIndex;
    }
    public void setInputField(String inputField) throws Exception {
        if (comboBoxFilter.getSelectedIndex()==1) {
            if (inputField.matches("\\d{9}")) this.inputField = inputField;
            else throw new Exception("NIM harus angka dan berjumlah 9.");
        }
        else if (comboBoxFilter.getSelectedIndex()==2){
            if (inputField.matches("\\D*")) this.inputField = inputField;
            else throw new Exception("Nama hanya boleh menggunakan huruf.");
        }
        else if (comboBoxFilter.getSelectedIndex()==3){
            if (inputField.matches("0\\d{10}")||inputField.matches("0\\d{11}")) this.inputField = inputField;
            else throw new Exception("Nomor HP berisi 11-12 angka dengan diawali 0.");
        }
        else if (comboBoxFilter.getSelectedIndex()==5){
            if (inputField.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}")) this.inputField = inputField;
            else throw new Exception("Format tanggal dd/mm/yyyy");
        }
    }
    public void setInputBulan(String inputBulan) throws Exception {
        if (comboBoxBulan.getSelectedIndex()==0) throw new Exception("Bulan belum dipilih.");
        else this.inputBulan = inputBulan;
    }
    public void setInputTahun(String inputTahun) throws Exception {
        if (comboBoxTahun.getSelectedIndex()==0) throw new Exception("Tahun belum dipilih.");
        else this.inputTahun = inputTahun;
    }
}
