public class FindMaxMin {
    public int findMax(Node root) {
    if (root == null) {
        return 0;  // agar tree empty hai
    }

    // left subtree ka maximum
    int leftMax = findMax(root.left);

    // right subtree ka maximum
    int rightMax = findMax(root.right);

    // root ka data, leftMax aur rightMax me se sabse bada
    int maxValue = Math.max(root.data, Math.max(leftMax, rightMax));

    return maxValue;
}
public int findMin(Node root) {
    if (root == null) {
        return 0;  // agar tree empty hai
    }

    // left subtree ka minimum
    int leftMin = findMin(root.left);

    // right subtree ka minimum
    int rightMin = findMin(root.right);

    // root ka data, leftMin aur rightMin me se sabse chhota
    int minValue = Math.min(root.data, Math.min(leftMin, rightMin));

    return minValue;
}

}
