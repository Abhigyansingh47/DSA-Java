import java.util.*;
class ConsequtiveSubsequences {
    static int[] Remove(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<n; i++){
            if(st.size()==0 || st.peek()!=arr[i]) 
            st.push(arr[i]);
            else if(arr[i]==st.peek()){
            if(i==n-1 || arr[i]!=arr[i+1])  st.pop();
            }
        }
        int res[] = new int[st.size()];
        int m=res.length;
        for(int i=m-1;i>=0;i--)
        {
            res[i]=st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
            int[] arr={1,2,2,3,4,4,4,5,7,7,2};
            int[] res=Remove(arr);
            for(int i=0;i<res.length;i++)
            {
                System.out.print(res[i]+" ");
            }
        }
} 