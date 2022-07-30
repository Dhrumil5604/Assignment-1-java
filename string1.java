import java.util.*;

public class string1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int N = sc.nextInt();

        String[] str = new String[N] ;
        for(int i=0 ; i<N ;i++)
        {
            System.out.println("Enter the String : ");
            str[i] = sc.next();
            char  result = str[i].charAt(0);
            if(result =='o' )
            {
                System.out.print(result);
            }
            else {
                System.out.println("The printed character is not required");
            }
            char result1 = str[i].charAt(1);
            if(result1 =='z' )
            {
                System.out.println(result1);
            }
            else {
                System.out.println("The printed character is not required");
            }

    }

        }
}
