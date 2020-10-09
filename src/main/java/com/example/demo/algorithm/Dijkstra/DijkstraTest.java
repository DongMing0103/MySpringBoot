package com.example.demo.algorithm.Dijkstra;

import java.util.ArrayList;

/** @Author dongm @Description: @Date 2020/9/22 */
public class DijkstraTest {

  public static void main(String[] args) {
    ArrayList<Vertex> vertexs = new ArrayList<>();
    Vertex a = new Vertex("A", 0);
    Vertex b = new Vertex("B");
    Vertex c = new Vertex("C");
    Vertex d = new Vertex("D");
    Vertex e = new Vertex("E");
    Vertex f = new Vertex("F");
    vertexs.add(a);
    vertexs.add(b);
    vertexs.add(c);
    vertexs.add(d);
    vertexs.add(e);
    vertexs.add(f);

    // 边界 10.66：5000
    int[][] edges = {
      {Integer.MAX_VALUE, 6, 3, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
      {6, Integer.MAX_VALUE, 2, 5, Integer.MAX_VALUE, Integer.MAX_VALUE},
      {3, 2, Integer.MAX_VALUE, 3, 4, Integer.MAX_VALUE},
      {Integer.MAX_VALUE, 5, 3, Integer.MAX_VALUE, 5, 3},
      {Integer.MAX_VALUE, Integer.MAX_VALUE, 4, 5, Integer.MAX_VALUE, 5},
      {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3, 5, Integer.MAX_VALUE}
    };
    Graph graph = new Graph(vertexs, edges);
    graph.printGraph();
    graph.search();
  }
}
