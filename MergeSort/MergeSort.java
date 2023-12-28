import java.util.*;
public class MergeSort
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int[] originalArray = new int[n];
        for (int i = 0; i < n; i++)
            originalArray[i] = input.nextInt();
        originalArray = Mergesort(originalArray);
        for (int i = 0; i < n; i++)
            System.out.print(originalArray[i]+" ");
        System.out.println();
        input.close();
    }
    public static int[] Mergesort(int[] ori)
    {
        if(ori.length == 1) return ori;
        int n = ori.length;
        int[] a,b;
        if(n % 2 == 0)
        {
            a = new int[n/2];
            b = new int[n/2];
            for (int i = 0; i < n/2; i++) a[i] = ori[i];
            for (int i = n/2; i < n; i++) b[i-n/2] = ori[i];
        }
        else
        {
            a = new int[n/2+1];
            b = new int[n/2];
            for (int i = 0; i < n/2+1; i++) a[i] = ori[i];
            for (int i = n/2+1; i < n; i++) b[i-(n/2+1)] = ori[i];
        }
        a = Mergesort(a);
        b = Mergesort(b);
        return Sorting(a,b);
    }
    public static int[] Sorting(int[] a, int[] b)
    {
        int[] c = new int[a.length+b.length];
        int aindex = 0, bindex = 0;
        boolean aLastUsed = false, bLastUsed = false;
        for (int i = 0; i < c.length; i++)
        {
            if((a[aindex] < b[bindex] && aLastUsed == false) || (bindex == b.length-1 && bLastUsed == true))
            {
                if(aindex == a.length-1) aLastUsed = true;
                c[i] = a[aindex];
                if(aindex < a.length-1) aindex++;
            }
            else if((b[bindex] <= a[aindex] && bLastUsed == false) || (aindex == a.length-1 && aLastUsed == true))
            {
                if(bindex == b.length-1) bLastUsed = true;
                c[i] = b[bindex];
                if(bindex < b.length-1) bindex++;
            }
        }
        return c;
    }
}
