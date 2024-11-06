import java.util.*;

public class Anagram {
    
    public static void main(String[] args) {
        
        String a = "help";
        String b = "pehl";

        char[] arr1= a.toCharArray();
        char[] arr2= b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        
        if(Arrays.equals(arr1, arr2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}


