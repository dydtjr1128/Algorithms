package algorithm;

public class Solution {
    public boolean solution(int[] arr) {
        boolean answer = true;
        /*
        int sum = 0;
        int temp = 0;
        for(int i=1; i<arr.length+1; i++)
            sum+=i;
        for(int i=0; i<arr.length; i++)
            temp+=arr[i];
        answer = (sum==temp)? true : false;*/
        int count[] = new int[arr.length+1];
        
        
        for(int i=0; i<arr.length; i++){        
           if(arr[i] >arr.length){
                answer=false;
                break;
            }
            count[arr[i]]++;            
        }   
           for(int i=1; i<count.length; i++){                 
                if(count[i]!=1){
                    answer=false;
                    break;
                }
            }    
        
        return answer;
    }
}