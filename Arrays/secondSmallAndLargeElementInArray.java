import java.util.*;
public class secondSmallAndLargeElementInArray {
    public static void main(String[] args) {
        int size=6;
        int[] s=new int[size];

        Scanner scn=new Scanner(System.in);
        System.out.println("enter array elements");
        for(int i=0;i<s.length;i++)
        {
            s[i]=scn.nextInt();
        }

         /*   //searching for second smallest and largest elelments in an array
             Arrays.sort(s);//sorting in increasing order
            
             System.out.println("second smallest element is= "+s[1]);
             System.out.println("second largest elelment is= "+s[s.length-2]);
         */
         
         //searchinf for first and second largest element in array 
         int larg=s[0],sLarg=0;
         for(int i=0;i<s.length;i++)
         {
             if(larg<s[i])
             {
                 sLarg=larg;
                 larg=s[i];
             }
             if(sLarg<s[i] && s[i]!=larg)
             {
                 sLarg=s[i];
             }
             
         }

         //searchinf for first and second smallest element in array 
         int small=s[0],sSmall=9;
         for(int i=0;i<s.length;i++)
         {
             if(small>s[i])
             {
                 sSmall=small;
                 small=s[i];
             }
             if(sSmall>s[i] && s[i]!=small)
             {
                 sSmall=s[i];
             }
             
         }

         System.out.println("first small element is "+small+" and "+"second smallest element is "+sSmall );
         System.out.println("first large element is "+larg+" and "+"second largest element is "+sLarg);
    }
}
