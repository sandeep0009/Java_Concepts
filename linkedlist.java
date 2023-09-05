public class linkedlist {
    private Node head;


    public static void main(String[] args) {
        
    }
    class Node{
        private int value;
       private  Node next;
     public Node(int value)
     {
        this.value=value;
     }
     public Node(int value,Node next)
     {
        this.value=value;
        this.next=next;
     }
    }
    public void insertatfirst(int val)
    {
        Node node= new Node(val);
        node.next=head;
        head=node;
      


    }
   
    
}
