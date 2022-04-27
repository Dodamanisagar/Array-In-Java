import java.util.Scanner;
public class bubbleSort {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter size of the array");
        int size=scn.nextInt();
        int[] d=new int[size];

        System.out.println("enter the array elements");
        for(int i=0;i<size;i++)
        {
            d[i]=scn.nextInt();
        }

        //logic for bubble sorting
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-i-1;j++)
            {
                if(d[j]<d[j+1])//<for descending order
                {
                    int temp=d[j];
                    d[j]=d[j+1];
                    d[j+1]=temp;
                }
            } 
        }

        System.out.println("bubble sorted array in descending order");
        for(int a:d)
        {
            System.out.println(a+" ");
        }

    }    
}

