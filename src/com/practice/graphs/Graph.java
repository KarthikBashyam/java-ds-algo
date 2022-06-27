package com.practice.graphs;

import java.util.LinkedList;

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

	public void bfs() {

	}

	public static void main(String[] args) {

		Graph graph = new Graph(4);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);

	}

}
