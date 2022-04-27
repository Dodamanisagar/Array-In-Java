import java.util.Scanner;
public class userDefinedArray {
    public static void main(String[] args) {
        int size=4;
        int arr[]=new int[size];

        Scanner scn=new Scanner( System.in);
        //taking user inputs
        System.out.println("enter the array elelment");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        //displaying user inputs
        System.out.println("array elements are:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
    
}
