import java.util.*;

public class Fibonacci {

    static void fibonacci_series(int n){
        System.out.println("Approach 1 : ");

        int a=0, b=1;
        if(n==0)
            System.out.print(0); 
        else if(n==1){
            System.out.print(0+"  ");
            System.out.print(1);
        }
        else{
            System.out.print(0+ "  ");
            System.out.print(1+ "  ");
            for (int i = 2; i <= n ; i++) {
                System.out.print(a+b+ "  ");
                int temp=b;
                b=a+b;
                a=temp;
            }
        }
        System.out.println();
    }


    static void fibonacci_series2(int n){
        System.out.println("Approach 2 : ");

        int a=0, b=1;
        for(int i=0; i<=n; i++){
            System.out.print(a+ "  ");
            int temp = a+b;
            a=b;
            b=temp;
        }
        System.out.println();
    }


    static int nth_fibonacci_term(int n){
        if(n<=1){
            return n;
        }
        return nth_fibonacci_term(n-1) + nth_fibonacci_term(n-2);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        fibonacci_series(n);
        fibonacci_series2(n);
        
        int sum = nth_fibonacci_term(n); 
        System.out.println("The "+ n +"th fibonacci number is : "+ sum);
    }
}
