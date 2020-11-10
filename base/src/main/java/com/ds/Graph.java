package com.ds;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    static class Node{
        int value,weight;
        Node(int value,int weight)
        {
            this.value=value;
            this.weight=weight;
        }

    }
    List<List<Node>>  lst = new ArrayList<>();

    public Graph(List<Edge> edges) {

        for( int i =0; i<edges.size(); i++ ){

            lst.add(i,new ArrayList<>());

        }

        for(Edge e :edges){

            lst.get(e.src).add(new Node(e.dest, e.weight));

        }

    }
}
class Edge{
    int src, dest,weight;
    Edge(int src,int dest,int weight)
    {

        this.src=src;
        this.dest=dest;
        this.weight=weight;
    }
}
