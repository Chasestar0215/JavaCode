/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapharrayexample;

/**
 *
 * @author cmuntean
 */
import java.util.*;

public class GraphArrayExample {

    /**
     * @param args the command line arguments
     */
    public ArrayList<ArrayList<Integer> > adj;
    public int numVertices;
    
    public GraphArrayExample(int numVertices){
        this.numVertices = numVertices;
        adj = new ArrayList<ArrayList<Integer> >();
         
        for (int i = 0; i < numVertices; i++)
        {
            adj.add(new ArrayList<Integer>());   
        }
        
    }
    // Adds an edge/ connection between two nodes/arcs in the graph representation (data structure)
    void addEdge(int u, int v)
    {
        adj.get(u).add(new Integer(v));
        adj.get(v).add(new Integer(u));
    }
    
    //removes an edge between two nodes
    void removeEdge (int u, int v)
    {
        adj.get(u).remove(new Integer(v));
        adj.get(v).remove(new Integer (u));
    }
 
    // Prints the adjacency list representation of the graph
    void printGraph()
    {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("\n Adjacency list of vertex (node) " + i);
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print("  "+adj.get(i).get(j));
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creating a graph with 5 vertices
        GraphArrayExample g = new GraphArrayExample(5);
         
        // Adding edges one by one
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
         
        g.printGraph();
        
        //remmove the edge between node 4 and node 1
        g.removeEdge(1, 4);
        System.out.println( "\n Printing the adjacency list of the graph after the arc between Node 4 and Node 1 was removed.");
        g.printGraph();
    }
    
}
