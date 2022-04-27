import java.util.Scanner;
public class absuluteDiffOfEvenOddIndexElements {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int size=5,sum1=0,sum2=0;
        int[] a=new int[size];

        System.out.println("enter array elelment");
        for(int i=0;i<a.length;i++)
        {
            a[i]=scn.nextInt();
        }

        System.out.println("absulute difference between between even and odd index elements" );
        for(int i=0;i<a.length;i++)
        {
            if(i%2==0)
            {
                sum1=sum1+a[i];
            }
            if(i%2!=0)
            {
                sum2=sum2+a[i];
            }
        }
        System.out.println(Math.abs(sum1-sum2));
     }
}
