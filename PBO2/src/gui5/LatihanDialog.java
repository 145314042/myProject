/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui5;

/**
 *
 * @author Lycorice
 */
public class LatihanDialog extends javax.swing.JDialog {
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextArea textArea;
    private javax.swing.JButton okButton;
    private String message;
    public LatihanDialog(java.awt.Frame parent, boolean modal, String message) {
        super(parent, modal);
        initComponents(); // jelaskan maksudnya
    }
    private void initComponents() {
        this.setSize(250, 250);
        mainPanel = new javax.swing.JPanel();
        mainPanel.setLayout(new java.awt.FlowLayout());
        textArea = new javax.swing.JTextArea();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        textArea.setColumns(20);
        textArea.setRows(10);
        textArea.setEditable(false); // jelaskan artinya
        String text = new String(message);
//        String text = new String("<html > Ini latihan dialog<br > Selamat mencoba<br> Semoga Sukses</html >");
        textArea.setText(text);
        mainPanel.add(textArea);
        okButton = new javax.swing.JButton("OK");
        mainPanel.add(okButton);
        this.getContentPane().add(mainPanel); //jelaskan artinya
    }
}
