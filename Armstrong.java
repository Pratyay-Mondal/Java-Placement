import java.util.Scanner;

public class Armstrong {

    static boolean isArmstrong(int n){
       
        int sum=0, temp=n, num=n;
        int count=0;
        
        while(n>0){
            n/=10;
            count+=1;
        }

        while (num>0) {
            sum += Math.pow((num%10), count);
            num/=10;
        }

        if(sum == temp )
            return true;
        else
            return false;  
    }

    
    public static void main(String[] args) {

        System.out.println("Enter the number to check for Armstrong : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isArmstrong(n);

        System.out.println(ans);
    }
}

