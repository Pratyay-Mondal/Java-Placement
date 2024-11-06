import java.util.*;

class Team{
    
    int id;
    String nm;
    String loc;
    int runs;
    int wkt;
    
    public Team(int id, String nm, String loc, int runs, int wkt){
        this.id = id;
        this.nm = nm;
        this.loc = loc;
        this.runs = runs;
        this.wkt = wkt;
    }
}    
    
    
class Solution{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Team arr[] = new Team[3];
        
        
        for(int i=0; i<3; i++){
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();
            int e = sc.nextInt();
            sc.nextLine();
            
            arr[i] = new Team(a, b, c, d, e);
        }
        
        
        String str = sc.nextLine();  
        int n = sc.nextInt();
        sc.nextLine();
        int res = hRuns(arr, str, n);
        
        if(res>0){
            System.out.println(res);
        }
        else{
            System.out.println("No any resort");
        }
        
        //System.out.println("Hey! there, I am Brie.");
        
    }
    
    
    public static int hRuns(Team arr[], String str, int n){
        int sum=0;
        int temp=0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].loc.equalsIgnoreCase(str) && arr[i].wkt > n){
                temp = arr[i].runs;
                if(temp > sum){
                    sum = temp;
                }
            }
        }
        return sum;
    }
    
    
} 
















