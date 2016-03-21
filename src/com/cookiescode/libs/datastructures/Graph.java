package com.cookiescode.libs.datastructures;

import java.util.List;

/**
 * An abstract class that implements a directed graph.
 * @author Ahmed Ali on 20/03/2016.
 */
public abstract class Graph<T> {

    protected int numVertices;
    protected int numEdges;

    /**
     * Create a new empty Graph
     */
    public Graph(){
        numVertices = 0;
        numEdges = 0;
    }

    /**
     * Add new vertex to the graph.
     * @param vertex : object to be added to the graph.
     */
    public abstract void addVertex(T vertex);

    /**
     * Add new edge to the graph between given vertices.
     * @param start : start point of the edge to be added.
     * @param end : end point of the edge to be added.
     * @return : true if the edge added either return false.
     */
    public abstract boolean addEdge(T start, T end);

    /**
     * return list contains all (out)neighbors of the given vertex.
     * @param vertex : the vertex object to get it's (out)neighbors.
     * @return : list of (out)neighbors.
     */
    public abstract List<T> getNeighbors(T vertex);

    /**
     * return list contains all (in)neighbors of the given vertex.
     * @param vertex : the vertex object to get it's (in)neighbors.
     * @return : list of (in)neighbors.
     */
    public abstract List<T> getInNeighbors(T vertex);

    /**
     * Get all the vertices that are 2 away from the vertex in question.
     * @param vertex : The starting vertex.
     * @return : A list of the vertices that can be reached in exactly two hops (by
     * following two edges) from vertex v.
     */
    public abstract List<T> getDistanceTwo(T vertex);

    public int getNumVertices() {
        return numVertices;
    }

    public int getNumEdges() {
        return numEdges;
    }

    /**
     * get all vertices in the graph.
     * @return : list of vertices.
     */
    public abstract List<T> getVertices();
}
