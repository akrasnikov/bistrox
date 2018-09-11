/*
 * Copyright (c) 2018 Aleksey.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Aleksey - initial API and implementation and/or initial documentation
 */
package org.jgrapht.demo;

/**
 *
 * @author Aleksey
 */

import org.jgrapht.*;
import org.jgrapht.graph.*;
import org.jgrapht.traverse.*;
import org.jgrapht.io.*;

import java.net.*;
import java.util.*;
import java.io.*;

public class matrix {
    
    public static void main(String[] args)
    {
        
        Graph<String, DefaultEdge> stringGraph = createStringGraph();

        // note undirected edges are printed as: {<v1>,<v2>}
        System.out.println(stringGraph.toString());

        // create a graph based on URL objects
        Graph<URL, DefaultEdge> hrefGraph = createHrefGraph();

        // note directed edges are printed as: (<v1>,<v2>)
        System.out.println(hrefGraph.toString());
    }
    private static Graph<URL, DefaultEdge> createHrefGraph()
    {
        Graph<URL, DefaultEdge> g = new DefaultDirectedGraph<>(DefaultEdge.class);

        try {
            URL amazon = new URL("http://www.amazon.com");
            URL yahoo = new URL("http://www.yahoo.com");
            URL ebay = new URL("http://www.ebay.com");

            // add the vertices
            g.addVertex(amazon);
            g.addVertex(yahoo);
            g.addVertex(ebay);

            // add edges to create linking structure
            g.addEdge(yahoo, amazon);
            g.addEdge(yahoo, ebay);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return g;
    }
    private static Graph<String, DefaultEdge> createStringGraph()
    {
        Graph<String, DefaultEdge> g = new SimpleGraph<>(DefaultEdge.class);

        String v1 = "v1";
        String v2 = "v2";
        String v3 = "v3";
        String v4 = "v4";

        // add the vertices
        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);

        // add edges to create a circuit
        g.addEdge(v1, v2);
        g.addEdge(v2, v3);
        g.addEdge(v3, v4);
        g.addEdge(v4, v1);

        return g;
    }
    
    private static  void createGraphWeight()
    {
         SimpleDirectedWeightedGraph<String, DefaultWeightedEdge>  graph =  
                 new SimpleDirectedWeightedGraph<String, DefaultWeightedEdge>(DefaultWeightedEdge.class); 
            graph.addVertex("vertex1");
            graph.addVertex("vertex2");
            graph.addVertex("vertex3");
            graph.addVertex("vertex4");
            graph.addVertex("vertex5");


            DefaultWeightedEdge e1 = graph.addEdge("vertex1", "vertex2");  
            graph.setEdgeWeight(e1, 5); 

            DefaultWeightedEdge e2 = graph.addEdge("vertex2+", "vertex3"); 
            graph.setEdgeWeight(e2, 3); 

            DefaultWeightedEdge e3 = graph.addEdge("vertex4", "vertex5"); 
            graph.setEdgeWeight(e3, 6); 

            DefaultWeightedEdge e4 = graph.addEdge("vertex2", "vertex4"); 
            graph.setEdgeWeight(e4, 2); 

            DefaultWeightedEdge e5 = graph.addEdge("vertex5", "vertex4"); 
            graph.setEdgeWeight(e5, 4); 


            DefaultWeightedEdge e6 = graph.addEdge("vertex2", "vertex5"); 
            graph.setEdgeWeight(e6, 9); 

            DefaultWeightedEdge e7 = graph.addEdge("vertex4", "vertex1"); 
            graph.setEdgeWeight(e7, 7); 

            DefaultWeightedEdge e8 = graph.addEdge("vertex3", "vertex2"); 
            graph.setEdgeWeight(e8, 2); 

            DefaultWeightedEdge e9 = graph.addEdge("vertex1", "vertex3"); 
            graph.setEdgeWeight(e9, 10); 

            DefaultWeightedEdge e10 = graph.addEdge("vertex3", "vertex5"); 
            graph.setEdgeWeight(e10, 1); 


            System.out.println("Shortest path from vertex1 to vertex5:");
           // List shortest_path =   DijkstraShortestPath.findPathBetween(graph, "vertex1", "vertex5");
           // System.out.println(shortest_path);
    
            
    }
}
