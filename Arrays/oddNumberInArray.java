import java.util.Scanner;
public class oddNumberInArray {
    public static void main(String[] args) {
        int size=6;
        int[] x=new int[size];
        Scanner scn=new Scanner(System.in);
 
        //taking user inputs 
        System.out.println("enter the array elements");
        for(int i=0;i<x.length;i++)
        {
            x[i]=scn.nextInt();
        }

        //displaying odd elememnts of an array
        System.out.println("displaying odd elements");
        for(int i=0;i<x.length;i++)
        {
            if(x[i]%2!=0)
            {
                System.out.print(x[i]+" ");

            }
        }
    }
}
