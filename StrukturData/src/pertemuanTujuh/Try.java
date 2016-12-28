package pertemuanTujuh;

/**
 *
 * @author Lycorice
 */
public class Try {
    public static void main(String[] args) {
        List myList = new List("Lingked list saya");
        myList.addPertama(2);
        myList.addPertama(1);
        myList.addTerakhir(3);
        myList.addTerakhir(4);
        myList.addTerakhir(5);
//        myList.removePertama();
//        myList.removeTerakhir();
        ListNode node = myList.getPertama();
        while (node!=null) {
            System.out.println(node.getData());
            ListNode next = node.getKanan();
            node = next;
        }
    }
}
