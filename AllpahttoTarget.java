import java.util.ArrayList;
public class AllpahttoTarget {

    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d)
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

    public static void dfs(ArrayList<Edge>graph[],int curr,boolean[]visit)
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

    public static void printAllpath(ArrayList<Edge>graph[],boolean visit[],int curr,String path,int targ)
    {
        if(curr==targ)
        {
            System.out.println(path);
            return;
        }
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(!visit[e.dest])
            {
                visit[curr]=true;
                printAllpath(graph, visit, e.dest, path+e.dest, targ);
                visit[curr]=false;
            }

        }
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge>graph[]=new ArrayList[v];
        creategraph(graph);
        int src=0, target=5;
        printAllpath(graph,new boolean[v],src,"0",target);
    }
    
}
