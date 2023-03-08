// https://www.codingninjas.com/codestudio/problems/count-inversions_615?leftPanelTab=0
// codingninjas --- Medium

import java.util.* ;
import java.io.*; 

public class Solution {
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        int sum=0;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    sum+=1;
                }
            }
        }

        return sum;

    }
}
