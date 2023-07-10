// 111. Minimum Depth of Binary Tree

// Given a binary tree, find its minimum depth.

// The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

// Note: A leaf is a node with no children.

 

// Example 1:


// Input: root = [3,9,20,null,null,15,7]
// Output: 2
// Example 2:

// Input: root = [2,null,3,null,4,null,5,null,6]
// Output: 5

import java.util.*;

import javax.swing.tree.TreeNode;


class MinimumDepthofBinaryTree {
    
    public int minDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 1;
        int size = 0;
        TreeNode removed;
        while (!queue.isEmpty()){
            size = queue.size();
            for(int i = 0;i<size;i++){
                removed = queue.remove();
                if(removed==null)continue;
                if(removed.left==null && removed.right==null) return depth;
                queue.add(removed.left);
                queue.add(removed.right);
            }
            depth++;
        }
        return 0;
    }

}
