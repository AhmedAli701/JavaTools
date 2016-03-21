package com.cookiescode.libs.datastructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Ahmed Ali on 20/03/2016.
 */
public class AdjacencyList<T> extends Graph {

    private HashMap<T, ArrayList<T>> graphMap;

    public AdjacencyList(){
        graphMap = new HashMap<>();
    }

    @Override
    public void addVertex(Object vertex) {
        graphMap.put((T)vertex, new ArrayList<>());
        numVertices++;
    }

    @Override
    public boolean addEdge(Object start, Object end) {
        if(graphMap.containsKey(start) && graphMap.containsKey(end)){
            graphMap.get(start).add((T)end);
            numEdges++;
            return true;
        }
        else return false;
    }

    @Override
    public List<T> getNeighbors(Object vertex) {
        // return list contains all neighbors of given vertex.
        return new ArrayList<>(graphMap.get(vertex));
    }

    @Override
    public List<T> getInNeighbors(Object vertex) {
        List<T> neighbors = new ArrayList<>();

        graphMap.forEach((k, v) -> v.forEach(nei -> {   // loop through all vertices and their neighbors.
            if(nei == vertex)                           // if one of them is the given vertex,
                neighbors.add(k);                       // add the parent vertex as the given vertex neighbor.
        }));

        return neighbors;
    }

    @Override
    public List<T> getDistanceTwo(Object vertex) {
        List<T> distanceTwo = new ArrayList<>();

        graphMap.forEach((k, v) -> v.forEach(nei -> getNeighbors(nei).forEach(tNei -> {
            if(!distanceTwo.contains(tNei))
                distanceTwo.add(tNei);
        })));

        return distanceTwo;
    }

    @Override
    public List<T> getVertices() {
        return new ArrayList<>(graphMap.keySet());
    }
}
