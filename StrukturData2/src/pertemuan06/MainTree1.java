package pertemuan06;

/**
 *
 * @author Lycorice
 */
public class MainTree1 {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(30);
        tree.insert(56);
        tree.insert(56);
        tree.insert(43);
        tree.insert(5);
        tree.insert(27);
        tree.insert(15);
        tree.insert(60);
        tree.insert(23);
        tree.insert(90);
        tree.insert(1);

        //cari data
        tree.find(1);
//        if (tree.find(90))System.out.println("data ditemukan");
//        else System.out.println("data tidak ditemukan");

        //menampilkan hasil
        System.out.print("PreOrder :");
        tree.preOrder(tree.getRoot());
        System.out.print("\nInOrder :");
        tree.inOrder(tree.getRoot());
        System.out.print("\nPostOrder :");
        tree.postOrder(tree.getRoot());
        
        tree.delete(1);
        System.out.println("");
        tree.postOrder(tree.getRoot());
    }
}
