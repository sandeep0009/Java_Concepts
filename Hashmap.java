import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;;

// public class Hashmap {

//     static void majorityElement(int []arr)
//     {
//         HashMap<Integer,Integer>map=new HashMap<>();
//         int n=arr.length;
//         for(int i=0;i<n;i++)
//         {
//             if(map.containsKey(arr[i]))
//             {
//                 map.put(arr[i],map.get(arr[i]+1));
//             }
//             else
//             {
//                 map.put(arr[i],1);
//             }
//         }
//         for(int key:map.keySet())
//         {
//             if(map.get(key)>n/3)
//             {
//                 System.out.println(key);
//             }
//         }
      
//     }
//     public static void main(String[] args) {
//         int[] arr={1,2};
//         majorityElement(arr);
//     }
    
// }



// public class Hashmap{
//     static int union(int[]a,int[]b)
//     {
//         HashSet<Integer>set=new HashSet<>();
//         for(int i=0;i<a.length;i++)
//         {
//             set.add(a[i]);
//         }
//         for(int i=0;i<b.length;i++)
//         {
//             set.add(b[i]);
//         }
//         return set.size();

        
//     }
//     public static void main(String[] args) {
//         int[]a={2,9,2,6,3};
//         int[]b={1,3,2,4,5};
//         int m=union(a, b);
//         System.out.println(m);
//     }  
// }

// public class Hashmap{
//     static int intersaction(int[]a,int[]b)
//     {
//         int count=0;
//         HashSet<Integer>set=new HashSet<>();
//         for(int i=0;i<a.length;i++)
//         {
//             set.add(a[i]);
//         }
//         for(int i=0;i<b.length;i++)
//         {
//             if(set.contains(b[i]))
//             {
//                 count++;
//                 set.remove(b[i]);
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int[]a={1,2,3,4,5};
//         int[]b={2,3,4,5};
//         int m=intersaction(a, b);
//         System.out.println(m);
//     }
// }
