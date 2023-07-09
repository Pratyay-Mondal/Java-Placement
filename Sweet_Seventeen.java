import java.util.*;


public class Sweet_Seventeen {

    public static void main(String[] args) {
        
        HashMap<Character, Integer> hm = new HashMap<>();

        hm.put('A', 10);
        hm.put('B', 11);
        hm.put('C', 12);
        hm.put('D', 13);
        hm.put('E', 14);
        hm.put('F', 15);
        hm.put('G', 16);
        
        hm.put('a', 10);
        hm.put('b', 11);
        hm.put('c', 12);
        hm.put('d', 13);
        hm.put('e', 14);
        hm.put('f', 15);
        hm.put('g', 16);


        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        long num=0; int k = 0;


        for (int i = s.length()-1; i>=0 ; i--) {

            if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z')){
                num = num + hm.get(s.charAt(i)) * (int)Math.pow(17, k++);
            }
            else{
                num = num + (s.charAt(i)-'0') * (int)Math.pow(17, k++);
            }

        }
        System.out.println(num);

    }
}
