import java.util.*;

public class Prime {
    
    static boolean isPrime(int n){
        if(n==0 || n==1) return false;

        int sum=0;
        for(int i=2; i<=n/2; i++){
            if(n%i == 0){
                sum += 1;
            }
        }
        return sum==0 ? true : false;
    }


    public static void main(String[] args) {
        
        System.out.println("Enter the number to check whether it is prime or not : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
        
        int n1, n2;
        System.out.println("Enter the range for prime numbers : ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        
        System.out.println("In between "+n1+ " and "+n2+" prime numbers are : ");
        for (int i = n1; i <= n2; i++) {
            if(isPrime(i)){
                System.out.print(i+ "  ");
            }
        }
        System.out.println();
    }
}