package pertemuanDelapan;
/**
 *
 * @author Lycorice
 */
public class Try {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(45);
        list.addLast(30);
        list.addLast(50);
        list.addFirst(23);
        System.out.println(list.toString());
        System.out.println("Hapus pertama");
        list.removeFirst();
        System.out.println(list.toString());
        System.out.println("Hapus terakhir");
        list.removeLast();
        System.out.println(list.toString());
    }
}
