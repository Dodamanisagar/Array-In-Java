import java.util.Scanner;
public class copyEvenElementIntoNewArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int size=5,count=0;
        int[] x=new int[size];
        int j=0;

        System.out.println("takling user inputs");
        for(int i=0;i<x.length;i++)
        {
            x[i]=scn.nextInt();
        }

        
        
            for(int i:x)
            {
                if(i%2==0)
                count++;
            }
            System.out.println("total even number elements in a x[]: "+count);
        

        //creating new array
        int[] y=new int[count];

        //copying even elements of x[]---->y[]
        for(int i=0;i<x.length;i++)
        {
            if(x[i]%2==0)
            {
                y[j]=x[i];
                j++;
            
            }
        }

        System.out.println("displaying y[] elements");
        for(int i=0;i<y.length;i++)
        {
            System.out.print(y[i]+" ");
        }
    }

    
}
