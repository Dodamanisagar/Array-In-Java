import java.util.Scanner;
public class pairsWhoesSumIsEqualToKey {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
       
        System.out.println("enter size of the array");
        int size=scn.nextInt();
        int[] f=new int[size];

        System.out.println("enter array elements");
        for(int i=0;i<size;i++)
        {
            f[i]=scn.nextInt();
        }

        System.out.println("enter key value");
        int key=scn.nextInt();

        System.out.println("pair elements whoes sum is equals to "+key);
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
                if(i!=j && f[i]+f[j]==key)
                  System.out.println(f[i]+" "+f[j]);
        }
        
    }
    
}
