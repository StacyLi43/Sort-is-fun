import java.util.*;
public class SelectionSort
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int[] theArray = new int[n];
        for(int i = 0; i < n; i++)
            theArray[i] = input.nextInt();
        Selectionsort(theArray);
        for(int i = 0; i < n; i++)
            System.out.print(theArray[i]+" ");
        System.out.println();
        input.close();
    }
    public static void Selectionsort(int[] theArray)
    {
        for(int i = 0; i < theArray.length; i++)
        {
            int currentmin = theArray[i];
            int itspos = i;
            for(int j = i; j < theArray.length; j++)
                if(theArray[j] < currentmin)
                {
                    currentmin = theArray[j];
                    itspos = j;
                }
            int tmp = theArray[i];
            theArray[i] = currentmin;
            theArray[itspos] = tmp;
        }
    }
}
