import java.util.ArrayList;
import java.util.Stack;
public class TopologicalSort {

    /*
     * it works for only directed acyclic graph(DAG) is  directed and no cyclic
     * it is linaer order of vertices such that every directed edge u->u the vertex u come before the v in the order
     * basically it tells in which liear way a vertex can be written such that u follows v and tells which node comes first and second;
     * 
     * it tells us about dependency:
     * action 1:buy laptop
     * action 2:install os
     * action 3:install code edtior
     * action 4: install java
     * action 5: write code
     * 
     * we use modified dfs to perform it
     * 
     * common in dfs recusrion stack and visited array,
     * now we have to keep track of which thing first and will store everything in stack;
     * 
     * in this we will first travel all the neighborus and then current node in the stack
     * 
     * 
     */
    static class Edge{
        int dest;
        int src;
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
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 1));
    }
    public static void topological(ArrayList<Edge>graph[],int current,boolean[]visit,Stack<Integer>stk)
    {
        visit[current]=true;
        for(int i=0;i<graph[current].size();i++)
        {
            Edge e= graph[current].get(i);
            if(!visit[e.dest])
            {
                topological(graph, e.dest, visit, stk);
            }
        }
        stk.push(current);
    }

    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge>graph[]=new ArrayList[v];
        creategraph(graph);
        boolean[] visit=new boolean[v];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<v;i++)
        {
            if(!visit[i])
            {
                topological(graph, i, visit, st);

            }
        }
        while(!st.isEmpty())
        {
            System.out.println(st.pop()+" ");
        }

        
    }
    
}
