import java.util.*;

/*
 * Binary search tree,
 * 	a tree with extra properties
 */
public class Tree<T extends Comparable<T>> {

	private static class Node<T> {
		private T element;
		private Node<T> left;
		private Node<T> right;
		/* 
		 * For an arbitrary number of Nodes:
		 * 		private List<Node<T>> children;
		 */

		
		public Node(T value, Node<T> left, Node<T> right) {
			element = value;
			this.left  = left;
			this.right = right;
		}
		
	}
	
	private Node<T> root;
	
	public Tree() { root = null; }
	
    public int size() {

        List<Node<T>> pending = new LinkedList<Node<T>>();
        pending.add(root);
        int size = 0;

        while (pending.size() != 0) {

            Node<T> cur = pending.remove(0);
            if (cur.left != null) { pending.add(cur.left); }
            if (cur.right != null) { pending.add(cur.right); }
            size += 1;
        
        }
        return size;
    }
            
    public void printInorder() {

        List<Node<T>> printList = new LinkedList<Node<T>>();
        printList.add(root);

        while (printList.size() != 0) {

            Node<T> cur = printList.remove(0);
            if (cur.left != null) { printList.add(cur.left); }
            if (cur.right != null) { printList.add(cur.right); }
            System.out.println(cur.element);

        }
        return;
    }


}
