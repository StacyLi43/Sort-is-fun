import java.util.*;
public class InsertionSort
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int[] theArray = new int[n];
        for(int i = 0; i < n; i++)
            theArray[i] = input.nextInt();
        for (int i = 1; i < n; i++)
        {
            for (int j = i; j > 0; j--)
            {
                if(theArray[j] < theArray[j-1])
                {
                    int tmp = theArray[j];
                    theArray[j] = theArray[j-1];
                    theArray[j-1] = tmp;
                }
            }
        }
        for (int i = 0; i < n; i++)
            System.out.print(theArray[i]+" ");
        System.out.println();
        input.close();
    }
}