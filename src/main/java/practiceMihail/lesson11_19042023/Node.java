package practiceMihail.lesson11_19042023;

public class Node {
    public Node left;
    public Node right;
    public Integer value;

    private static boolean isNodeExist(Node node){
        return node != null && node.value != null;
    }
    private static void createNode(Node node, int value){
        node.left = new Node();
        node.right = new Node();
        node.value = value;
    }
    private static Node getMin(Node node){
        if(!isNodeExist(node)){
            return null;
        }
        if(!isNodeExist(node.left)){
            return node;
        }
        return getMin(node.left);
    }
    private static Node getMax(Node node){
        if(!isNodeExist(node)){
            return null;
        }
        if(!isNodeExist(node.right)){
            return node;
        }
        return getMax(node.right);
    }
    private static Node search(Node node, int value){
        if(!isNodeExist(node)){
            return null;
        }
        if(node.value == value){
            return node;
        }
        if (value < node.value){
            return search(node.left, value);
        }
        return search(node.right, value);
    }
    private static void inOrderTraversal(Node node){
        if(!isNodeExist(node)){
            return;
        }
        inOrderTraversal(node.left);
        System.out.println("[ " + node.value + " ]");
        inOrderTraversal(node.right);
    }
    private static void postOrderTraversal(Node node){
        if(!isNodeExist(node)){
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println("[ " + node.value + " ]");
    }
    private static void directOrderTraversal(Node node){
        if(!isNodeExist(node)){
            return;
        }
        System.out.println("[ " + node.value + " ]");
        directOrderTraversal(node.left);
        directOrderTraversal(node.right);
    }
    private static int getChildrenCount(Node node){
        int count = 0;
        if(!isNodeExist(node.left)){
            count += 1;
        }
        if(!isNodeExist(node.right)){
            count += 1;
        }
        return count;
    }
    private static Node getChildNull (Node node){
        return isNodeExist(node.left) ? node.left : node.right;
    }
    private static boolean remove(Node root, int value){
        return false;
    }
    private static int getDepth(Node root){
        if (!isNodeExist(root)) {
            // Если дерево пустое, то его глубина равна 0
            return 0;
        }
        // Рекурсивно вычисляем глубину левого и правого поддеревьев
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);

        // Глубина дерева равна максимальной глубине поддеревьев плюс 1
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
