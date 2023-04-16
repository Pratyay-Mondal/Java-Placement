import java.util.*;

public class Pattern1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();

        System.out.println("");


        System.out.println("*");
        
        for (int i = 1; i <= n/2; i++) {
            System.out.print("*");
            for (int j = 0; j < i*2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        for (int i = n/2-1; i > 0; i--) {
            System.out.print("*");
            for (int j = 0; j < i*2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        System.out.println("*");
        
    }  


}
