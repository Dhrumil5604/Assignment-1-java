/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
Prepared By : Trasadiya Dhrumil
Student ID : 21CE146
 */
import java.util.Scanner;
public class pr_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number  : " );
        int N = sc.nextInt();
        int[] array123 = new int[N];
        int temp = 0 ;
        for(int i = 0 ; i<N ; i++)
        {
            array123[i] = sc.nextInt();
        }
        for(int i=0 ;i<N-2 ; i++)
        {
            if(array123[i] == 1 && array123[i+1]==2 && array123[i+2]==3 )
            {
                 temp = 1;
            }

        }
        if(temp==1)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        System.out.println("Prepared By Trasadiya Dhrumil 21CE146");
    }
}