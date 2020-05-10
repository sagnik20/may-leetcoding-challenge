/*
class Solution {

    //Approach1  -  fails when num = 2147483647
    public boolean isPerfectSquare(int num) {
        for (int s=0,i=1;s<num;i+=2){
            s+=i;
            if(s==num)
                return true;
        }
        return false;
    }
    
    //Approach2  -  fails when num = 2147483647
     public boolean isPerfectSquare(int num) {
        for (int i=1;i*i<=num;i+=1){
            if((num%i==0)&&(num/i==i))  //if(i*i==num)
                return true;
        }
        return false;
    }
    
    //Approach3  -  fails when num = 2147483647
    public boolean isPerfectSquare(int num) {
        for (int i=1;i*i<=num;i+=1){
            if(i*i==num)
                return true;
        }
        return false;
    }
    //Approach4  -  runtime on leetcode is 0ms
     public boolean isPerfectSquare(int num) {
        long a = num;
        while(a*a>num)
            a=(a+num/a)/2;
        return a*a==num;
    }
}
*/

class Solution {
    //Approach5  -  BinarySearch Approach  -  runtime on leetcode is 0ms
    public boolean isPerfectSquare(int num) {
            long left = 1,right = (long)Integer.MAX_VALUE,mid,sqrMid;
            while (left <= right){
                mid = (left + right) / 2;
                sqrMid = mid * mid;
                if (sqrMid == num) 
                    return true;
                else if (sqrMid > num) 
                    right = mid - 1;
                else left = mid + 1;
            }

            return false;
    }
}
