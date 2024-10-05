class Solution {
  public int maxDepth(Treenode root) {

    if(root == null) return 0;

    int maxLeft = maxDepth(root.left);
    int maxRight = maxDepth(root.right);

    return (Math.max(maxLeft, maxRight) + 1);
  }
}
