import java.util.Arrays;

public class segreegate_0_and_1 {
    public static void main(String[] args) {
        int[] arr={0,1,0,1,1,0,1,0,1,1,0};
        /*Arrays.sort(arr);
        System.out.println("segreegated array elements are");
        for(int a:arr)
        {
            System.out.print(a+", ");
        }*/
        int count=0;
        //counting totat numbers of '0' in the given array
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count++;
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            if(i<count)
                arr[i]=0;
            else
                arr[i]=1;
        }
        System.out.println("segreegated array elements are");
       for(int a:arr)
       {
           System.out.print(a+" ");
       }

    }
    
}
