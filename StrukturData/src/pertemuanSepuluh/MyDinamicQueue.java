package pertemuanSepuluh;
/**
 *
 * @author Lycorice
 */
public class MyDinamicQueue {
    public static void main(String[] args) {
        DinamicQueue queue = new DinamicQueue();
        System.out.println("Data masuk : ");
        queue.enQueue(30);
        queue.enQueue(31);
        System.out.println("Out : "+queue.deQueue());
        queue.enQueue(32);
        queue.enQueue(33);
        queue.enQueue(34);
        queue.enQueue(40);
        System.out.println("Data Keluar : ");
        while (!queue.isEmpty()){
            System.out.println(queue.deQueue());
        }
    }
}
