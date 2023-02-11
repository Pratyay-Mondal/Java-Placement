import java.util.Scanner;

public class Prime_No {

    static boolean isPrime(int n){

        int sum = 0;
        int i=1;
        while(n>=i){
            if(n%i == 0){
                sum+=1;
                i+=1;
            }
            else{
                i+=1;
            }
        }
        if(sum ==2 )
            return true;
        else
            return false;  
          
    }

    
    public static void main(String[] args) {

        System.out.println("Enter the number to check : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPrime(n);

        System.out.println(ans);
    }
}
