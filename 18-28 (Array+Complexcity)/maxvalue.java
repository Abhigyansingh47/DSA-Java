public class maxvalue 
{
    public static void main(String[] args) 
    {
        int [] arr = {36,58,92,58,85,64,63};
        int max = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            max= arr[i];
        }
        System.out.println("Largest no. is "+max);
    }
}