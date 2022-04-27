import java.util.Scanner;
public class sumOfArrayElementAtEvenIndex {
    public static void main(String[] args) {
    int size=5,sum=0;
    int[] a=new int[size];
    Scanner scn=new Scanner(System.in);

    System.out.println("enter array elements");
    for(int i=0;i<a.length;i++)
    {
        a[i]=scn.nextInt();
    }
    
    System.out.println("displaying sum of array element present at even index");
     for(int i=0;i<a.length;i+=2)
     {
         //if(i%2==0)
         {
             sum=sum+a[i];
         }
     }
      System.out.println(sum);

    }
    
}
