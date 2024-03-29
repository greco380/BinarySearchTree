
class Node {
	int data;
	Node left;
	Node right;
	
}

class BST {
	
	public Node createNewNode(int k) {
		Node a = new Node();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;
	}
	
	public Node insert(Node node, int value) {
		if(node == null) {
			return createNewNode(value);
		}
		
		if(value < node.data) {
			node.left = insert(node.left, value);
		}
		else if(value > node.data) {
			node.right = insert(node.right, value);
		}
		else if (value == node.data) {
			return null;
		}
		
		return node;
		
	}
}

public class BinarySearchTree {
	public static void main(String[] args) {
		BST a = new BST();
		Node root = null;
		//8, 3, 6, 10, 4, 7, 1, 14, 13
		
		root = a.insert(root, 8);
		root = a.insert(root, 3);
		root = a.insert(root, 6);
		root = a.insert(root, 10);
		root = a.insert(root, 4);
		root = a.insert(root, 7);
		root = a.insert(root, 1);
		root = a.insert(root, 14);
		root = a.insert(root, 13);
	}
}
