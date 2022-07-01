package com.practice.graphs;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

	private int vertices;

	private LinkedList<Integer>[] adjacencyList;

	@SuppressWarnings("unchecked")
	public Graph(int vertices) {
		this.vertices = vertices;

		this.adjacencyList = new LinkedList[vertices];

		for (int i = 0; i < vertices; i++) {
			this.adjacencyList[i] = new LinkedList<>();
		}
	}

	public void addEdge(int source, int destination) {

		this.adjacencyList[source].add(destination);

	}

	public void print() {

	}

	public void bfs(Graph graph) {

		boolean[] visited = new boolean[graph.vertices];

		for (int i = 0; i < graph.vertices; i++) {
			int source = i;
			if (!visited[source]) {
				Queue<Integer> queue = new ArrayDeque<>(graph.vertices);
				queue.add(source);
				visited[source] = true;

				while (!queue.isEmpty()) {
					int currentNode = queue.poll();
					System.out.println(currentNode);

					if (graph.adjacencyList[currentNode] != null) {
						LinkedList<Integer> temp = graph.adjacencyList[currentNode];
						
						for (Iterator<Integer> iterator = temp.iterator(); iterator.hasNext();) {
							Integer data = (Integer) iterator.next();
							if(!visited[data]) {
								queue.add(data);
								visited[data] = true;
							}
							
						}
						
					}

				}

			}

		}

	}

	public static void main(String[] args) {

		Graph graph = new Graph(4);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.bfs(graph);

	}

}
