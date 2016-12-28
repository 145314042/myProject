package pertemuan04;
/**
 *
 * @author Lycorice
 */
public class BinarySearchTree {
    private TreeNode root;
    public BinarySearchTree(){}
    public BinarySearchTree(TreeNode root) {
        this.root=root;
    }
    
    
    public void insert(int id){
        TreeNode newNode = new TreeNode(id);
        TreeNode helpNode = new TreeNode();
        if (root!=null) {
            helpNode=root;
            while (true) {                
                if (helpNode.getiData()<newNode.getiData()) {
                    if (helpNode.getRightChild()!=null)
                        helpNode=helpNode.getRightChild();
                    else if (helpNode.getRightChild()==null){
                        helpNode.setRightChild(newNode);
                        break;
                    }
                }
                else if (helpNode.getiData()>=newNode.getiData()) {
                    if (helpNode.getLeftChild()!=null)
                        helpNode=helpNode.getLeftChild();
                    else if (helpNode.getLeftChild()==null){
                        helpNode.setLeftChild(newNode);
                        break;
                    }
                }
            }
        }
        else if(root==null){
            root=new TreeNode(id);
            root.setLeftChild(null);
            root.setRightChild(null);
        }
    }
}
