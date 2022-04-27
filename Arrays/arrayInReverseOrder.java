import java.util.Scanner; 
public class arrayInReverseOrder {
    public static void main(String[] args) {
    int size=5;
    int[] w=new int[size];
    Scanner scn=new Scanner(System.in);

    //storing user inputs intp an array
    System.out.println("enter array elements");
    for(int i=0;i<w.length;i++)
    {
        w[i]=scn.nextInt();
    }

    System.out.println("reversing the array elements"); 
    for(int i=w.length-1;i>=0;i--)
    {
        System.out.print(w[i]+" ");
    }
    }
    
}
