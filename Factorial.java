import java.util.*;

public class Factorial {

    static int factorial(int n){
        int sum=1;
        if(n==0) 
            return sum;
        for(int i=n; i>=1; i--){
            sum *= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println("Factorial of "+n+" is : "+ans);

    }
}