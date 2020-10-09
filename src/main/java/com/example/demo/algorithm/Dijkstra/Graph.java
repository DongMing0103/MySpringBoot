package com.example.demo.algorithm.Dijkstra;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/** @Author dongm @Description: @Date 2020/9/22 */
public class Graph {

  /** 顶点 */
  private List<Vertex> vertexs;

  /** 边 */
  private int[][] edges;

  /** 没有访问的顶点 */
  private Queue<Vertex> unVisited;

  public Graph(List<Vertex> vertexs, int[][] edges) {
    this.vertexs = vertexs;
    this.edges = edges;
    initUnVisited();
  }

  /** 搜索各顶点最短路径 */
  public void search() {
    while (!unVisited.isEmpty()) {
      Vertex vertex = unVisited.element();
      // 顶点已经计算出最短路径，设置已经访问
      vertex.setMarked(true);
      // 获取所有未访问的邻居
      List<Vertex> neighbors = getNeighbors(vertex);
      // 更新邻居的最短路径
      updatesDistance(vertex, neighbors);
      pop();
    }
    System.out.println("search over");
  }

  /**
   * 更新所有邻居的最短路径
   *
   * @param vertex
   * @param neighbors
   */
  private void updatesDistance(Vertex vertex, List<Vertex> neighbors) {
    for (Vertex neighbor : neighbors) {
      updateDistance(vertex, neighbor);
    }
  }

  /**
   * 更新邻居的最短路径
   *
   * @param vertex
   * @param neighbor
   */
  private void updateDistance(Vertex vertex, Vertex neighbor) {
    int distance = getDistance(vertex, neighbor) + vertex.getPath();
    if (distance < neighbor.getPath()) {
      neighbor.setPath(distance);
    }
  }

  /** 初始化未访问顶点集合 */
  private void initUnVisited() {
    unVisited = new PriorityQueue<>();
    for (Vertex vertex : vertexs) {
      unVisited.add(vertex);
    }
  }

  /** 从未访问订单集合中删除已找到最短路径的节点 */
  private void pop() {
    unVisited.poll();
  }

  /**
   * 获取顶点到目标顶点的距离
   *
   * @param source
   * @param destination
   * @return
   */
  private int getDistance(Vertex source, Vertex destination) {
    int sourceIndex = vertexs.indexOf(source);
    int destIndex = vertexs.indexOf(destination);
    return edges[sourceIndex][destIndex];
  }

  /**
   * 获取订单所有（未访问）邻居
   *
   * @param vertex
   * @return
   */
  private List<Vertex> getNeighbors(Vertex vertex) {
    ArrayList<Vertex> neighbors = new ArrayList<>();
    int position = vertexs.indexOf(vertex);
    Vertex neighbor = null;
    int distance;
    for (int i = 0; i < vertexs.size(); i++) {
      if (i == position) {
        continue;
      }
      distance = edges[position][i];
      if (distance < Integer.MAX_VALUE) {
        neighbor = getVertex(i);
        if (!neighbor.isMarked()) {
          neighbors.add(neighbor);
        }
      }
    }
    return neighbors;
  }

  /**
   * 根据顶点位置获取顶点
   *
   * @param index
   * @return
   */
  private Vertex getVertex(int index) {
    return vertexs.get(index);
  }

  /** 打印图 */
  public void printGraph() {
    int verNums = vertexs.size();
    for (int rows = 0; rows < verNums; rows++) {
      for (int col = 0; col < verNums; col++) {
        if (Integer.MAX_VALUE == edges[rows][col]) {
          System.out.println("XXXXX");
          System.out.println(" ");
          continue;
        }
        System.out.println(edges[rows][col]);
        System.out.println(" ");
      }
      System.out.println();
    }
  }
}
