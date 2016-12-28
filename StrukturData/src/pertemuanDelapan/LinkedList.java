package pertemuanDelapan;
/**
 * @author Lycorice
 */
public class LinkedList {
    private ListNode head;
    private int size = 0;
    public LinkedList() {
        head = new ListNode();
        head.setNext(head);
        head.setPrev(head);
    }
    public void addBefore(int data, ListNode node) {
        ListNode baru = new ListNode(data);
        baru.setNext(node);
        baru.setPrev(node.getPrev());
        node.setPrev(baru);
        baru.getPrev().setNext(baru);
        size++;
    }
    public void addFirst(int data) {
        addBefore(data, head.getNext());
    }
    public void addLast(int data) {
        addBefore(data, head);
    }
    public int remove(ListNode node) {
        ListNode kiri = node.getPrev();
        ListNode kanan = node.getNext();
        kiri.setNext(kanan);
        kanan.setPrev(kiri);
        size--;
        return node.getElement();
    }
    public int removeFirst() {
        return remove(head.getNext());
    }
    public int removeLast() {
        return remove(head.getPrev());
    }
    public String toString() {
        String result = "";
        ListNode node = head.getNext();
        while (node != head) {
            result = result + " " + node.getElement();
            node = node.getNext();
        }
        return result;
    }
}

//    public int getSize() {
//        return size;
//    }
//    public boolean isEmpty() {
//        if (size > 0) {
//            return false;
//        } else {
//            return true;
//        }
//    }
//    public LinkedList() {
//        head = new ListNode();
//        head.setNext(head);
//        head.setPrev(head);
//        size = 0;
//    }