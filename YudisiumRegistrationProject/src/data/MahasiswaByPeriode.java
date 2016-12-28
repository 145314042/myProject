package data;

/**
 * @author Lycorice
 */
public class MahasiswaByPeriode implements Comparable{
    private String nim;
    private String nama;
    private String nomorHp;
    private String periode;
    private String tanggal;
    private String kelengkapan;
    private String totalPeriode;
    public MahasiswaByPeriode(String nim, String nama, String nomorHp, String periode, String tanggal, String kelengkapan, String totalPeriode) {
        this.nim = nim;
        this.nama = nama;
        this.nomorHp = nomorHp;
        this.periode = periode;
        this.tanggal = tanggal;
        this.kelengkapan = kelengkapan;
        this.totalPeriode = totalPeriode;
    }
    @Override
    public int compareTo(Object o) {
        return this.getTotalPeriode().compareTo(((MahasiswaByPeriode)o).getTotalPeriode());
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNomorHp() {
        return nomorHp;
    }
    public void setNomorHp(String nomorHp) {
        this.nomorHp = nomorHp;
    }
    public String getPeriode() {
        return periode;
    }
    public void setPeriode(String periode) {
        this.periode = periode;
    }
    public String getTanggal() {
        return tanggal;
    }
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    public String getKelengkapan() {
        return kelengkapan;
    }
    public void setKelengkapan(String kelengkapan) {
        this.kelengkapan = kelengkapan;
    }
    public String getTotalPeriode() {
        return totalPeriode;
    }
    public void setTotalPeriode(String totalPeriode) {
        this.totalPeriode = totalPeriode;
    }
}
