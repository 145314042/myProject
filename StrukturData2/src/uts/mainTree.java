package uts;

/**
 *
 * @author Lycorice
 */
public class mainTree {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int n[]= {23,19,21,5,8,45,65,35,42,33};
        for (int i : n){
            bst.insert(i);
        }
        System.out.println("parent dari "+n[7]+" adalah "+bst.parent(n[7]).getiData());
        System.out.println("sibling dari "+n[7]+" adalah "+bst.sibling(n[7]));
//        for (int i : n){
//            System.out.println("parrent dari "+i+" adalah "+bst.parent(i).getiData());
//        }
//        for (int i : n){
//            System.out.println("sibling dari "+i+" adalah "+bst.sibling(i));
//        }
        
    }
}
