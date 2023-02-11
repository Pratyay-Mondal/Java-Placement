import java.util.Scanner;

public class BinaryToDecimal {
    
    static int BinaryToDecimalConversion(int n){
       
        String num = String.valueOf(n);

        int ans = Integer.parseInt(num, 2); 
        return ans;
    }

    
    public static void main(String[] args) {

        System.out.println("Enter the binary number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = BinaryToDecimalConversion(n);
        System.out.println("After conversion into the decimal number : ");
        System.out.println(ans);
    }

}
