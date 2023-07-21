import java.util.*;


public class Palindrome {
    
    public static void main(String[] args) {
        
        System.out.println("Enter the string: ");
        Scanner sc =  new Scanner(System.in);
        String st = sc.nextLine();

        String rev = "";

        for(int i=st.length()-1; i>=0; i--){
            rev = rev + st.charAt(i);
        }
        
        if(st.equals(rev)){
            System.out.println("The string is palindrome");
        }
        else{
            System.out.println("The string is not palindrome");
        }

    }


}
