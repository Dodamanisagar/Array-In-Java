import java.util.Scanner;
public class sumOfArrayElementAtOddIndex {
    public static void main(String[] args) {
        int size=5,sum=0;
        int[] s=new int[size];

        Scanner scn=new Scanner(System.in);

        System.out.println("enter array elements");
        for(int i=0;i<s.length;i++)
        {
            s[i]=scn.nextInt();
        }
        
        System.out.println("sum of aray elements present at odd index");
        for(int i=1;i<s.length;i+=2)
        {
            sum=sum+s[i];
        }
        System.out.println(sum);
    }
    
}
