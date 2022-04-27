import java.util.Scanner;
public class largestElementInGivenArray {
    public static void main(String[] args) {
        int size=5;
        int[] m=new int[size];

        Scanner scn=new Scanner(System.in);

        System.out.println("enter array elements");
        for(int i=0;i<m.length;i++)
        {
           m[i]=scn.nextInt();
        }
        
        //searching for large element in a array
        int larg=m[0];
        for(int i=0;i<m.length;i++)
        {
            if(larg<m[i])
            {
                larg=m[i];
            }
        }
        System.out.println("large element in given array is: "+larg);
        
    }
    
}
