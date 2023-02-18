class GfG
{
    int maxLen(int arr[], int n)
    {               
        int sum = 0;
        int maxLen = 0;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(sum==0){
                maxLen = i+1;
            }
            else{
                if(map.containsKey(sum)){
                    maxLen = Math.max(maxLen, i-map.get(sum));
                }
                else{
                    map.put(sum, i);
                }
            }
        }
       return maxLen; 
        
    }                                    
  } 
