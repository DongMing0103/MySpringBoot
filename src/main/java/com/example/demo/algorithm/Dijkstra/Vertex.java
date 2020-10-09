package com.example.demo.algorithm.Dijkstra;

/** @Author dongm @Description: @Date 2020/9/22 */
public class Vertex implements Comparable<Vertex> {

  /** 节点名称（A/B/C/D) */
  private String name;

  /** 最短路径长度 */
  private int path;

  /** 节点是否已经出列（是否已经处理完毕） */
  private boolean isMarked;

  public boolean isMarked() {
    return isMarked;
  }

  public void setMarked(boolean marked) {
    isMarked = marked;
  }

  public int getPath() {
    return path;
  }

  public void setPath(int path) {
    this.path = path;
  }

  public Vertex(String name) {
    this.name = name;
    this.path = Integer.MAX_VALUE;
    this.setMarked(false);
  }

  public Vertex(String name, int path) {
    this.name = name;
    this.path = path;
    this.setMarked(false);
  }

  @Override
  public int compareTo(Vertex o) {
    return o.path > path ? -1 : 1;
  }
}
