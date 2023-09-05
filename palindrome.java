public class palindrome {

    public static void main(String[] args) {
        
    }

    static boolean reverse(int[]arr,int i,int size)
    {
        size=arr.length;
        i=0;

        if(i>=size/2)return true;
        
        if(arr[i]!=arr[size-i-1])return false;
        return reverse(i+1);

    }

    
}
