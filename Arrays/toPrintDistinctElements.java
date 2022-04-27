import java.util.Scanner;
public class toPrintDistinctElements {
    public static void main(String[] args) {
        int size=6;
        int[] d=new int[size];
        Scanner scn=new Scanner(System.in);

        System.out.println("enter array elements");
        for(int i=0;i<d.length;i++)
        {
            d[i]=scn.nextInt();
        }

        System.out.println("distinct elements are");
        for(int j=0;j<d.length;j++)
        {
            for(int i=0;i<d.length;i++)
            {
                if(i!=j && d[i]==d[j])
                {
                    d[i]='\0';
                }
            }
            if(d[j]!='\0')
            System.out.print(d[j]+" ");
        }
    }
    
}
