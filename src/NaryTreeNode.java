import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NaryTreeNode {
    public int val;
    public List<NaryTreeNode> children = new LinkedList<>();

    public NaryTreeNode() {
    }

    public NaryTreeNode(int _val) {
        val = _val;
    }

    public NaryTreeNode(int _val, List<NaryTreeNode> _children) {
        val = _val;
        children = _children;
    }

    public static NaryTreeNode stringToTreeNode(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) return null;

        String[] parts = input.split(",");
        String item = parts[0];
        NaryTreeNode root = new NaryTreeNode(Integer.parseInt(item));
        Queue<NaryTreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        int index = 2;
        while (!nodeQueue.isEmpty()) {
            NaryTreeNode node = nodeQueue.remove();
            if (index >= parts.length) break;
            item = parts[index++].trim();
            while (!item.equals("null")) {
                NaryTreeNode tmpNode = new NaryTreeNode(Integer.parseInt(item));
                node.children.add(tmpNode);
                nodeQueue.add(tmpNode);
                if (index == parts.length) break;
                item = parts[index++].trim();
            }
        }
        return root;
    }
}
