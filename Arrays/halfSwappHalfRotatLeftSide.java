
import java.util.Scanner;
public class halfSwappHalfRotatLeftSide {
    public static void main(String[] args) {
    int size=6;
    int[] w=new int[size];
    Scanner scn=new Scanner(System.in);

    System.out.println("enter array elements");
    for(int i=0;i<w.length;i++)
    {
        w[i]=scn.nextInt();
    }
    
    //swapping the half part of given array
    int n=w.length/2;//to swap up to the half part of givin array
    for(int i=0;i<n/2;i++)/*n/2 bz we have to swap upto mid point (half of half) ,if we didnt 
                            stop at mid point result will we the original value only*/
    {
        int temp=w[i];
        w[i]=w[n-i-1];
        w[n-i-1]=temp;
    }

    //to rotate half part of given array towards left side by n times
    int m=2;
    for(int i=0;i<m;i++)
    {
        int temp=w[n];//storing the first value of 2nd half array into temp
        for(int j=n;j<w.length-1;j++)//rotating towards left side by n times 
        {
            w[j]=w[j+1];
        }
        w[w.length-1]=temp;
    }

    System.out.println("displaying array elements");
    for(int a:w)
    {
        System.out.print(a+" ");
    }
    }
}
