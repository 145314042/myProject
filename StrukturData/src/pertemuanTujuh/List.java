package pertemuanTujuh;
/**
 * @author Lycorice
 */
public class List {
    private ListNode pertama = null;
    private ListNode terakhir = null;
    private String nama;
    public List() {}
    public List(String nama) {
        this.nama = nama;
    }
    public void addPertama(int data){
        if (isEmpty()) {
            ListNode baru = new ListNode(data);
            pertama = baru;
            terakhir = baru;
        }
        else {
            ListNode baru = new ListNode(data);
            baru.setKanan(this.getPertama());
            pertama = baru;
        }
    }
    public void addTerakhir(int data){
        ListNode baru = new ListNode(data);
        getTerakhir().setKanan(baru);
        terakhir = baru;
    }
    public ListNode removePertama(){
        if (!isEmpty()) {
            ListNode bantu = pertama;
            pertama=pertama.getKanan();
            return bantu;
        }
        else return null;
    }
    public ListNode removeTerakhir(){
        if (!isEmpty()) {
            ListNode bantu = pertama;
            while (bantu.getKanan()!=terakhir){
                bantu=bantu.getKanan();
            }
            terakhir = bantu;
            bantu = bantu.getKanan();
            terakhir.setKanan(null);
            return bantu;
        }
        else return null;
    }
    public boolean isEmpty(){
        if (this.getPertama()==null) return true;
        else return false;
    }
    public ListNode getPertama() {
        return pertama;
    }
    public ListNode getTerakhir() {
        return terakhir;
    }
}
