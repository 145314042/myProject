package pertemuan09;

import java.util.Stack;

/**
 *
 * @author Lycorice
 */
public class CheckCycle {
    private Stack<Integer> stack;
    private int adjacencyMatrix[][];
    public CheckCycle() {
        stack = new Stack<Integer>();
    }
    public boolean checkCycle(int adjMatrix[][], int source, int numberOfNodes){
        boolean cyclePresent = false;
        adjacencyMatrix = new int[numberOfNodes+1][numberOfNodes+1];
        for (int i = 0; i < numberOfNodes; i++) {
            for (int j = 0; j < numberOfNodes; j++) {
                adjacencyMatrix[i][j] = adjMatrix[i][j];
            }
        }
        int visited[] = new int[numberOfNodes];
        int element = source;
        int temp = source;
        visited[source] = 1;
        stack.push(source);
        while (!stack.isEmpty()) {            
            element = stack.peek();
            temp = element;
            while (temp < numberOfNodes){
                if (adjacencyMatrix[element][temp]>=1&&adjacencyMatrix[temp][element]!=1000000&&visited[temp]!=1) {
                    if (stack.contains(temp)) {
                        cyclePresent = true;
                        return cyclePresent;
                    }
                }
                if (adjacencyMatrix[element][temp]>=1&&adjacencyMatrix[temp][element]!=1000000&&visited[temp]!=0) {
                    stack.push(temp);
                    visited[temp]=1;
                    adjacencyMatrix[element][temp] = 0;
                    adjacencyMatrix[temp][element] = 0;
                    element = temp;
                    temp = 1;
                    continue;
                }
                temp++;
            }
            stack.pop();
        }
        return cyclePresent;
    }
}
