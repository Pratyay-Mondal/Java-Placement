import java.util.*;


public class Recursion {
    
    // function for fibonacci number
    static int fibonacci(int n){
        if(n==0)  return 0;
        if(n==1 || n==2)  return 1;
        return fibonacci(n-1)  + fibonacci(n-2);
      }
    

      
      // function for factorial of a number
      static int fact(int n){
        if(n <= 1)
          return 1;
        else  
          return n * fact(n-1);
      }
    

      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the fibonacci index: ");
        int n1 = sc.nextInt();
        int ans1 = fibonacci(n1);
        System.out.println("Fibonacci of " + n1 + " is: " + ans1);
    
        System.out.println();

        System.out.println("Enter the number for factorial: ");
        int n2 = sc.nextInt();
        int ans2 = fact(n2);  
        System.out.println("Factorial of " + n2 + " is: " + ans2);
        
    
      }
    
}
