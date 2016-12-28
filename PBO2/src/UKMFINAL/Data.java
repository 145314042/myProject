/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKMFINAL;

import UKMFINAL.Mahasiswa;
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
public class Data{
    UKM ukm=new UKM();
    //mengeset jumlah count
    public void addCount() throws FileNotFoundException, IOException{
        int count=0,countStringToInt;
        File countFile=new File("countData.data");
        if (countFile.exists()) {
            FileReader countRead=new FileReader(countFile);
            BufferedReader countBufRead = new BufferedReader(countRead);
            countStringToInt=Integer.parseInt(countBufRead.readLine());
            count=count+countStringToInt+1;
            FileOutputStream countFileOut=new FileOutputStream(countFile);
            PrintWriter countWrite=new PrintWriter(countFileOut);
            countWrite.println(String.valueOf(count));
            countWrite.close();
        }
        else if (!countFile.exists()){
            count = 1;
            FileOutputStream countFileOut=new FileOutputStream(countFile);
            PrintWriter countWrite=new PrintWriter(countFileOut);
            countWrite.println(String.valueOf(count));
            countWrite.close();
        }
    }
    //memanggil jumlah count
    public int readCount() throws FileNotFoundException, IOException{
        File countFile=new File("countData.data");
        FileReader countRead=new FileReader(countFile);
        BufferedReader countBufRead = new BufferedReader(countRead);
        int count=Integer.parseInt(countBufRead.readLine());
        return count;
    }
    //mengeset data
    public void addData(String data) throws FileNotFoundException{
        File memberFile=new File("memberFile.data");
        FileOutputStream memberFileOut=new FileOutputStream(memberFile,true);
        PrintWriter memberWrite=new PrintWriter(memberFileOut);
        memberWrite.println(data);
        memberWrite.close();
    }
    //memanggil data
    public String readData(int count) throws FileNotFoundException, IOException{
        File memberFile=new File("memberFile.data");
        FileReader memberRead=new FileReader(memberFile);
        BufferedReader memberBufReadLine=new BufferedReader(memberRead);
        String data="";
        for (int i = 0; i <= count; i++) {
            data=memberBufReadLine.readLine();
        }
        return data;
    }
    //mengeset ukm
    public void addUkm(String ukm,String ketua,String sekretaris) throws FileNotFoundException{
        File ukmFile=new File("ukm.data");
        FileOutputStream ukmFileOut=new FileOutputStream(ukmFile);
        PrintWriter ukmWrite=new PrintWriter(ukmFileOut);
        ukmWrite.println(ukm+";"+ketua+";"+sekretaris);
        ukmWrite.close();
    }
    //memanggil ukm
    public String Ukm() throws FileNotFoundException, IOException{
        File ukmFile=new File("ukm.data");
        FileReader ukmRead=new FileReader(ukmFile);
        BufferedReader ukmBufReadLine=new BufferedReader(ukmRead);
        return ukmBufReadLine.readLine();
    }
}
