import java.util.ArrayList;
public class Adjanceylist {
    /*we can represent a graph in java as arraylist and hashmap
     * vertex wise division of each vertex and will decide source and destination
     * then connect each vertex with each edges
     * 
     * 
     * creation:
     * first we will create an arr[] and then a arraylist<edege>graph[v]
     * for edege we will create a static class :int source and second int destionation
     * 
     * for accesing the graph elements:
     * graph[0].add(new edge(0,2))
     * first access the index and then will access the edge
     * graph[1].add(new edge(1,2))
     * graph[1].add(new edge(1,3)
     */

     
     //undirected and non weighted graph
    //  static class Edge{
    //     int src;
    //     int dest;
    //     public Edge(int s,int d)
    //     {
    //         this.src=s;
    //         this.dest=d;
    //     }

    //  }


    //  public static void creategraph(ArrayList<Edge>graph[])
    //  {
    //     for(int i =0;i<graph.length;i++)
    //     {
    //         graph[i]=new ArrayList<Edge>();
    //     }
    //     graph[0].add(new Edge(0, 2));
    //     graph[1].add(new Edge(1, 2));
    //     graph[1].add(new Edge(1, 3));
    //     graph[2].add(new Edge(2, 3));
    //     graph[2].add(new Edge(2, 1));
    //     graph[2].add(new Edge(2, 0));
    //     graph[3].add(new Edge(3, 2));
    //     graph[3].add(new Edge(3, 1));

    //  }


     //weighted and undirectred graph:
     static class Edge{
        int src;
        int dest;
        int weight;

        public Edge(int s,int d,int w)
        {
            this.src=s;
            this.dest=d;
            this.weight=w;
        }
     }

     public static void creategraph(ArrayList<Edge>graph[])
     {
        for(int i =0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 02, 2));
        graph[1].add(new Edge(1, 3, 0));
        graph[1].add(new Edge(1, 2, 10));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 3, -1));
        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));

     }

     public static void main(String[] args) {
        int v=4;
        ArrayList<Edge>graph[]=new ArrayList[v];
        creategraph(graph);

        ///print three negihbours;
        for(int i=0;i<graph[3].size();i++)
        {
            Edge e=graph[3].get(i);
            System.out.println(e.dest + " "+e.weight+ " ");
        }

        

     }
    
}
