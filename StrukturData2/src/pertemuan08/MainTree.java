package pertemuan08;

import javax.swing.JOptionPane;

public class MainTree {

    public static void main(String[] args) {
//        String input = "ABCD*-+E/";
        String input = JOptionPane.showInputDialog("Masukkan input");
        
        System.out.println("Input : "+input);
        
        Postfix postfix = new Postfix(input);
        
        BinarySearchTree tree = new BinarySearchTree();
        tree.setRoot(postfix.buatPohon());
        
        System.out.println("\n\nInfix");
        tree.inOrder(tree.getRoot());
        
        System.out.println("\n\nPrefix");
        tree.preOrder(tree.getRoot());
        
        System.out.println("\n\nPostfix");
        tree.postOrder(tree.getRoot());
        
        System.out.println();
    }

}
