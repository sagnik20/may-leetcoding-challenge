class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int m = A.length, n = B.length, i = 0, j = 0;
        List<int[]> res = new ArrayList<>();
        
        while (i < m && j < n) {
            int[] a = A[i], b = B[j], c = intersect(a, b);            
            if (c[1] >= c[0]) res.add(c);
            if (a[1] <= c[1]) i++;
            if (b[1] <= c[1]) j++;
        }
        
        return res.toArray(new int[res.size()][2]);
    }
    
    private int[] intersect(int[] a, int[] b) {
        return new int[] {Math.max(a[0], b[0]), Math.min(a[1], b[1])};
    }
}
