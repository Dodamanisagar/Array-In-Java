import java.util.Scanner;
public class rotatArrayTowardsRightBY1Time {
    public static void main(String[] args) {
        int size=5;
        int[] a=new int[size];
        Scanner scn=new Scanner(System.in);

        System.out.println("entere array elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=scn.nextInt();
        }

        //rotating towards right side by 1 time
        int temp=a[a.length-1];
        for(int i=a.length-1; i>=1;i--)
        {
            a[i]=a[i-1];
        }
        a[0]=temp;
         
        System.out.println("rotating array towards right side by 1 time");
        for(int i:a)
        {
            System.out.print(i+" ");
        }

    }
    
}
