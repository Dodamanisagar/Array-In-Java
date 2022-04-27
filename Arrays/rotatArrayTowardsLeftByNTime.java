import java.util.Scanner;
public class rotatArrayTowardsLeftByNTime {
    public static void main(String[] args) {
        int size=5;
        int[] s=new int[size];
        Scanner scn=new Scanner(System.in);

        System.out.println("enter array elelments");
        for(int i=0;i<s.length;i++)
        {
            s[i]=scn.nextInt();
        }

        //rotating array elements towards left side by n times
        int n=3;
        for(int j=0;j<n;j++)
        {
            int temp=s[0];
            for(int i=0;i<s.length-1;i++)//must (s.length-1) only
            {
                s[i]=s[i+1];
            }
            s[s.length-1]=temp;
        }

        System.out.println("rotating array elements towards left side by "+n+" times");
        for(int a:s)
        {
            System.out.print(a+" ");
        }
    }
}
