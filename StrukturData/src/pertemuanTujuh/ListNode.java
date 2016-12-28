package pertemuanTujuh;

/**
 *
 * @author Lycorice
 */
public class ListNode {
    private int data;
    private ListNode kanan;
    public ListNode(int data) {
        this.data = data;
    }
    public ListNode(int data, ListNode kanan) {
        this.data = data;
        this.kanan = kanan;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public ListNode getKanan() {
        return kanan;
    }
    public void setKanan(ListNode kanan) {
        this.kanan = kanan;
    }
}
