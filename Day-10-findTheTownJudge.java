/*
class Solution {
    //We only need to count indegree and outdegree of each node. then indegree-outdegree=N-1
    public int findJudge(int N, int[][] trust) {
        int[] count = new int[N+1];
        for (int[] t: trust) {
            count[t[0]]--;//out
            count[t[1]]++;//in
        }
        for (int i = 1; i <= N; ++i) {
            if (count[i] == N - 1) return i;
        }
        return -1;
    }
}
*/

class Solution {
    /*
    The graphical approach. Construct a directed graph and find the node of the graph, whose in degree is N-1 and out degree is 0.
    */
    public int findJudge(int N, int[][] trust) {
        boolean[][] mark = new boolean[N][N];
        for (int i = 0; i != trust.length; i++) {
            mark[trust[i][0] - 1][trust[i][1] - 1] = true;
        }
        for (int i = 0; i != mark[0].length; ++i) {
            int cnt = 0;
            for (int j = 0; j < mark.length; j++) {
                cnt = mark[j][i] ? cnt + 1 : cnt;
            }
            if (cnt == N - 1) {
                boolean get = true;
                for (int k = 0; k != mark.length; k++) {
                    if (mark[i][k]) {
                        get = false;
                        break;
                    }
                }
                if (get) {
                    return i + 1;
                }
            }
        }
        
        return -1;
    }
}
