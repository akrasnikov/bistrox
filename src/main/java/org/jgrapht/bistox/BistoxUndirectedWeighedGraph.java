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

/**
 *
 * @author Aleksey
 */
public class BistoxUndirectedWeighedGraph {    
   
    private String sourceVertex;
    private String targetVertex;
    private Double Weight;
    
    // map variable
    public String Distance;
    public String SourcePoint;
    public String DestinationPoint;

    
    public BistoxUndirectedWeighedGraph(String Vertex, String Edge, Double Weight) {
        this.sourceVertex = Vertex;
        this.targetVertex = Edge;
        this.Weight = Weight;
    }

     public void setSourceVertex(String sourceVertex) {
               this.sourceVertex = sourceVertex;
           }
     
      public void setTargetVertex(String targetVertex) {
               this.targetVertex = targetVertex;
           }
      
       public void setWeight(Double Weight) {
               this.Weight = Weight;
           }
       
       public String getSourceVertex() {
               return sourceVertex;
           }
     
      public String getTargetVertex() {
               return targetVertex;
           }
      
       public Double getWeight() {
               return Weight;
           }
       
    
}
