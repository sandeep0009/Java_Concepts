import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class BFS {
    /*graph traversal means to travel on graph.
     * 
     * bfs use queue .we go to immediate neighbor first
     * and we will create array that will keep a note which node visited and whihc not.
     * size of arry= node or vertex;
     * we will have boolean array and it will be false in starting
     * steps:
     *           choose a strating point
     *             print current
     *              visit[current]=true
     *              
     * 
     */
    static  class Edge{
        int src;
        int dest;
        public Edge(int s ,int d)
        {
            this.src=s;
            this.dest=d;
        }
    }

    public static void creategraph(ArrayList<Edge>graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 6)); 


    }
    public static void bfs(ArrayList<Edge> graph[],int v)
    {
        Queue<Integer> q= new LinkedList<>();
        boolean visit[]= new boolean[v];
        q.add(0);
        while(!q.isEmpty())
        {
            int current=q.remove();
            if(visit[current]==false)
            {
                System.out.println(current+ " ");
                visit[current]=true;
                for(int i=0;i<graph[current].size();i++)
                {

                    Edge e=graph[current].get(i);
                    q.add(e.dest);

                }
            }
        }
       



    }


    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge>graph[]=new ArrayList[v];
        creategraph(graph);
        bfs(graph, v);
    }
    
}
