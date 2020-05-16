import java.util.Arrays;

class Solution {
    public int maxSubarraySumCircular(int[] A) {
        boolean a=false;
        for(int i=0;i<A.length;i++){
            //to check if all element are negetive or not
            if(A[i]>=0){
                a=true;
                break;
            }
        }
        if(a){
            for(int i=0;i<A.length;i++)
                A[i]=-A[i];
            int negetiveSum=kadane(A);
            for(int i=0;i<A.length;i++)
                A[i]=-A[i];
            /* return maximum of

                1. sum returned by Kadane's algorithm on original array.

                2. sum returned by Kadane's algorithm on modified array +
                    sum of all elements of the array.
		    */
            return maxi(kadane(A),Arrays.stream(A).sum()+negetiveSum);
        }
        else{
            // if all elements are negetive. Kadane's Algorithm doesn't work on all negetive array.
            int max = A[0];
            for(int i=1;i<A.length;i++){
                if(A[i]>max)
                    max=A[i];
            }
            return max;
        }
    }
    int maxi(int a, int b){
        if(a>b)
            return a;
        else return b;
    }
    
    // Function to find contiguous sub-array with the largest sum in given set of integers
    
    int kadane(int[] A){
        // maxSum stores maximum sum sub-array found so far
        // maxEnd stores maximum sum of sub-array ending at current position
        int maxNow=0,maxEnd=0;
        for(int i=0;i<A.length;i++){
            // update maximum sum of sub-array "ending" at index i (by adding current element to maximum sum ending at previous index i-1)
            maxNow+=A[i];
            // if maximum sum is negative, set it to 0 (which represents an empty sub-array)
            maxNow=maxi(maxNow,0);
            // update result if current sub-array sum is found to be greater
            maxEnd=maxi(maxNow,maxEnd);
        }
        return maxEnd;
    }
}
