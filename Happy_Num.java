
class Solution {
    public boolean isHappy(int n) {
      
        HashSet<Integer> set = new HashSet<>();
        set.add(n);

        while(n != 1){
            int res=0;
            while(n > 0){
                res += Math.pow((n%10), 2);
                n /= 10;
            }
            
            if(set.contains(res)){
                return false;
            }
          
            set.add(res);
            n = res;
        }
        return true;
    }
}
