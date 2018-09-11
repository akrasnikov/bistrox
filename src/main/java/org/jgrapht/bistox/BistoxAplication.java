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
package org.jgrapht.bistox;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Supplier;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultUndirectedWeightedGraph;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.alg.shortestpath.FloydWarshallShortestPaths;
import org.jgrapht.graph.SimpleWeightedGraph;

/**
 *
 * @author Aleksey
 */
public class BistoxAplication {
    
    public static void main(String[] args)
    {
      /*
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = in.nextLine();
        System.out.print("Enter Age: ");
        int age = in.nextInt();
        System.out.println("Name: " + name + "   Age: " + age);
        return;
        */
        
        Graph<String, DefaultWeightedEdge> graph = buildBistoxGraph(BistoxGraphInitializer.CreateNodeListGoogleMap()); 
        String[] vertexList = graph.vertexSet().toArray(new String[]{}); 
        
        System.out.println("Getting the shortest path at the startVertex and endVertex of the node in jgrapht");
        List<String> shortPath =  getRoute(vertexList[0], vertexList[3], graph);
        shortPath.forEach((x) -> System.out.println(x));
        
        System.out.println("Getting all edges from node to jgrapht");
        Object[] edgeList = getAllEdge(vertexList[0], graph);
        for (Object edge : edgeList) {
            System.out.println(edge);
        }
        
       System.out.println("End");
    }
      
    private static List<String> getRoute(String startVertex, String endVertex, Graph<String, DefaultWeightedEdge> graph)
    {
        DijkstraShortestPath<String, DefaultWeightedEdge> dijkstra = new DijkstraShortestPath<>(graph);
       /* GraphPath<String, DefaultWeightedEdge> graphpath = dijkstra.getPath(startVertex, endVertex);
         if(graphpath == null)
         {
             System.err.println("null");
             return null;
         }
        */
         return  dijkstra.getPath(startVertex,endVertex).getVertexList();          
    }

    private static Graph<String, DefaultWeightedEdge> buildBistoxGraph(  BistoxUndirectedWeighedGraph[] bistroxNodeList) {
        //Graph<String, DefaultWeightedEdge> graph = new SimpleGraph<>(DefaultWeightedEdge.class);
        Graph<String, DefaultWeightedEdge> bxGraph = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
        
        for (BistoxUndirectedWeighedGraph bxGraphElement : bistroxNodeList) {
            String a = bxGraphElement.getSourceVertex();
            bxGraph.addVertex(a);          
        }
        try{    
            for (BistoxUndirectedWeighedGraph bxGraphElement : bistroxNodeList) {
                System.out.println(bxGraphElement.getSourceVertex());
                System.out.println(bxGraphElement.getTargetVertex());
                DefaultWeightedEdge w = bxGraph.addEdge(bxGraphElement.getSourceVertex(), bxGraphElement.getTargetVertex());
                bxGraph.setEdgeWeight(w, bxGraphElement.getWeight());     
            }    
        }
        catch(Exception ex){}
           
        return bxGraph;
    }
    
    private static Object[] getAllEdge(String sourceVertex,Graph<String, DefaultWeightedEdge> graph)
    {
       Set<DefaultWeightedEdge> edgesOf = graph.edgesOf(sourceVertex);
       return edgesOf.toArray();
                   
    }
    
    
}

