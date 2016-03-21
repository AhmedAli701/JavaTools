package com.cookiescode.libs.datastructures;

/**
 * Created by Ahmed Ali on 20/03/2016.
 */
public class Main {
    public static void main(String[] args){
        Graph<Integer> graph = new AdjacencyList<>();
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addEdge(2, 3);
        graph.addEdge(5, 3);
        graph.addEdge(5, 4);
        graph.addEdge(4, 3);
        System.out.println("Num Vertices : " + graph.getNumVertices());
        System.out.println("Num Edges : " + graph.getNumEdges());
        graph.getVertices().forEach(ver -> {
            // get out neighbors
            System.out.print("Vertex : " + ver.toString() + "\tOut Neighbors :");
            graph.getNeighbors(ver).forEach(nei -> System.out.print(" " + nei.toString()));
            // get in neighbors
            System.out.print("\tIn Neighbors :");
            graph.getInNeighbors(ver).forEach(nei -> System.out.print(" " + nei.toString()));

            System.out.print("\n");
        });

    }
}
