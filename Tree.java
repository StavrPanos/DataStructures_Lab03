import java.io.*;

public class Tree {

    private AdjacencyList adjacencyList; // the adjacency lists
    private final int N;              // number of tree nodes
    private int[] preorder;        // preorder numbering of nodes
    private int[] postorder;      // postorder numbering of nodes
    private int root;                 // root of the tree

    // construct children lists from parent array
    public Tree(int N, int[] parent) {
        this.N = N;
        preorder = new int[N];
        postorder = new int[N];

        //First find the root
        for(int i = 0; i < parent.length; i++){
            if(parent[i] == i){
                root = i;
            }
        }

        adjacencyList = new AdjacencyList(parent);//Create the adjacency lists of each Node;
        //adjacencyList.printAdjacencyList(); //FOR DEBUGGING
    }

    // traverse tree and store preorder and postorder numbering of the nodes
    public void traverse() {
        Stack<Integer> preorderStack = new Stack<>(); //The stack used for the preorder
        Stack<Integer> postorderStack = new Stack<>(); //The stack used for the postorder
        int preorderCounter = 0;
        int postOrderCounter = 0;

        //For the preorder
        preorderStack.push(root); //First put the root in the stack
        while(!preorderStack.isEmpty()){
            preorder[preorderCounter] = preorderStack.pop();
            for(int i : adjacencyList.getAdjacencyList().get(preorder[preorderCounter])){
                preorderStack.push(i);
            }
            preorderCounter++;
        }

        //For the postorder
        postorderStack.push(root); //First put the root in the stack
    }

    // test if v is an ancestor of w
    public boolean isAncestor(int v, int w) {
        boolean ans = false;

        /* enter your code */
        return ans;
    }

    // return the path from v to w in the tree  
    public Queue<Integer> treePath(int v, int w) {
        Queue<Integer> Q = new Queue<Integer>();
        /* enter your code */
        return Q;
    }

    public void printQueue(Queue<Integer> Q) {
        // remove comments if Queue is ready
        /*
        while ( !Q.isEmpty() ) {
            int x = Q.get();
            System.out.print(" " + x + " ");
        }
        System.out.println("");
         */
    }

    public static void main(String[] args) {
        In.init();
        int n = In.getInt();

        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            int v = In.getInt();
            parent[i] = v;
        }

        Tree T = (Tree) new Tree(n, parent);
        T.traverse();
        // int w = n / 4;
        // int u = n / 2;
        // int v = n - 1;
        // int z = 0;

        // System.out.println("" + w + " ancestor of " + u + " ? = " + T.isAncestor(w, u));
        // System.out.println("" + w + " ancestor of " + v + " ? = " + T.isAncestor(w, v));
        // System.out.println("" + w + " ancestor of " + z + " ? = " + T.isAncestor(w, z));
        // System.out.println("");

        // System.out.println("" + u + " ancestor of " + w + " ? = " + T.isAncestor(u, w));
        // System.out.println("" + u + " ancestor of " + v + " ? = " + T.isAncestor(u, v));
        // System.out.println("" + u + " ancestor of " + z + " ? = " + T.isAncestor(u, z));
        // System.out.println("");

        // System.out.println("" + v + " ancestor of " + w + " ? = " + T.isAncestor(v, w));
        // System.out.println("" + v + " ancestor of " + u + " ? = " + T.isAncestor(v, u));
        // System.out.println("" + v + " ancestor of " + z + " ? = " + T.isAncestor(v, z));
        // System.out.println("");

        // System.out.println("" + z + " ancestor of " + w + " ? = " + T.isAncestor(z, w));
        // System.out.println("" + z + " ancestor of " + u + " ? = " + T.isAncestor(z, u));
        // System.out.println("" + z + " ancestor of " + v + " ? = " + T.isAncestor(z, v));
        // System.out.println("");

        // Queue<Integer> Q;
        // int length;

        // System.out.print("Path from " + w + " to " + u + " = ");
        // Q = T.treePath(w, u);
        // length = Q.size();
        // T.printQueue(Q);
        // System.out.println("Path length = " + length + "\n");

        // System.out.print("Path from " + w + " to " + v + " = ");
        // Q = T.treePath(w, v);
        // length = Q.size();
        // T.printQueue(Q);
        // System.out.println("Path length = " + length + "\n");

        // System.out.print("Path from " + u + " to " + v + " = ");
        // Q = T.treePath(u, v);
        // length = Q.size();
        // T.printQueue(Q);
        // System.out.println("Path length = " + length + "\n");

        // System.out.print("Path from " + z + " to " + w + " = ");
        // Q = T.treePath(z, w);
        // length = Q.size();
        // T.printQueue(Q);
        // System.out.println("Path length = " + length + "\n");

        // System.out.print("Path from " + z + " to " + u + " = ");
        // Q = T.treePath(z, u);
        // length = Q.size();
        // T.printQueue(Q);
        // System.out.println("Path length = " + length + "\n");

        // System.out.print("Path from " + z + " to " + v + " = ");
        // Q = T.treePath(z, v);
        // length = Q.size();
        // T.printQueue(Q);
        // System.out.println("Path length = " + length + "\n");
    }
}
