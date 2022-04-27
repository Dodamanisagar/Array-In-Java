import java.util.Scanner;
public class linearSearching {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("enter array size");
        int size=scn.nextInt();
        int[] s=new int[size];

        System.out.println("enter array elements");
        for(int i=0;i<s.length;i++)
        {
            s[i]=scn.nextInt();
        }

        System.out.println("enter key value");
        int key=scn.nextInt();

        boolean flag=false;
        int i;
        for(i=0;i<s.length;i++)
        {
            if(key==s[i])
            {
                flag=true;
                break;
            }
           
        }
        if(flag)
        {
         System.out.println(key+" is present at index value "+i);
         }
         else
         {
             System.out.println(key+" is not present in this array");
         }
        
    }
    
}
