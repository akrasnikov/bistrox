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

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author Aleksey
 */
public class BistoxGraphInitializer {

   
    
    /**
     * An object graph is a collection of nodes and edges connecting these nodes. 
     * Object graphs provide an easy way to account for mutual relationships in the system
     * 
     * @return the collection of nodes and edges
     */
   public static BistoxUndirectedWeighedGraph[] CreateNodeListGoogleMap()
   {
       
       BistoxUndirectedWeighedGraph[] bxGraphList = new BistoxUndirectedWeighedGraph[9];  
       
       bxGraphList[0] = new BistoxUndirectedWeighedGraph("Shopping Center Parus", "Metro Hamza", 1.6);
       bxGraphList[1] = new BistoxUndirectedWeighedGraph("Metro Hamza", "Flamingo Cafe", 1.2);
       bxGraphList[2] = new BistoxUndirectedWeighedGraph("Flamingo Cafe", "Metro Mirzo Ulugbeg", 2.6);
       bxGraphList[3] = new BistoxUndirectedWeighedGraph("Metro Mirzo Ulugbeg", "Chilanzar Shopping Center", 1.6);       
       bxGraphList[4] = new BistoxUndirectedWeighedGraph("Chilanzar Shopping Center", "Shopping Center Parus", 2.5);
       bxGraphList[5] = new BistoxUndirectedWeighedGraph("Textile combine", "Flamingo Cafe", 1.6);
       
       bxGraphList[6] = new BistoxUndirectedWeighedGraph("Monument to Pushkin", "Textile combine", 1.6);
       bxGraphList[7] = new BistoxUndirectedWeighedGraph("Shopping Center Parus", "Metro Mirzo Ulugbeg", 1.3);
       bxGraphList[8] = new BistoxUndirectedWeighedGraph("Metro Hamza", "Metro Mirzo Ulugbeg", 1.5);
       //bxGraphList[6] = new BistoxUndirectedWeighedGraph("Metro Hamza", "Monument to Pushkin", 3.2);
       
       return bxGraphList;      
   }
   
   public static BistoxUndirectedWeighedGraph[] CreateNodeList()
   {
       
       BistoxUndirectedWeighedGraph[] bxGraphList = new BistoxUndirectedWeighedGraph[7];  
       
       bxGraphList[0] = new BistoxUndirectedWeighedGraph("1", "2", 1.6);
       bxGraphList[1] = new BistoxUndirectedWeighedGraph("2", "3", 2.4);
       bxGraphList[2] = new BistoxUndirectedWeighedGraph("3", "4", 3.66);
       bxGraphList[3] = new BistoxUndirectedWeighedGraph("4", "5", 4.7);
       bxGraphList[4] = new BistoxUndirectedWeighedGraph("5", "1", 5.8);
       
       bxGraphList[5] = new BistoxUndirectedWeighedGraph("1", "4", 1.2);
       bxGraphList[6] = new BistoxUndirectedWeighedGraph("2", "4", 2.3);
       
       return bxGraphList;      
   }
   
    /**
     * An object graph is a collection of nodes and edges connecting these nodes. 
     * Object graphs provide an easy way to account for mutual relationships in the system
     * 
     * @param bistroxG
     * @return the collection of nodes and edges
     */
   public ArrayList<BistoxUndirectedWeighedGraph> CreateGraphList(ArrayList<BistoxUndirectedWeighedGraph> bistroxG)
   {
       ArrayList<BistoxUndirectedWeighedGraph> objectGraph =  new ArrayList<>(); 
             
       objectGraph.addAll(bistroxG);
       return objectGraph;      
   }
    
}
