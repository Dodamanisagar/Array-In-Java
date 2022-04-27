import java.util.Scanner;
public class evenNumberInArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int size=9;
        int[] arr=new int[size];
        
        //taking user inputs
        System.out.println("enter the array element");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
         
        //printing even elements of an array
        System.out.println("even element in an array:-");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    
}
