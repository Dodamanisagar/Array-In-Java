import java.util.Scanner;
public class rotatArrayTowardsRightByNTime {
    public static void main(String[] args) {
        int size=5;
        int[] t=new int[size];

        Scanner scn=new Scanner(System.in);

        System.out.println("enter the array elelments");
        for(int i=0;i<t.length;i++)
        {
            t[i]=scn.nextInt();
        }
        
        //rotating array elements by n times
        int n=3;
        for(int j=0;j<n;j++)
        {
            int temp=t[t.length-1];
            for(int i=t.length-1;i>=1;i--)
            {
                t[i]=t[i-1];
            }
            t[0]=temp;
        }

        System.out.println("array elements rotated right side by "+n+" times");
        for(int i:t)
        {
            System.out.print(i+" ");
        }
        
    }
    
}
