import java.util.Scanner;
public class linearSearchingOf2ndOccurance {
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

        int i,count=0;
        for(i=0;i<s.length;i++)
        {
            if(key==s[i])
            {
                count++;
                if(count==2)
                break;
            }
           
        }
            if(count==2)
            {
              System.out.println(key+" at 2nd occurance is present at index value "+i);
            }
            else
            {
             System.out.println(key+" is not present in this array");
            }
    }
}
