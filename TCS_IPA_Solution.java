import java.util.*;

class Team{
    
    int id;
    String name;
    String location;
    int runs;
    int wickets;
    
    
    public Team(int id, String name, String location, int runs, int wickets){
        this.id=id;
        this.name=name;
        this.location=location;
        this.runs=runs;
        this.wickets=wickets;
        
    }
}   


class Solution{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Team arr[] = new Team[3];
        
        
        for(int i=0; i<3; i++){
            int a = sc.nextInt();
            sc.nextLine();
            String b= sc.nextLine();
            String c= sc.nextLine();
            int d = sc.nextInt();
            int e = sc.nextInt();
            sc.nextLine();
        
        
            arr[i] = new Team(a,b,c,d,e);
        }
        
        String str = sc.nextLine();
        int val = sc.nextInt();
        sc.nextLine();
        
        int sum = highRuns(arr, str, val);
        
        if(sum>0){
            System.out.println(sum);
        }
        else{
            System.out.println("NA");
        }
    }
    
    
    
    public static int highRuns(Team arr[], String str, int val){
        int temp=0;
        int res=0;
        
        for(int i=0; i<3; i++){
            if(arr[i].location.equals(str) && arr[i].wickets>val){
                temp = arr[i].runs;
                if(temp>res){
                    res = temp;
                }
            }
        }
        
        return res;
    }
    
    
    
    
}

