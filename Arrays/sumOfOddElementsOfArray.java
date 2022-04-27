import java.util.Scanner;
public class sumOfOddElementsOfArray {
    public static void main(String[] args) {
        int size=6,sum=0;
        int[] x=new int[size];
        Scanner scn=new Scanner(System.in);
 
        //taking user inputs 
        System.out.println("enter the array elements");
        for(int i=0;i<x.length;i++)
        {
            x[i]=scn.nextInt();
        }

        //displaying sum of odd elememnts of an array
        System.out.println("displaying sum of odd elements");
        for(int i=0;i<x.length;i++)
        {
            if(x[i]%2!=0)
            {
                sum=sum+x[i];
            }
        }
        System.out.print(sum);
    }
}
