package examples;

import java.util.Map;
import java.util.HashMap;

/**
 * This class implements the NODE class from the file node.e in the Eiffel project AutoProof
 *
 * @author Facundo Molina (with modifications by N. Aguirre)
 */
public class DoublyLinkedListNode {

    //instrumentation
    private static Map<Integer, HashMap<String, Object>> instrMap = new HashMap<Integer, HashMap<String, Object>>();

    //instrumentation
    private static int jjj = 0;

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
        if (!((this == this.left.right) && (this.left == this.left.left.right) && (this.left == this.left.right.left) && (this.left == this.right.left.left) && (this.left.right == this.right.left) && (this.left.right.right == this.right) && (this.right == this.right.left.right) && (this.right == this.right.right.left) && (this.left != null) && (this.left.left != null) && (this.left.left.left != null) && (this.left.left.right != null) && (this.left.right != null) && (this.left.right.left != null) && (this.left.right.right != null) && (this.right != null) && (this.right.left != null) && (this.right.left.left != null) && (this.right.left.right != null) && (this.right.right != null) && (this.right.right.left != null) && (this.right.right.right != null))) {
            //instrumentation
            return;
        }
        // require
        // left_wrapped: left.is_wrapped
        // right_wrapped: right.is_wrapped
        // modify (Current, left, right)
        Object old_this = this;
        Object old_this_left = this.right.left;
        Object old_this_right = this.left.right;
        DoublyLinkedListNode l = left;
        DoublyLinkedListNode r = right;
        setLeft(this);
        setRight(this);
        l.setRight(r);
        r.setLeft(l);
        //instrumentation
        HashMap<String, Object> map0 = new HashMap<String, Object>();
        //instrumentation
        map0.put("assert_result0", ((this.left == this.left.left) && (this.left == this.left.left.left) && (this.left == this.left.left.right) && (this.left == this.left.right) && (this.left == this.left.right.left) && (this.left == this.left.right.right) && (this.left == this.right) && (this.left == this.right.left) && (this.left == this.right.left.left) && (this.left == this.right.left.right) && (this.left == this.right.right) && (this.left == this.right.right.left) && (this.left == this.right.right.right) && (this.left == old_this) && (this.left == old_this_right) && (this.left == old_this_left) && (this.left != null) && (this.left.left != null) && (this.left.left.left != null) && (this.left.left.right != null) && (this.left.right != null) && (this.left.right.left != null) && (this.left.right.right != null) && (this.right != null) && (this.right.left != null) && (this.right.left.left != null) && (this.right.left.right != null) && (this.right.right != null) && (this.right.right.left != null) && (this.right.right.right != null)));
        //instrumentation
        map0.put("r", r);
        //instrumentation
        map0.put("l", l);
        //instrumentation
        map0.put("old_this_right", old_this_right);
        //instrumentation
        map0.put("old_this_left", old_this_left);
        //instrumentation
        map0.put("old_this", old_this);
        //instrumentation
        map0.put("this.right", this.right);
        //instrumentation
        map0.put("this.left", this.left);
        //instrumentation
        instrMap.put(jjj, map0);
        //instrumentation
        jjj = jjj + 1;
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
