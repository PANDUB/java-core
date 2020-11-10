package com.ds;


import java.util.*;

class Vertx {
    String label;
    public Vertx(String l1)
    {
        this.label=l1;
    }


}
public class BasicGraph {

    public Map<Vertx, List<Vertx>>  adjVertical = new HashMap<>();

   public void  addVertx(String l){
      // adjVertical = new

       adjVertical.putIfAbsent(new Vertx("1"), new ArrayList<>());

    }
    public void remove(String l)
    {

        Vertx v = new Vertx(l);

        adjVertical.values().stream().forEach(e -> e.remove(v));
        adjVertical.remove(new Vertx(l));


    }
    public void addEdge(String l1, String l2)
    {
        Vertx v1 = new Vertx(l1);
        Vertx v2 = new Vertx(l2);
        adjVertical.get(v1).add(v2);
        adjVertical.get(v2).add(v1);

    }
    List<Vertx> getAdjVertices(String label) {
        return adjVertical.get(new Vertx(label));
    }
   public  Set<String> depthFirstTraversal(BasicGraph graph, String root) {

        Set<String> visited = new LinkedHashSet<String>();
        java.util.Stack<String> stack = new java.util.Stack<String>();
        stack.push(root);
        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (Vertx v : graph.getAdjVertices(vertex)) {
                    stack.push(v.label);
                }
            }
        }
        return visited;
    }

    public static void main(String[] args) {
        BasicGraph graph = new BasicGraph();
        graph.addVertx("1");
        graph.addVertx("2");
        graph.addVertx("3");
        graph.addVertx("4");


    }


}
