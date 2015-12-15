package lesson10;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

// Demo code for the user implemenation of Binary search tree
public class MyBST {
	/** The tree root. */
	private BinaryNode root;

	public MyBST() {
		root = null;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order. Inorder
	 * Traversal
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	// Inorder Traversal to print the nodes in Ascending order
	private void printTree(BinaryNode t) {
		if (t != null) {
			printTree(t.left);
			System.out.print(t.element + ",");
			printTree(t.right);
		}
	}

	// Assume the data in the Node is an Integer.

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			return;
		} else {
			BinaryNode n = root;
			boolean inserted = false;

			while (!inserted)// true
			{
				if (x.compareTo(n.element) < 0) {
					// space found on the left
					if (n.left == null) {
						n.left = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				} else if (x.compareTo(n.element) > 0) {
					// space found on the right
					if (n.right == null) {
						n.right = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.right;
					}

				}
				// if a node already exists
				else {
					inserted = true;
				}

			}

		}
	}

	public void printPreorder() {
		System.out.println("-------------Pre Order--------------------");
		preOrder(root);

	}

	private void preOrder(BinaryNode t) {
		String output = "";
		if (t == null) {
			return;
		} else {
			output += t.element + " ";
			System.out.println(output);
			preOrder(t.left);
			preOrder(t.right);

		}

	}

	public void printPostorder() {
		System.out.println("---------------------Post Order--------------------");
		postOrder(root);

	}

	private void postOrder(BinaryNode t) {
		String output = "";
		if (t == null) {
			return;
		} else {

			postOrder(t.left);
			postOrder(t.right);
			output += t.element + " ";
			System.out.println(output);

		}

	}

	public boolean contains(int key) {
		if (root == null)
			return false;
		else {
			BinaryNode b = root;

			while (b != null) {
				if (b.element == key)
					return true;
				else if (key < b.element) {
					b = b.left;
				} else {
					b = b.right;
				}
			}
		}
		return false;
	}

	public BinaryNode getRoot() {
		return this.root;
	}

	public void printleafNodes() {
		System.out.println(leafNodes(root));

	}

	int leafCount = 0;

	public int leafNodes(BinaryNode t) {

		if (t == null) {
			return 0;
		} else {
			if (t.left == null && t.right == null) {
				leafCount++;
			}
			leafNodes(t.left);
			leafNodes(t.right);
			return leafCount;
		}

	}

	int size = 0;

	public int size() {
		if (root == null) {
			size = 0;
		}

		BinaryNode b = root;
		while (b != null) {
			size++;
			b = b.left;
		}

		BinaryNode c = root;
		while (c != null) {
			size++;
			c = c.left;
		}

		return size;
	}

	public boolean isLeaf() {
		if (root.left == null && root.right == null) {
			return true;
		}
		return false;

	} // check the tree is leaf or not

	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left; // Left child
		private BinaryNode right; // Right child

		// Constructors

		BinaryNode(Integer theElement) {
			this(theElement, null, null);
		}

		BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}

	}

	public static void main(String[] args) {

		MyBST binarySearch = new MyBST();
		int[] a = { 43, 15, 60, 8, 30, 50, 82, 20, 35, 70 };

		for (int i = 0; i < a.length; i++) {
			binarySearch.insert(a[i]);

		}

		binarySearch.printPreorder();
		binarySearch.printPostorder();
		System.out.println(binarySearch.contains(30));
		System.out.println(binarySearch.contains(37));
		System.out.println(binarySearch.contains(43));
		System.out.println(binarySearch.contains(20));

		System.out.println(binarySearch.getRoot().element);
		binarySearch.printleafNodes();

		TreeSet<Integer> ts = new TreeSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			ts.add(a[i]);
			System.out.println("\nAfter inserting " + i + "th item " + a[i]);
			Iterator<Integer> it = ts.iterator();
			Integer nextItem = null;
			while (it.hasNext()) {
				nextItem = it.next();
				System.out.print(nextItem + " ");
			}
			System.out.println();
		}

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(3, "Madan");
		treeMap.put(6, "Govinda!");
		treeMap.put(7, "Gunjan");
		treeMap.remove(10);
		String str = treeMap.get(6) + ", " + treeMap.get(7);
		System.out.println(str);

	}
}

/*
 * Output
 * 
 * -------------Pre Order-------------------- 43 15 8 30 20 35 60 50 82 70
 * ---------------------Post Order-------------------- 8 20 35 30 15 50 70 82 60
 * 43 true false true true 43 5
 * 
 * After inserting 0th item 43 43
 * 
 * After inserting 1th item 15 15 43
 * 
 * After inserting 2th item 60 15 43 60
 * 
 * After inserting 3th item 8 8 15 43 60
 * 
 * After inserting 4th item 30 8 15 30 43 60
 * 
 * After inserting 5th item 50 8 15 30 43 50 60
 * 
 * After inserting 6th item 82 8 15 30 43 50 60 82
 * 
 * After inserting 7th item 20 8 15 20 30 43 50 60 82
 * 
 * After inserting 8th item 35 8 15 20 30 35 43 50 60 82
 * 
 * After inserting 9th item 70 8 15 20 30 35 43 50 60 70 82 Govinda!, Gunjan
 */
