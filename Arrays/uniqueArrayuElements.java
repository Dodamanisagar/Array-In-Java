import java.util.Scanner;
public class uniqueArrayuElements {
    public static void main(String[] args) {
        int size=5;
        int[] k=new int[size];

        Scanner scn=new Scanner(System.in);
        System.out.println("enter array elements");
        for(int i=0;i<k.length;i++)
        {
            k[i]=scn.nextInt();
        }
       
        System.out.println("unique array elements is/are");
        for(int j=0;j<k.length;j++)
        {
            int count=0;
            for(int i=0;i<k.length;i++)
            {
                if(k[j]==k[i])
                {
                    count++;
                }
                
            }
                if(count==1)
                System.out.println(k[j]);
            
        }
        
    }
    
}
