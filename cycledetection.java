import java.util.ArrayList;
public class cycledetection {

    /*
     * in directed graph we cant follow undirected because it falls
     * directed graph will have modified dfs 
     * cycle happen when inside the recursion therer is already exist the element
     * 
     */

     static class Edge{
        int src;
        int dest;
        public Edge(int s,int d)
        {
            this.src=s;
            this.dest=d;

        }
     }

     public static void creategrapht(ArrayList<Edge>graph[])
     {
        for(int i=0;i <graph.length;i++)
        {
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
        
     }

     public static boolean dfscount(ArrayList<Edge>graph[],boolean[]visit,int current,boolean[]recu)
     {
        visit[current]=true;
        recu[current]=true;
        for(int i=0;i<graph[current].size();i++)
        {
            Edge e= graph[current].get(i);
            if(!recu[e.dest])
            {
                return true;
            }
            else if(visit[e.dest]==false)
            {
                if(dfscount(graph, visit, e.dest, recu)){
                    return true;
                }
            }
        }
        recu[current]=false;
        return false;

     }

     public static void main(String[] args) {
        int v=4;
        ArrayList<Edge>graph[]=new ArrayList[v];
        creategrapht(graph);
        boolean visit[]=new boolean[v];
        boolean recu[]=new boolean[v];
        for(int i=0;i<v;i++)
        {
            if(!visit[i]){
                boolean iscycle=dfscount(graph, visit, 0, recu);
                if(iscycle)
                {
                    System.out.println(iscycle);
                    break;
                }
            }
        }
     }
    
}
