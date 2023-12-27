import java.util.*;
public class BubbleSort
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int[] a = new int[n];
        for(int i = 1; i < n; i++)
            a[i] = input.nextInt();
        for(int i = 1; i < n; i++)
        {
            for (int j = 0; j < n-1; j++)
            {
                if(a[j] > a[j+1])
                {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < n; i++)
            System.out.print(a[i]+" ");
        System.out.println();
        input.close();
    }
}
            