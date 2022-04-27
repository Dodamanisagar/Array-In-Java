import java.util.Scanner;
public class frequencyOfEachArrayElement {
    public static void main(String[] args) {
        int size=5;
        int[] k=new int[size];

        Scanner scn=new Scanner(System.in);
        System.out.println("enter array elements");
        for(int i=0;i<k.length;i++)
        {
            k[i]=scn.nextInt();
        }
       
        
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
            System.out.println(k[j]+"is repeating "+count+" times");
        }
        
    }
    
}
