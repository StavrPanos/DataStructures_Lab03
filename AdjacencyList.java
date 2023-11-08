import java.util.ArrayList;
import java.io.*;

public class AdjacencyList{
    private ArrayList<ArrayList<Integer>> adjacencyList;

    //The constructor
    public AdjacencyList(int[] parent){
        adjacencyList = new ArrayList<>();//Initialy it's empty
        for(int i = 0; i < parent.length; i++){
            adjacencyList.add(new ArrayList<>());
        }

        //Now we "build" the adjacency list from the parent array
        for(int child = 0; child < parent.length; child++){
            if(parent[child] != child){//If it's not the root Node
                adjacencyList.get(parent[child]).add(child);
            }
        }
    }

    //Getter 
    public ArrayList<ArrayList<Integer>> getAdjacencyList(){
        return adjacencyList;
    }

    //Print method for debugging
    public void printAdjacencyList(){
        for(int i = 0; i < adjacencyList.size(); i++){
            System.out.println("Node " + i + " -> " + adjacencyList.get(i));
        }
    }
}