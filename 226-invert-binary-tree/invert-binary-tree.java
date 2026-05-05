class Solution {
    public TreeNode invertTree(TreeNode root) {

        if(root==null){
            return null;
        }

        TreeNode leftS=invertTree(root.left);
        TreeNode rightS=invertTree(root.right);

        root.left=rightS;
        root.right=leftS;

        return root;
        
    }
}
 

