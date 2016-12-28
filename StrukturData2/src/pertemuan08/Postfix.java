package pertemuan08;

public class Postfix {

    String ung;
    char operator[] = {'+', '-', '*', '/', '^'};

    public Postfix(String ung_in) {
        ung = ung_in;
    }

    public boolean isOperator(char data) {
        for (int i = 0; i < operator.length; i++) {
            if (data == operator[i]) {
                return true;
            }
        }
        return false;
    }

    public TreeNode buatPohon() {
        DinamicStack nodes = new DinamicStack();
        for (int i = 0; i < ung.length(); i++) {
            char ch = ung.charAt(i);
            if (isOperator(ch)) {
                TreeNode rightNode = nodes.pop();
                TreeNode leftNode = nodes.pop();
                nodes.push(new TreeNode(ch, leftNode, rightNode));
            } else {
                nodes.push(new TreeNode(ch));
            }
        }
        return nodes.pop();
    }
}
