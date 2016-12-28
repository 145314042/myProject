package pertemuan09;

/**
 *
 * @author Lycorice
 */
public class Vertex {
    private String label;
    private boolean isVisited;

    public Vertex(String label) {
        this.label = label;
        this.isVisited = false;
    }

    public String getLabel() {
        return label;
    }    
    
    public void setisVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }
    
    public boolean getisVisited() {
        return isVisited;
    }
}
