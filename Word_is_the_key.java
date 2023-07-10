import java.util.*;


public class Word_is_the_key {
  
    public static void main(String[] args) {

        String[] arr = {"break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map", "range", "return", "struct", "type", "var"};

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count=0;

        for (int i = 0; i < 16; i++) {
            if(s.equals(arr[i])){
                count++;
                break; // time saving as it will not search any other items
            }
        }

        if(count == 0){
            System.out.println(s + " is not a keyword");
        }
        else{
            System.out.println(s + " is a keyword");
        }

    }

}
