package pertemuanDelapan;
/**
 *
 * @author Lycorice
 */
public class ListNode {
    private int element;
    private ListNode next;
    private ListNode prev;
    public ListNode() {}
    public ListNode(int data) {
        this.element = data;
    }
    public ListNode(int data, ListNode next, ListNode prev) {
        this.element = data;
        this.next = next;
        this.prev = prev;
    }
    public int getElement() {return element;}
    public void setElement(int data) {this.element = data;}
    public ListNode getNext() {return next;}
    public void setNext(ListNode next) {this.next = next;}
    public ListNode getPrev() {return prev;}
    public void setPrev(ListNode prev) {this.prev = prev;}
}
