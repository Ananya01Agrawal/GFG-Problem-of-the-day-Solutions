class Tree
{
    public static float findMedian(Node root)
    {
        ArrayList<Integer> tree = new ArrayList<>(); 
        treedata(root, tree);
        int size = tree.size();
        float median = 0;

        if (size % 2 == 0) {
            median = (tree.get(size / 2 - 1) + tree.get(size / 2)) / 2.0f;
        } else {
            median = tree.get(size / 2);
        }
        return median;
    }
    public static void treedata(Node root, ArrayList<Integer> tree) {
        if (root == null) {
            return;
        }
        treedata(root.left, tree);
        tree.add(root.data);
        treedata(root.right, tree);
    }

}
