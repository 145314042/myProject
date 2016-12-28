package pertemuan09;

import java.util.*;

/**
 *
 * @author Lycorice
 */
public class Graph {
    private final int maxVertex = 20;
    private final int infinity = 1000000;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int countVertex;
    private Stack<Vertex> stack;
    private List<Edge> edgeList;

    public Graph() {
        vertexList = new Vertex[maxVertex];
        adjacencyMatrix = new int[maxVertex][maxVertex];
        countVertex = 0;
        for (int i = 0; i < maxVertex; i++) {
            for (int j = 0; j < maxVertex; j++) {
                adjacencyMatrix[i][j] = infinity;
            }
        }
    }
    
    public void addVertex(String vertex){
        vertexList[countVertex] = new Vertex(vertex);
        System.out.println(countVertex);
        countVertex++;
    }
    public int getVertex(String vertex){
        for (int i = 0; i < countVertex; i++) {
            if (vertex.compareTo(vertexList[i].getLabel())==0)return i;
        }
        return -1;
    }
    public void displayVertex(int data){
        System.out.println(vertexList[data].getLabel());
        
    }
    public void addEdge(String edgeFirst,String edgeSecond,int weight){
        adjacencyMatrix[getVertex(edgeFirst)][getVertex(edgeSecond)] = weight;
        adjacencyMatrix[getVertex(edgeSecond)][getVertex(edgeFirst)] = weight;
    }
    public void listPath() {
        for (int i = 0; i < adjacencyMatrix[0].length; i++) {
            for (int j = 0; j < adjacencyMatrix.length; j++) {
                if (adjacencyMatrix[i][j] == 1) 
                    System.out.println(vertexList[i].getLabel()+" to "+vertexList[j].getLabel());
            }
        }
    }
    
    public boolean allVisited() {
        boolean state = true;
        for (int i = 0; i < countVertex; i++) {
            if (vertexList[i].getisVisited()==false) {
//                System.out.println("false"+i);
                state = false;
            }
        }
        return state;
    }
    
    public int getAdjacensyMatrix(int data){
        for (int i = 0; i < countVertex; i++) {
            if (adjacencyMatrix[data][i]==1&&vertexList[i].getisVisited()==false) {
                vertexList[i].setisVisited(true);
                System.out.print(vertexList[i].getLabel());
                return i;
            }
        }
        return -1;
    }
    
    public void deepFirstSearch(){
        stack = new Stack();
        stack.push(vertexList[0]);
        vertexList[0].setisVisited(true);
        System.out.print(vertexList[0].getLabel());
        while (!allVisited()){
            Vertex HelpStack = stack.peek();
            int baru = getAdjacensyMatrix(getVertex(HelpStack.getLabel()));
            if (baru!=-1) {
                stack.push(vertexList[baru]);
            }
            else if (baru==-1)stack.pop();
        }
        for (int i = 0; i < countVertex; i++) {
            vertexList[i].setisVisited(false);
        }
        System.out.println("");
    }
    
    public void mimnimumSpanningTreeKruskal(){
        int SpanningTree[][] = new int[maxVertex][maxVertex];
        for (int i = 0; i < maxVertex; i++) {
            for (int j = 0; j < maxVertex; j++) {
                SpanningTree[i][j]=infinity;
            }
        }
        for (int i = 0; i < maxVertex; i++) {
            for (int j = i+1; j < maxVertex; j++) {
                if (adjacencyMatrix[i][j] != infinity) {
                    Edge edge = new Edge(i, j, adjacencyMatrix[i][j]);
                    edgeList.add(edge);
                }
            }
        }
        Collections.sort(edgeList, new EdgeComparator());
        CheckCycle checkCycle = new CheckCycle();
        for (Edge edge : edgeList) {
            SpanningTree[edge.getSourceVertex()][edge.getDestinationVertex()] = edge.getDistanceVertex();
            SpanningTree[edge.getDestinationVertex()][edge.getSourceVertex()] = edge.getDistanceVertex();
            if (checkCycle.checkCycle(SpanningTree, edge.getSourceVertex(), maxVertex)) {
                SpanningTree[edge.getSourceVertex()][edge.getDestinationVertex()] = infinity;
                SpanningTree[edge.getDestinationVertex()][edge.getSourceVertex()] = infinity;
                edge.setDistanceVertex(-1);
                continue;
            }
            vertexList[edge.getSourceVertex()].setisVisited(true);
            vertexList[edge.getDestinationVertex()].setisVisited(true);
        }
    }
}
