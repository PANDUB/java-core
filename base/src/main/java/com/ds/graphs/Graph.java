package com.ds.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {

    List<List<Integer>>  list = new LinkedList<>();

    Boolean  isVerified[] = new Boolean[5];
    public Graph(int data)
    {

    }
    public void addEdge(int a ,int b)

    {
        List l = new ArrayList();
        l.add(a);
        list.add(l);
    }
}
