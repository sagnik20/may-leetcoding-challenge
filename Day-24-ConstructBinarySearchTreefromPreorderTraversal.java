/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstHelper(preorder, 0, preorder.length - 1);
    }
    
    private TreeNode bstHelper(int[] arr, int st, int ed)
    {
        int val = arr[st];
        TreeNode root = new TreeNode(val);
        int i = st + 1;
        while (i <= ed && arr[i] < val)
            i++;
        if (st + 1 <= i - 1)
            root.left = bstHelper(arr, st + 1, i - 1);
        if (i <= ed)
            root.right = bstHelper(arr, i, ed);
        return root;
    }
}
