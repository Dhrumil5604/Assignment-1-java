/*Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
Student Name : Trasadiya Dhrumil
Student Id : 21CE146
 */
import java.util.*;
public class truefalse {
    public static void main(String[] args)
    {
        int A , B;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int N = sc.nextInt();
        for(int i=0 ; i<N ;i++)
        {
            System.out.println("Enter the value of A :");
            A = sc.nextInt();

            System.out.println("Enter the value of B : ");
            B = sc.nextInt();
            if(A%10 == B%10)
            {
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }
        }
        System.out.println("Prepared By Trasadiya Dhrumil 21CE146");
    }

}

