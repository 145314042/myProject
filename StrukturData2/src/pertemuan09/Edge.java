package pertemuan09;

/**
 *
 * @author Lycorice
 */
public class Edge {
    private int sourceVertex;
    private int destinationVertex;
    private int distanceVertex;

    public Edge(int sourceVertex, int destinationVertex, int distanceVertex) {
        this.sourceVertex = sourceVertex;
        this.destinationVertex = destinationVertex;
        this.distanceVertex = distanceVertex;
    }

    public int getSourceVertex() {
        return sourceVertex;
    }

    public void setSourceVertex(int sourceVertex) {
        this.sourceVertex = sourceVertex;
    }

    public int getDestinationVertex() {
        return destinationVertex;
    }

    public void setDestinationVertex(int destinationVertex) {
        this.destinationVertex = destinationVertex;
    }

    public int getDistanceVertex() {
        return distanceVertex;
    }

    public void setDistanceVertex(int distanceVertex) {
        this.distanceVertex = distanceVertex;
    }
    
}
