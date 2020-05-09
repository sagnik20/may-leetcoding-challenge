class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        float bslope=slope(coordinates[0],coordinates[1]);
        for (int i=1; i<coordinates.length-1; i++){
            int p1[] = coordinates[i];
            int p2[] = coordinates[i+1];
            if(bslope != slope(p1,p2))return false;            
        }
        return true;
    }
    float slope(int a[],int b[]){
        if(a[0]-b[0]==0)return 0;
        return ((float)(a[1]-b[1])/(a[0]-b[0]));
    }
}
