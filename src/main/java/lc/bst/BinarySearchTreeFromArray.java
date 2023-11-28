package lc.bst;

public class BinarySearchTreeFromArray {
    public TreeNode arrayToBST(Integer[] nums) {
        if (nums == null || nums.length == 0 || nums[0] == null) {
            return null;
        }
        return constructTree(nums, 0);
    }

    private TreeNode constructTree(Integer[] nums, int index) {
        TreeNode root = null;
        if (index < nums.length && nums[index] != null) {
            root = new TreeNode(nums[index]);
            root.left = constructTree(nums, 2 * index + 1);
            root.right = constructTree(nums, 2 * index + 2);
        }
        return root;
    }

    public static void main(String[] args) {
        BinarySearchTreeFromArray solution = new BinarySearchTreeFromArray();
        Integer[] inputArray = {3, 9, 20, null, null, 15, 7};
        TreeNode root = solution.arrayToBST(inputArray);
    }
}
