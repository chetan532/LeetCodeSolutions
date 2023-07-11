// 863. All Nodes Distance K in Binary Tree

// Given the root of a binary tree, the value of a target node target, and an integer k, return an array of the values of all nodes that have a distance k from the target node.

// You can return the answer in any order.

// Example 1:


// Input: root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, k = 2
// Output: [7,4,1]
// Explanation: The nodes that are a distance 2 from the target node (with value 5) have values 7, 4, and 1.


// Example 2:

// Input: root = [1], target = 1, k = 3
// Output: []

import java.util.*;

import javax.swing.tree.TreeNode;

class AllNodesDistanceKinBinaryTree {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> result = new ArrayList<>();
        if (k == 0) {
        result.add(target.val);
        return result;
        }
        List<TreeNode> rootToTarget = new ArrayList<>();
        rootToTarget.add(root);
        getPath(root, target, rootToTarget);
        distanceK(target, k, result);
        for (int i = rootToTarget.size() - 2; i >= 0; i--) {
        k--;
        TreeNode parent = rootToTarget.get(i);
        if (k == 0) {
            result.add(parent.val);
            break;
        }
        TreeNode child = rootToTarget.get(i + 1);
        if (child == parent.right) {
            distanceK(parent.left, k - 1, result);
        } else {
            // child == parent.left
            distanceK(parent.right, k - 1, result);
        }
    }
    return result;
  }

  private void distanceK(TreeNode node, int k, List<Integer> result) {
    if (node == null) {
      return;
    }
    if (k == 0) {
      result.add(node.val);
      return;
    }
    distanceK(node.left, k - 1, result);
    distanceK(node.right, k - 1, result);
  }

  private boolean getPath(TreeNode node, TreeNode target, List<TreeNode> rootToTarget) {
    if (node == null) {
      return false;
    }
    if (node == target) {
      return true;
    }
    rootToTarget.add(node.left);
    if (getPath(node.left, target, rootToTarget)) {
      return true;
    }
    rootToTarget.remove(rootToTarget.size() - 1);
    rootToTarget.add(node.right);
    if (getPath(node.right, target, rootToTarget)) {
      return true;
    }
    rootToTarget.remove(rootToTarget.size() - 1);
    return false;
  }
}
