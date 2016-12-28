package pertemuan09;

/**
 *
 * @author Lycorice
 */
public class GraphMain {

    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVertex("A"); // 0
        theGraph.addVertex("B"); // 1
        theGraph.addVertex("C"); // 2
        theGraph.addVertex("D"); // 3
        theGraph.addVertex("E"); // 4
        System.out.println("Daftar Vertex : ");
        for (int i = 0; i < 5; i++) {
            theGraph.displayVertex(i);
        }
        theGraph.addEdge("A", "B",1); // 01
        theGraph.addEdge("A", "C",4); // 01
        theGraph.addEdge("B", "C",2); // 12
        theGraph.addEdge("A", "D",3); // 03
        theGraph.addEdge("D", "E",4); // 34
        theGraph.mimnimumSpanningTreeKruskal();
        System.out.println("Daftar path");
        theGraph.listPath();
        System.out.println("Transversal");
        theGraph.deepFirstSearch();
    }
}
