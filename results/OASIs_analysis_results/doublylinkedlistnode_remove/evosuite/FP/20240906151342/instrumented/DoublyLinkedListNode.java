package examples;

/**
 * This class implements the NODE class from the file node.e in the Eiffel project AutoProof
 *
 * @author Facundo Molina (with modifications by N. Aguirre)
 */
public class DoublyLinkedListNode {

    /**
     * Left neighbour
     */
    private DoublyLinkedListNode left;

    /**
     * Right neighbour
     */
    // -- Right neighbor.
    private DoublyLinkedListNode right;

    /**
     * Creates a singleton node.
     */
    public  DoublyLinkedListNode() {
        left = this;
        right = this;
    }

    /**
     * Inserts node `n' to the right of the current node.
     */
    public void insertRight(DoublyLinkedListNode n) {
        // modify (Current, right, n)
        if (n == null)
            throw new IllegalArgumentException("undefined for null parameter");
        if (n.left != n)
            throw new IllegalArgumentException("parameter is not singleton");
        DoublyLinkedListNode r = right;
        n.setRight(r);
        n.setLeft(this);
        r.setLeft(n);
        setRight(n);
    // ensure
    // n_left_set: right = n
    // n_right_set: n.right = old right
    }

    /**
     * Removes the current node from the list.
     */
    public void remove() {
        //invalid pre: (this.left == this.right.right) && (this.left.left == this.right) && (this.left.left.left == this.left.right) && (this.left.right == this.right.right.right) && 
        if (!((this == this.left.right) && (this.left == this.left.left.right) && (this.left == this.left.right.left) && (this.left == this.right.left.left) && (this.left.right == this.right.left) && (this.left.right.right == this.right) && (this.right == this.right.left.right) && (this.right == this.right.right.left) && (this != null) && (this.left != null) && (this.left.right != null) && (this.right != null) && (this.left != null) && (this.left.left != null) && (this.left.left.left != null) && (this.left.left.right != null) && (this.left.right != null) && (this.left.right.left != null) && (this.left.right.right != null) && (this.right != null) && (this.right.left != null) && (this.right.left.left != null) && (this.right.left.right != null) && (this.right.right != null) && (this.right.right.left != null) && (this.right.right.right != null))) {
            return;
        }
        // require
        // left_wrapped: left.is_wrapped
        // right_wrapped: right.is_wrapped
        // modify (Current, left, right)
        Object old_this_right_1 = this.right.right.right;
        Object old_this = this;
        Object old_this_left_1 = this.right.left;
        Object old_this_left = this.left.left.left;
        Object old_this_right = this.left.right;
        DoublyLinkedListNode l = left;
        DoublyLinkedListNode r = right;
        setLeft(this);
        setRight(this);
        l.setRight(r);
        r.setLeft(l);
        if (!(((this.left == this.left.left) && (this.left == this.left.left.left) && (this.left == this.left.left.right) && (this.left == this.left.right) && (this.left == this.left.right.left) && (this.left == this.left.right.right) && (this.left == this.right) && (this.left == this.right.left) && (this.left == this.right.left.left) && (this.left == this.right.left.right) && (this.left == this.right.right) && (this.left == this.right.right.left) && (this.left == this.right.right.right) && (this.left == old_this) && (this.left == old_this_left) && (this.left == old_this_right) && (this.left == old_this_left_1) && (this.left == old_this_right_1) && (this.left != null) && (this.left != null) && (this.left.left != null) && (this.left.left.left != null) && (this.left.left.right != null) && (this.left.right != null) && (this.left.right.left != null) && (this.left.right.right != null) && (this.right != null) && (this.right.left != null) && (this.right.left.left != null) && (this.right.left.right != null) && (this.right.right != null) && (this.right.right.left != null) && (this.right.right.right != null)))) {
            int mm = 2;
            assert (3 > mm);
        }
    // ensure
    // singleton: right = Current
    // old_left_wrapped: (old left).is_wrapped
    // old_right_wrapped: (old right).is_wrapped
    // neighbors_connected: (old left).right = old right
    }

    /**
     * Sets left neighbor to `n'.
     */
    private void setLeft(DoublyLinkedListNode n) {
        left = n;
    }

    /**
     * Sets right neighbour to `n'.
     */
    private void setRight(DoublyLinkedListNode n) {
        right = n;
    }
}
