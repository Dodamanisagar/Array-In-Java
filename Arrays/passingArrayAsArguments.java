public class passingArrayAsArguments {
    public static void display(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        display(arr);
        
    }
    
}
