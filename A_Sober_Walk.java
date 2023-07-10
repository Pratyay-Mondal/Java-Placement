import java.util.*;


public class A_Sober_Walk {
  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();

        char c = 'R';
        int x = 0, y = 0;

        while(n>0){
            switch(c){
                case 'R':
                    x=Math.abs(x)+10;
                    y=Math.abs(y);
                    c='U';
                    break;

                case 'U':
                    y=y+20;
                    c='L';
                    break;    
            
                case 'L':
                    x=x-30;
                    c='D';
                    break;

                case 'D':
                    y=y-40;
                    c='R';
                    break;
            
                }
            n--;
        }

        System.out.println(x+" "+y);

    }

}
