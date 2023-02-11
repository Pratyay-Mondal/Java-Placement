import java.util.Scanner;

public class DecimalToBinary {

        static int DecimalToBinaryConversion(int n){
                    
            String num = Integer.toString(n, 2); 

            int ans = Integer.valueOf(num);
            return ans;
        }
    
        
        public static void main(String[] args) {
    
            System.out.println("Enter the decimal number : ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int ans = DecimalToBinaryConversion(n);
            System.out.println("After conversion into the binary number : ");
            System.out.println(ans);
        }
    
}
