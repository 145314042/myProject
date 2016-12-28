package data;
import java.io.*;
/**
 * @author Lycorice
 */
public class DataMahasiswa {
    Mahasiswa[] mahasiswa;
    MahasiswaByNim[] mahasiswaNim;
    MahasiswaByPeriode[] mahasiswaPeriode;
    private String textBuffer,kelengkapan,kelengkapanIndex;
    private String[] textSplit;
    public void goToFile(String text) throws FileNotFoundException, IOException{
        File outFile = new File("data/dataMahasiswa.data");
        FileOutputStream outFileStream = new FileOutputStream(outFile,true);
        PrintWriter outStream = new PrintWriter(outFileStream);
        outStream.println(text);
        outStream.close();
        //count
        int count = 0,countStringToInt;
        File outFileCount = new File("data/dataJumlah.data");
        if (outFileCount.exists()) {
            FileReader fileReader = new FileReader(outFileCount);
            BufferedReader bufReader = new BufferedReader(fileReader);
            String countString=bufReader.readLine();
            countStringToInt=Integer.parseInt(countString);
            count=count+countStringToInt+1;
            FileOutputStream outFileStreamCount = new FileOutputStream(outFileCount);
            PrintWriter outStreamCount = new PrintWriter(outFileStreamCount);
            outStreamCount.println(String.valueOf(count));
            outStreamCount.close();
        }
        else if (!outFileCount.exists()){
            FileOutputStream outFileStreamCount = new FileOutputStream(outFileCount);
            PrintWriter outStreamCount = new PrintWriter(outFileStreamCount);
            outStreamCount.println("1");
            outStreamCount.close();
        }
    }
    public int readCount() throws FileNotFoundException, IOException{
        File inFileCount = new File("data/dataJumlah.data");
        FileReader fileReaderCount = new FileReader(inFileCount);
        BufferedReader bufReaderCount = new BufferedReader(fileReaderCount);
        return Integer.parseInt(bufReaderCount.readLine());
    }
    public void goToMahasiswa() throws FileNotFoundException, IOException{
        //baca data DataMahasiswa.data
        File inFile = new File("data/dataMahasiswa.data");
        FileReader fileReader = new FileReader(inFile);
        BufferedReader bufReader = new BufferedReader(fileReader);
        //baca data dataJumlah.data
        int size = readCount();
        mahasiswa=new Mahasiswa[size];
        for (int i = 0; i < size; i++) {
            textSplit=bufReader.readLine().split(";");
            mahasiswa[i]=new Mahasiswa(textSplit[0], textSplit[1], textSplit[2], textSplit[3], textSplit[4], textSplit[5], textSplit[6]);
        }
         for (int iterasi = 1; iterasi <= mahasiswa.length-1; iterasi++) {
            for (int element = 0; element < mahasiswa.length-iterasi; element++) {
                if (mahasiswa[element].compareTo(mahasiswa[element+1])>0) {
                    Mahasiswa temp = mahasiswa[element];
                    mahasiswa[element]=mahasiswa[element+1];
                    mahasiswa[element+1]= temp;
                }
            }
        }
    }
    public void goToTextSortByNim() throws FileNotFoundException, IOException{
        //baca data DataMahasiswa.data
        File inFile = new File("data/dataMahasiswa.data");
        FileReader fileReader = new FileReader(inFile);
        BufferedReader bufReader = new BufferedReader(fileReader);
        //baca data dataJumlah.data
        int size = readCount();
        mahasiswaNim=new MahasiswaByNim[size];
        for (int i = 0; i < size; i++) {
            textSplit=bufReader.readLine().split(";");
            mahasiswaNim[i]=new MahasiswaByNim(textSplit[0], textSplit[1], textSplit[2], textSplit[3], textSplit[4], textSplit[5], textSplit[6]);
        }
        for (int iterasi = 1; iterasi <= mahasiswaNim.length-1; iterasi++) {
            for (int element = 0; element < mahasiswaNim.length-iterasi; element++) {
                if (mahasiswaNim[element].compareTo(mahasiswaNim[element+1])>0) {
                    MahasiswaByNim temp = mahasiswaNim[element];
                    mahasiswaNim[element]=mahasiswaNim[element+1];
                    mahasiswaNim[element+1]= temp;
                }
            }
        }
    }
    public void goToTextSortByPeriode() throws FileNotFoundException, IOException{
        //baca data DataMahasiswa.data
        File inFile = new File("data/dataMahasiswa.data");
        FileReader fileReader = new FileReader(inFile);
        BufferedReader bufReader = new BufferedReader(fileReader);
        //baca data dataJumlah.data
        int size = readCount();
        mahasiswaPeriode=new MahasiswaByPeriode[size];
        for (int i = 0; i < size; i++) {
            textSplit=bufReader.readLine().split(";");
            mahasiswaPeriode[i]=new MahasiswaByPeriode(textSplit[0], textSplit[1], textSplit[2], textSplit[3], textSplit[4], textSplit[5], textSplit[6]);
        }
        for (int iterasi = 1; iterasi <= mahasiswaPeriode.length-1; iterasi++) {
            for (int element = 0; element < mahasiswaPeriode.length-iterasi; element++) {
                if (mahasiswaPeriode[element].compareTo(mahasiswaPeriode[element+1])>0) {
                    MahasiswaByPeriode temp = mahasiswaPeriode[element];
                    mahasiswaPeriode[element]=mahasiswaPeriode[element+1];
                    mahasiswaPeriode[element+1]=temp;
                }
            }
        }
    }
    public void clearData() throws FileNotFoundException{
        File outFile = new File("data/dataMahasiswa.data");
        FileOutputStream outFileStream = new FileOutputStream(outFile);
        PrintWriter outStream = new PrintWriter(outFileStream);
//        outStream.println("");
        outStream.close();
        File outFileCount = new File("data/dataJumlah.data");
        FileOutputStream outFileStreamCount = new FileOutputStream(outFileCount);
        PrintWriter outStreamCount = new PrintWriter(outFileStreamCount);
        outStreamCount.println("0");
        outStreamCount.close();
    }
    public String periodeMonthToNumber(String month){
        String bulan="";
        switch(month){
            case "Januari":bulan="01";break;
            case "Februari":bulan="02";break;
            case "Maret":bulan="03";break;
            case "April":bulan="04";break;
            case "Mei":bulan="05";break;
            case "Juni":bulan="06";break;
            case "Juli":bulan="07";break;
            case "Agustus":bulan="08";break;
            case "September":bulan="09";break;
            case "Oktober":bulan="10";break;
            case "November":bulan="11";break;            
            case "Desember":bulan="12";break;
        }
        return bulan;
    }
    public String periodeNumberToMonth(String bulan){
        String month="";
        switch (bulan){
            case "01":month="Januari";break;
            case "02":month="Februari";break;
            case "03":month="Maret";break;
            case "04":month="April";break;
            case "05":month="Mei";break;
            case "06":month="Juni";break;
            case "07":month="Juli";break;
            case "08":month="Agustus";break;
            case "09":month="September";break;
            case "10":month="Oktober";break;
            case "11":month="November";break;            
            case "12":month="Desember";break;
        }
        return month;
    }
    public String toString(int size) throws IOException{
        kelengkapanIndex=mahasiswa[size].getKelengkapan();
        String[] periodeSplit=mahasiswa[size].getPeriode().split("[ ]");
        kelengkapan="";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(0)))) kelengkapan+="- Daftar Nilai\n";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(1)))) kelengkapan+="- Naskah TA\n";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(2)))) kelengkapan+="- Bebas Pinjam LAB\n";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(3)))) kelengkapan+="- Bebas Pinjam Dosen\n";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(4)))) kelengkapan+="- Bukti Laporan KP\n";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(5)))) kelengkapan+="- Surat KKL/KI\n";
        String[] splitTanggal=mahasiswa[size].getTanggal().split("[/]");
        String textKeluaran="Data Pribadi Mahasiswa\nNim : "+mahasiswa[size].getNim()+"\nNama : "+mahasiswa[size].getNama()+
                "\nNomor Hp : "+mahasiswa[size].getNomorHp()+"\nPeriode : "+
                periodeNumberToMonth(periodeSplit[0])+" "+periodeSplit[1]+"\nTanggal daftar : "+
                splitTanggal[2]+"/"+splitTanggal[1]+"/"+splitTanggal[0]+"\nKelengkapan : \n"+kelengkapan+"\n";
        return textKeluaran;
    }
    public String toStringNim(int size) throws IOException{
        kelengkapanIndex=mahasiswaNim[size].getKelengkapan();
        String[] periodeSplit=mahasiswaNim[size].getPeriode().split("[ ]");
        kelengkapan="";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(0)))) kelengkapan+="- Daftar Nilai\n";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(1)))) kelengkapan+="- Naskah TA\n";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(2)))) kelengkapan+="- Bebas Pinjam LAB\n";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(3)))) kelengkapan+="- Bebas Pinjam Dosen\n";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(4)))) kelengkapan+="- Bukti Laporan KP\n";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(5)))) kelengkapan+="- Surat KKL/KI\n";
        String[] splitTanggal=mahasiswaNim[size].getTanggal().split("[/]");
        String textKeluaran="Data Pribadi Mahasiswa\nNim : "+mahasiswaNim[size].getNim()+"\nNama : "+mahasiswaNim[size].getNama()+
                "\nNomor Hp : "+mahasiswaNim[size].getNomorHp()+"\nPeriode : "+
                periodeNumberToMonth(periodeSplit[0])+" "+periodeSplit[1]+"\nTanggal daftar : "+
                splitTanggal[2]+"/"+splitTanggal[1]+"/"+splitTanggal[0]+"\nKelengkapan : \n"+kelengkapan+"\n";
        return textKeluaran;
    }
    public String toStringPeriode(int size) throws IOException{
        kelengkapanIndex=mahasiswaPeriode[size].getKelengkapan();
        String[] periodeSplit=mahasiswaPeriode[size].getPeriode().split("[ ]"); 
        kelengkapan="";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(0)))) kelengkapan+="- Daftar Nilai\n";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(1)))) kelengkapan+="- Naskah TA\n";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(2)))) kelengkapan+="- Bebas Pinjam LAB\n";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(3)))) kelengkapan+="- Bebas Pinjam Dosen\n";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(4)))) kelengkapan+="- Bukti Laporan KP\n";
        if ("1".equals(String.valueOf(kelengkapanIndex.charAt(5)))) kelengkapan+="- Surat KKL/KI\n";
        String[] splitTanggal=mahasiswaPeriode[size].getTanggal().split("[/]");
        String textKeluaran="Data Pribadi Mahasiswa\nNim : "+mahasiswaPeriode[size].getNim()+"\nNama : "+mahasiswaPeriode[size].getNama()+
                "\nNomor Hp : "+mahasiswaPeriode[size].getNomorHp()+"\nPeriode : "+
                periodeNumberToMonth(periodeSplit[0])+" "+periodeSplit[1]+"\nTanggal daftar : "+
                splitTanggal[2]+"/"+splitTanggal[1]+"/"+splitTanggal[0]+"\nKelengkapan : \n"+kelengkapan+"\n";
        return textKeluaran;
    }
    public String SearchData(int size,int index,String searchData) throws IOException{
        String tampil="";
        if (index==1) {
            if (mahasiswa[size].getNim().equals(searchData)) tampil = toString(size);
            else tampil = "";
        }
        else if (index==2) {
            if (mahasiswa[size].getNama().equals(searchData)) tampil = toString(size);
            else tampil = "";
        }
        else if (index==3) {
            if (mahasiswa[size].getNomorHp().equals(searchData)) tampil = toString(size);
            else tampil = "";
        }
        else if (index==4) {
            if (mahasiswa[size].getPeriode().equals(searchData)) tampil = toString(size);
            else tampil = "";
        }
        else if (index==5) {
            if (mahasiswa[size].getTanggal().equals(searchData)) tampil = toString(size);
            else tampil = "";
        }
        return tampil;
    }
}
