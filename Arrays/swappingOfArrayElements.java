import java.util.Scanner;
public class swappingOfArrayElements {
    public static void main(String[] args) {
        int size=7;
        int[] d=new int[size];

        Scanner scn=new Scanner(System.in);

        System.out.println("enter array elements");
         for(int i=0;i<d.length;i++)
         {
             d[i]=scn.nextInt();
         }
         //int n=d.length/2;---->wrong
         int n=d.length;
         System.out.println("swapping the array elements");
         for(int i=0;i<n/2;i++)
         {
             int temp=d[i];
             d[i]=d[n-i-1];
             d[n-i-1]=temp;
         }
         for(int i:d)
         {
             System.out.print(i+" ");
         }
         
    }
    
}
