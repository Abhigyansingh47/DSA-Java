import java.util.*;
class bubblesort
{
    static void bubblesort(int []arr)
    {
        int n=arr.length;

        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        //System.out.print(Arrays.toString(arr));  optimized and intelligent approach
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        bubblesort(arr);
    }
}