/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphmatrixexample;

/**
 *
 * @author cmuntean
 */
public class GraphMatrixExample {
   //simple graph representation as 2D array (matrix)
    public int adjMatrix[][];
    public int numVertices;
    
  // Initialize the matrix
  public GraphMatrixExample(int numVertices) {
    this.numVertices = numVertices;
    adjMatrix = new int[numVertices][numVertices];
  }

  // Add edges
  public void addEdge(int i, int j) {
    adjMatrix[i][j] = 1;
    adjMatrix[j][i] = 1;
  }

  // Remove edges
  public void removeEdge(int i, int j) {
    adjMatrix[i][j] = 0;
    adjMatrix[j][i] = 0;
  }

  // Print the matrix
  public void printMatrix() {
    
    for (int i = 0; i < numVertices; i++) {
      System.out.print(i + ": ");
      for (int j = 0; j < numVertices; j++) {
        System.out.print(adjMatrix[i][j] + " ");
      }
      System.out.println();
    }
  }
  
  public void printGraph() {
    
    for (int i = 0; i < numVertices; i++) {
      System.out.println("\n Adjacency list of vertex (node) " + i);
      for (int j = 0; j < numVertices; j++) {
        if (adjMatrix[i][j] ==1)
          System.out.println(j + " ");
      }
    }
  }

  public static void main(String args[]) {
    GraphMatrixExample g = new GraphMatrixExample(5);
    
    g.addEdge(0, 1);
    g.addEdge(0, 4);
    g.addEdge(1, 2);
    g.addEdge(1, 3);
    g.addEdge(1, 4);
    g.addEdge(2, 3);
    g.addEdge(3, 4);
    
    System.out.println( "\n Printing the Matrix of the graph");
    g.printMatrix();
    
    System.out.println( "\n Printing the graph features:");
    g.printGraph();
    
    //remmove the edge between node 4 and node 1
    g.removeEdge(1, 4);
    System.out.println( "\n Printing the Matrix of the graph after the arc between Node 4 and Node 1 was removed.");
    g.printMatrix();
    System.out.println( "\n Printing the graph features:");
    g.printGraph();
  }
    
}
