public class S558 {
    public QuadTreeNode intersect(QuadTreeNode quadTree1, QuadTreeNode quadTree2) {
        if (quadTree1.isLeaf) {
            if (quadTree1.val) return new QuadTreeNode(true, true);
            return new QuadTreeNode(quadTree2.val, quadTree2.isLeaf, quadTree2.topLeft, quadTree2.topRight, quadTree2.bottomLeft, quadTree2.bottomRight);
        }
        if (quadTree2.isLeaf) return intersect(quadTree2, quadTree1);
        QuadTreeNode o1 = intersect(quadTree1.topLeft, quadTree2.topLeft);
        QuadTreeNode o2 = intersect(quadTree1.topRight, quadTree2.topRight);
        QuadTreeNode o3 = intersect(quadTree1.bottomLeft, quadTree2.bottomLeft);
        QuadTreeNode o4 = intersect(quadTree1.bottomRight, quadTree2.bottomRight);
        if (o1.isLeaf && o2.isLeaf && o3.isLeaf && o4.isLeaf && o1.val == o2.val && o1.val == o3.val && o1.val == o4.val) {
            return new QuadTreeNode(o1.val, true);
        }
        return new QuadTreeNode(false, false, o1, o2, o3, o4);
    }
}
