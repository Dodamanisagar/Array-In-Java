import java.util.Scanner;
public class dubplicatElementsInArray {
    public static void main(String[] args) {
        int size=5;
        int[] b=new int[size];

        Scanner scn=new Scanner(System.in);
        System.out.println("enter the array elements");
        for(int i=0;i<b.length;i++)
        {
            b[i]=scn.nextInt();
        }

        //searching for dublicate elements in an array
        System.out.println("dublicate numbers are");
        for(int j=0;j<b.length;j++)
        {    int count=0;//must be here only  bz each time count=0 for each j value
            for(int i=0;i<b.length;i++)
            {
                if(b[j]==b[i] && i!=j)
                {
                    count++;
                    b[i]='\0';
                }
                
            }
            if(count>0 && b[j]!='\0')
            System.out.println(b[j]);
        }
    }
    
}
