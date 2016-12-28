package data;
import data.DataMahasiswa;
import userInterface.FrameSaveConfirmation;
import javax.swing.*;
/**
 * @author BUDHI DARMA P
 */
public class InputErrorCheck extends JFrame{
    DataMahasiswa mahasiswa=new DataMahasiswa();
    private String nim, nama, nomorHp, periodeBulan, periodeTahun, tanggal, kelengkapan, totalPeriode;
    public void cekInput(String dNim, String dNama, String dNomorHp, Object dBulan, Object dTahun, String dTanggal, String dKelengkapan, String totalPeriode) {
        try{
            setNim(dNim);
            setNama(dNama);
            setNomorHp(dNomorHp);
            setPeriodeBulan(String.valueOf(dBulan));
            setPeriodeTahun(String.valueOf(dTahun));
            setTanggal(dTanggal);
            setKelengkapan(dKelengkapan);
            setTotalPeriode(totalPeriode);
            String simpanData=getNim()+";"+getNama()+";"+getNomorHp()+";"+mahasiswa.periodeMonthToNumber(String.valueOf(dBulan))+" "+dTahun+";"+getTanggal()+";"+
                    getKelengkapan()+";"+getTotalPeriode();
            FrameSaveConfirmation saveFrame = new FrameSaveConfirmation(simpanData);
            saveFrame.setVisible(true);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(),"Kesalahan Input",JOptionPane.ERROR_MESSAGE);
        }
    }
    public String getNim() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
    public String getNomorHp() {
        return nomorHp;
    }
    public String getPeriodeBulan() {
        return periodeBulan;
    }
    public String getPeriodeTahun() {
        return periodeTahun;
    }
    public String getTanggal() {
        return tanggal;
    }
    public String getKelengkapan() {
        return kelengkapan;
    }
    public String getTotalPeriode() {
        return totalPeriode;
    }
    public void setNim(String nim) throws Exception {
        if (nim.matches("\\d{9}")) this.nim = nim;
        else throw new Exception("NIM harus angka dan berjumlah 9.");
    }
    public void setNama(String nama) throws Exception {
        if (nama.matches("\\D*")) this.nama = nama;
        else throw new Exception("Nama hanya boleh menggunakan huruf.");
    }
    public void setNomorHp(String nomorHp) throws Exception {
        if (nomorHp.matches("0\\d{10}")||nomorHp.matches("0\\d{11}")) this.nomorHp = nomorHp;
        else throw new Exception("Nomor HP berisi 11-12 angka dengan diawali 0.");
    }
    public void setPeriodeBulan(String periodeBulan) throws Exception {
        if (!periodeBulan.matches("Pilih")) this.periodeBulan = periodeBulan;
        else throw new Exception("Belum memilih bulan periode.");
    }
    public void setPeriodeTahun(String periodeTahun) throws Exception {
        if (!periodeTahun.matches("Pilih")) this.periodeBulan = periodeTahun;
        else throw new Exception("Belum memilih tahun periode.");
    }
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    public void setKelengkapan(String kelengkapan) throws Exception {
        if (kelengkapan.matches("000000")) throw new Exception("Kelengkapan belum dipilih.");
        else this.kelengkapan = kelengkapan; 
    }  
    public void setTotalPeriode(String totalPeriode) {
        this.totalPeriode = totalPeriode;
    }
}
