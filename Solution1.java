import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

    public int SubArray(int[] abc) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int sum = 0;
        for (int i = 0; i <= abc.length - 1; i++) {
            int a = i;

            for (int j = i; j <= a; j++) {
                System.out.print(abc[j]);
                sum = sum + abc[j];
                if (a <=abc.length - 1) {
                    if (j == a) {
                        list.add(sum);
                        a++;
                        j = i - 1;
                        System.out.println("");
                        sum=0;
                    }
                }
                if(a == abc.length )
                {
                    j=abc.length;
                }
            }
            System.out.println("");
        }
        System.out.println(list);
        int count=0;
        for (int number : list)
        {   if(number < 0)
            {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of Array");

        int n = scan.nextInt();
        int[] abc = new int[n];

        for(int i = 0 ; i < n; i++){
            int val = scan.nextInt();
           abc[i] = val;
        }
       // int[] abc = {1,-2,4,-5,1};
        Solution1 a1 = new Solution1();
        System.out.println(a1.SubArray(abc));

    }
}
