

import java.util.Collection;

public interface Tree<E> extends Collection<E> {
	/** Return true if the element is in the tree */
	public boolean search(E e);

	/** Insert element e into the binary tree
	 * Return true if the element is inserted successfully */
	public boolean insert(E e);

	/** Delete the specified element from the tree
	 * Return true if the element is deleted successfully */
	public boolean delete(E e);

	/** Get the number of nodes in the tree */
	public int getSize();

	/** Inorder traversal from the root*/
	public default void inorder() {
	}

	/** Postorder traversal from the root */
	public default void postorder() {
	}

	/** Preorder traversal from the root */
	public default void preorder() {
	}


}
