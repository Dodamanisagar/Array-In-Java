import java.util.Scanner;
public class sumOfAllArrayElements {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int size=5,sum=0;
        int[] z=new int[size];


        System.out.println("Enter aray element");
        for(int i=0;i<z.length;i++)
        {
            z[i]=scn.nextInt();
        }

        System.out.println("dispalaying sum of all array elements");
        for(int i=0;i<z.length;i++)
        {
            sum=sum+z[i];
        }
        System.out.println(sum);
        
    }
    
}
