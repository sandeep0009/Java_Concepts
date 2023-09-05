import java.util.ArrayList;

public class DFS {
    /*
     * dfs stands for depth first search
     * it uses stack
     * complete one branch and then carry on second branches
     * it uses recursion
     * keep going to the 1 neighbour
     * 
     */
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d)
        {
            this.src= s;
            this.dest= d;
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
        graph[3].add(new Edge(3, 5));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 6));


    }
    public static void dfs(ArrayList<Edge>graph[],int curr,boolean visit[])
    {
        System.out.print(curr+ " ");
        visit[curr]=true;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(visit[e.dest]==false)
             { 
                dfs(graph,e.dest,visit);
             }


        }



    }

    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge>graph[]=new ArrayList[v];
        creategraph(graph);
        boolean visit[]=new boolean[v];
        for(int i =0;i<v;i++)   //this for loop is for the purpose when we have graph in pieces;
        {
            if(visit[i]==false)
            { 
                dfs(graph,i, visit);
            }
        }
    }


    
}
