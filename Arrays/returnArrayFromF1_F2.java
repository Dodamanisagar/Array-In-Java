public class returnArrayFromF1_F2 {

    public static int[] display()
    {
        int arr[]={10,20,30,40,50,60,70};
        return arr;
    }
    public static void main(String[] args) {
        int arr[]=display();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
