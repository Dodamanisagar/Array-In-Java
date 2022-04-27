import java.util.Scanner;
public class copyOneArrayElementToAnother {
    public static void main(String[] args) {
        int size=5;
        int[] a=new int[size];
        Scanner scn=new Scanner(System.in);

        System.out.println("taking user input as a array elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=scn.nextInt();
        }

        //creating new array
        int[] arrN=new int[a.length];

        //copying a[]---->arrN[]
        for(int i=0;i<a.length;i++)
        {
            arrN[i]=a[i];
        }

        System.out.println("displaying arrN[] elements");
        for(int i=0;i<arrN.length;i++)
        {
            System.out.print(arrN[i]+" ");
        }

        
    }
    
}
