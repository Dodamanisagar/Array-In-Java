import java.util.Scanner;
public class smallestElementInGivenArray {
public static void main(String[] args) {
    int size=5;
    int[] a=new int[size];

    Scanner scn=new Scanner(System.in);
     System.out.println("enter array elements");
    for(int i=0;i<a.length;i++)
    {
        a[i]=scn.nextInt();
    }

    //searching for small element in array
    int small=a[0];
    for(int i=0;i<a.length;i++)
    {
        if(small>a[i])
        {
            small=a[i];
        }
    }
    System.out.println("small element in a given array is: "+small);
}    
}
