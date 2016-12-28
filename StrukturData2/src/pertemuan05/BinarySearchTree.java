package pertemuan05;

/**
 *
 * @author Lycorice
 */
public class BinarySearchTree {

    private TreeNode root;

    public BinarySearchTree() {
    }

    public BinarySearchTree(TreeNode root) {
        this.root = root;
    }

    public void insert(int id) {
        TreeNode newNode = new TreeNode(id);
        TreeNode helpNode = new TreeNode();
        if (getRoot() != null) {
            helpNode = getRoot();
            while (true) {
                if (helpNode.getiData() < newNode.getiData()) {
                    if (helpNode.getRightChild() != null) {
                        helpNode = helpNode.getRightChild();
                    } else if (helpNode.getRightChild() == null) {
                        helpNode.setRightChild(newNode);
                        break;
                    }
                } else if (helpNode.getiData() >= newNode.getiData()) {
                    if (helpNode.getLeftChild() != null) {
                        helpNode = helpNode.getLeftChild();
                    } else if (helpNode.getLeftChild() == null) {
                        helpNode.setLeftChild(newNode);
                        break;
                    }
                }
            }
        } else if (getRoot() == null) {
            setRoot(new TreeNode(id));
            getRoot().setLeftChild(null);
            getRoot().setRightChild(null);
        }
    }

//    public boolean find(int data){
//        TreeNode helpNode = new TreeNode();
//        helpNode=getRoot();
//        while(helpNode!=null){
//            if(data==helpNode.getiData())return true;
//            else if(data>helpNode.getiData())helpNode=helpNode.getRightChild();
//            else if(data<=helpNode.getiData())helpNode=helpNode.getLeftChild();
//        }
//        return false;
//    }
    public void find(int data){
        TreeNode helpNode = new TreeNode();
        helpNode=getRoot();
        while (helpNode!=null&&helpNode.getiData()!=data){
            if (data<=helpNode.getiData())helpNode=helpNode.getLeftChild();
            else if (data>helpNode.getiData())helpNode=helpNode.getRightChild();
        }
        if (helpNode==null) System.out.println("Data has not found.");
        else if (helpNode.getiData()==data)System.out.println("Data has found.");
    }
    public void preOrder(TreeNode localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getiData() + " ");
            preOrder(localRoot.getLeftChild());
            preOrder(localRoot.getRightChild());
        }
    }
    public void inOrder(TreeNode localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.getLeftChild());
            System.out.print(localRoot.getiData() + " ");
            inOrder(localRoot.getRightChild());
        }
    }
    public void postOrder(TreeNode localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.getLeftChild());
            postOrder(localRoot.getRightChild());
            System.out.print(localRoot.getiData() + " ");
        }
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}
