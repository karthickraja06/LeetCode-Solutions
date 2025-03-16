# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumNumbers(self, root: Optional[TreeNode]) -> int:
        def sumation(node, subSum):
            if not node:
                return 0
            
            subSum = subSum * 10 + node.val

            if not node.left and not node.right:
                return subSum  # Return sum for leaf node
            
            return sumation(node.left, subSum) + sumation(node.right, subSum)

        return sumation(root, 0)