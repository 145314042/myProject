/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lycorice
 */
public class TambahData extends JDialog {
    static DataHandler dataHandler;
    static Connection connect;
    static Statement state;
    JButton buttonSave,buttonOpen;
    JTextField textFieldId,textFieldFirstName,textFieldLastName,textFieldManagerId;
    JLabel labelId,labelFirstName,labelLastName,labelManagerId;
    public TambahData() throws SQLException{
        this.setTitle("Tambah data");
        this.setBounds(10, 10, 500, 500);
        this.setResizable(false);
        this.setLayout(new GridLayout(5, 2));
        //set label
        labelId =new JLabel("ID");
        labelFirstName =new JLabel("First Name");
        labelLastName =new JLabel("Last Name");
        labelManagerId =new JLabel("Manager ID");
        //set field
        textFieldId = new JTextField();
        textFieldFirstName = new JTextField();
        textFieldLastName = new JTextField();
        textFieldManagerId = new JTextField();
        //set button
        buttonSave=new JButton("Save");
        buttonOpen=new JButton("Open");
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    insertDepartment(Integer.parseInt(textFieldId.getText()), 
                            textFieldFirstName.getText(), 
                            textFieldLastName.getText(), 
                            Integer.parseInt(textFieldManagerId.getText()));
                } catch (SQLException ex) {
                    Logger.getLogger(TambahData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        buttonOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    listDepartment();
                } catch (SQLException ex) {
                    Logger.getLogger(TambahData.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        //load driver
        dataHandler = new DataHandler();
        dataHandler.getDBConnection();
        //buat koneksi
        connect = dataHandler.conn;
        //buat statement
        state=connect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        this.add(labelId);
        this.add(textFieldId);
        this.add(labelFirstName);
        this.add(textFieldFirstName);
        this.add(labelLastName);
        this.add(textFieldLastName);
        this.add(labelManagerId);
        this.add(textFieldManagerId);
        this.add(buttonSave);
        this.add(buttonOpen);
    }
    public static void listDepartment() throws SQLException{
        String query="select * from employees;";
        //ambil hasil
        ResultSet rs=state.executeQuery(query);
        int i=1;
        while (rs.next()){
            System.out.println(i+++". ");
            System.out.println("ID : "+rs.getString("employee_id"));
            System.out.println("Nama : "+rs.getString("first_name")+" "+rs.getString("last_name"));
            System.out.println("Manager ID: "+rs.getString("manager_id"));
        }
        connect.close();
    }
    public static int insertDepartment(int id,String firstName,String lastName,int managerId) throws SQLException{
        String query="insert into employees values("+id+",'"+firstName+"',"+lastName+","+managerId+")";
        int numResult = state.executeUpdate(query);
        return numResult;
    }
    public static void main(String[] args) throws SQLException {
        TambahData frame=new TambahData();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
}