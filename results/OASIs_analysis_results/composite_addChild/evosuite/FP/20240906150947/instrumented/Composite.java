package examples;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;

/**
 * This class implements the COMPOSITE class from the file composite.e in the Eiffel project
 * AutoProof
 *
 * @author Facundo Molina (with modifications by N. Aguirre)
 */
public class Composite {

    /**
     * List of child nodes
     */
    private List<Composite> children;

    /**
     * Parent node
     */
    private Composite parent;

    /**
     * Value of the node
     */
    private int value;

    /**
     * Initial value (at node creation)
     */
    private int init_value;

    /**
     * set of ancestor nodes (transitive closure of parent)
     */
    private Set<Composite> ancestors;

    /**
     * Node from the set of children with max value greater than init_value (null otherwise)
     */
    private Composite max_child;

    /**
     * Creates a singleton node with initial value `v'
     */
    public  Composite(int v) {
        children = new LinkedList<Composite>();
        init_value = v;
        value = v;
        ancestors = new HashSet<Composite>();
    }

    /**
     * Set of child nodes.
     */
    public Set<Composite> children() {
        if (children == null)
            throw new IllegalStateException();
        Set<Composite> output = new HashSet<Composite>();
        output.addAll(children);
        return output;
    }

    /**
     * Adds c to children.
     */
    public void addChild(Composite c) {
        //invalid pre: (this == this.parent.max_child) && (this.children == this.parent.max_child.children) && (this.parent.parent == this.max_child) && (this.parent.value == this.value) && (this.value == this.init_value) && (this.max_child == c.parent) && (daikon.Quant.pairwiseEqual(daikon.Quant.typeArray(this.children), new String[] {  })) && (daikon.Quant.pairwiseEqual(daikon.Quant.typeArray(this.parent.children), new String[] { "examples.Composite" })) && (this.parent.parent == null) && (this.parent.value == 0) && (this.parent.init_value == -2210) && (this.parent.max_child != null) && (daikon.Quant.pairwiseEqual(daikon.Quant.typeArray(this.parent.max_child.children), new String[] {  })) && (this.max_child == null) && (daikon.Quant.size(this.parent.children) == 1) && (this.parent == this.parent.parent.max_child) && (this.parent.parent == this.max_child.max_child) && (this.parent.parent.value == this.parent.value) && (this.parent.parent.value == this.parent.init_value) && (this.parent.value == this.max_child.value) && (this.parent.value == this.max_child.init_value) && (this.parent.max_child == this.max_child.parent.max_child) && (this.parent.max_child.children == this.max_child.children) && (this.parent.max_child.parent == this.max_child.parent) && (this.parent.max_child.value == this.value) && (this.parent.max_child.value == this.max_child.value) && (this.parent.max_child.value == this.max_child.init_value) && (this.parent.max_child.ancestors == this.max_child.ancestors) && (this.value == this.max_child.init_value) && (this.max_child == this.max_child.max_child.parent) && (this.max_child.parent.max_child == this.max_child.max_child.parent) && (this.max_child.value == this.max_child.max_child.value) && (daikon.Quant.pairwiseEqual(daikon.Quant.typeArray(this.children), new String[] {  }) || daikon.Quant.pairwiseEqual(daikon.Quant.typeArray(this.children), new String[] { "examples.Composite" })) && (daikon.Quant.pairwiseEqual(daikon.Quant.typeArray(this.parent.children), new String[] {  }) || daikon.Quant.pairwiseEqual(daikon.Quant.typeArray(this.parent.children), new String[] { "examples.Composite" })) && (daikon.Quant.pairwiseEqual(daikon.Quant.typeArray(this.parent.parent.children), new String[] { "examples.Composite" })) && (this.parent.parent.parent == null) && (this.parent.parent.value == 0) && (this.parent.parent.init_value == -2210) && (this.parent.value <= 1) && (daikon.Quant.pairwiseEqual(daikon.Quant.typeArray(this.parent.max_child.children), new String[] {  }) || daikon.Quant.pairwiseEqual(daikon.Quant.typeArray(this.parent.max_child.children), new String[] { "examples.Composite" })) && (this.parent.max_child.value == 0 || this.parent.max_child.value == 1) && (this.value <= 1) && (this.init_value <= 1) && (daikon.Quant.pairwiseEqual(daikon.Quant.typeArray(this.max_child.children), new String[] {  }) || daikon.Quant.pairwiseEqual(daikon.Quant.typeArray(this.max_child.children), new String[] { "examples.Composite" })) && (daikon.Quant.pairwiseEqual(daikon.Quant.typeArray(this.max_child.parent.children), new String[] { "examples.Composite" })) && (this.max_child.parent.init_value == -2210 || this.max_child.parent.init_value == 0) && (this.max_child.value == 0 || this.max_child.value == 1) && (this.max_child.init_value == 0 || this.max_child.init_value == 1) && (daikon.Quant.pairwiseEqual(daikon.Quant.typeArray(this.max_child.max_child.children), new String[] {  })) && (this.max_child.max_child.value == 1) && (daikon.Quant.size(this.children) == 0 || daikon.Quant.size(this.children) == 1) && (daikon.Quant.size(this.parent.children) == 0 || daikon.Quant.size(this.parent.children) == 1) && (daikon.Quant.size(this.parent.parent.children) == 1) && (daikon.Quant.size(this.parent.max_child.children) == 0 || daikon.Quant.size(this.parent.max_child.children) == 1) && (daikon.Quant.size(this.max_child.children) == 0 || daikon.Quant.size(this.max_child.children) == 1) && (daikon.Quant.size(this.max_child.parent.children) == 1) && (daikon.Quant.memberOf(this.max_child.max_child.children.getClass().getName() , daikon.Quant.typeArray(this.parent.children) )) && (daikon.Quant.memberOf(this.max_child.max_child.ancestors.getClass().getName() , daikon.Quant.typeArray(this.parent.children) )) && (daikon.Quant.memberOf(this.parent.children.getClass().getName() , daikon.Quant.typeArray(this.max_child.max_child.children) )) && (daikon.Quant.memberOf(this.parent.ancestors.getClass().getName() , daikon.Quant.typeArray(this.max_child.max_child.children) )) && (daikon.Quant.memberOf(this.max_child.max_child.children.getClass().getName() , daikon.Quant.typeArray(this.parent.max_child.children) )) && (daikon.Quant.memberOf(this.max_child.max_child.ancestors.getClass().getName() , daikon.Quant.typeArray(this.parent.max_child.children) )) && (daikon.Quant.memberOf(this.parent.max_child.children.getClass().getName() , daikon.Quant.typeArray(this.max_child.max_child.children) )) && (daikon.Quant.memberOf(this.parent.max_child.ancestors.getClass().getName() , daikon.Quant.typeArray(this.max_child.max_child.children) )) && (this.max_child.init_value == this.value*this.value) && (this.value == this.max_child.init_value*this.max_child.init_value) && (this.parent.parent.max_child != null) && 
        if (!((this.children.getClass().getName() == c.children.getClass().getName()) && (this.parent == this.parent.max_child.parent) && (this.parent.max_child.ancestors == this.ancestors) && (this.ancestors.getClass().getName() == c.ancestors.getClass().getName()) && (c.value == c.init_value) && (this.parent.children != null) && (this.parent.ancestors != null) && (this.parent.max_child.children != null) && (this.parent.max_child.parent != null) && (this.parent.max_child.ancestors != null) && (this.parent.max_child.max_child == null) && (pairwiseEqual(typeArray(c.children), new String[] {})) && (c.max_child == null) && (this.children.getClass().getName() == this.parent.children.getClass().getName()) && (this.children.getClass().getName() == this.parent.parent.children.getClass().getName()) && (this.children.getClass().getName() == this.parent.max_child.children.getClass().getName()) && (this.children.getClass().getName() == this.max_child.children.getClass().getName()) && (this.children.getClass().getName() == this.max_child.max_child.children.getClass().getName()) && (this.parent.children.getClass().getName() == this.parent.parent.children.getClass().getName()) && (this.parent.children.getClass().getName() == this.parent.max_child.children.getClass().getName()) && (this.parent.children.getClass().getName() == this.max_child.children.getClass().getName()) && (this.parent.parent.ancestors.getClass().getName() == this.parent.ancestors.getClass().getName()) && (this.parent.parent.ancestors.getClass().getName() == this.ancestors.getClass().getName()) && (this.parent.value == this.parent.max_child.value) && (this.parent.ancestors.getClass().getName() == this.parent.max_child.ancestors.getClass().getName()) && (this.parent.ancestors.getClass().getName() == this.ancestors.getClass().getName()) && (this.parent.ancestors.getClass().getName() == this.max_child.ancestors.getClass().getName()) && (this.parent.max_child.children.getClass().getName() == this.max_child.children.getClass().getName()) && (this.parent.max_child.ancestors.getClass().getName() == this.ancestors.getClass().getName()) && (this.parent.max_child.ancestors.getClass().getName() == this.max_child.ancestors.getClass().getName()) && (this.ancestors.getClass().getName() == this.max_child.ancestors.getClass().getName()) && (this.ancestors.getClass().getName() == this.max_child.max_child.ancestors.getClass().getName()) && (this.max_child == this.max_child.parent.max_child) && (this.max_child.children.getClass().getName() == this.max_child.parent.children.getClass().getName()) && (this.max_child.children.getClass().getName() == this.max_child.max_child.children.getClass().getName()) && (this.max_child.parent.value == this.max_child.init_value) && (this.max_child.parent.ancestors.getClass().getName() == this.max_child.ancestors.getClass().getName()) && (this.max_child.ancestors.getClass().getName() == this.max_child.max_child.ancestors.getClass().getName()) && (this.children != null) && (eltsNotEqual(this.children, null)) && (eltsEqual(typeArray(this.children), "examples.Composite")) && (this.children.getClass().getName() == java.util.LinkedList.class.getName()) && (eltsNotEqual(this.parent.children, null)) && (eltsEqual(typeArray(this.parent.children), "examples.Composite")) && (this.parent.children.getClass().getName() == java.util.LinkedList.class.getName()) && (this.parent.parent.children != null) && (eltsNotEqual(this.parent.parent.children, null)) && (eltsEqual(typeArray(this.parent.parent.children), "examples.Composite")) && (this.parent.parent.children.getClass().getName() == java.util.LinkedList.class.getName()) && (this.parent.parent.ancestors != null) && (this.parent.parent.ancestors.getClass().getName() == java.util.HashSet.class.getName()) && (this.parent.ancestors.getClass().getName() == java.util.HashSet.class.getName()) && (eltsNotEqual(this.parent.max_child.children, null)) && (eltsEqual(typeArray(this.parent.max_child.children), "examples.Composite")) && (this.parent.max_child.children.getClass().getName() == java.util.LinkedList.class.getName()) && (this.parent.max_child.ancestors.getClass().getName() == java.util.HashSet.class.getName()) && (this.ancestors != null) && (this.ancestors.getClass().getName() == java.util.HashSet.class.getName()) && (eltsNotEqual(this.max_child.children, null)) && (eltsEqual(typeArray(this.max_child.children), "examples.Composite")) && (this.max_child.children.getClass().getName() == java.util.LinkedList.class.getName()) && (eltsEqual(typeArray(this.max_child.parent.children), "examples.Composite")) && (this.max_child.ancestors.getClass().getName() == java.util.HashSet.class.getName()) && (this.max_child.max_child.children != null) && (this.max_child.max_child.children.getClass().getName() == java.util.LinkedList.class.getName()) && (this.max_child.max_child.parent != null) && (this.max_child.max_child.ancestors != null) && (this.max_child.max_child.max_child == null) && (this.max_child.max_child.ancestors.getClass().getName() == java.util.HashSet.class.getName()) && (this.children.getClass().getName() != this.parent.ancestors.getClass().getName()) && (this.children.getClass().getName() != this.ancestors.getClass().getName()) && (this.parent.children.getClass().getName() != this.parent.ancestors.getClass().getName()) && (this.parent.children.getClass().getName() != this.ancestors.getClass().getName()) && (this.parent.value >= this.parent.init_value) && (this.value >= this.init_value))) {
            return;
        }
        ;
        if (c == null)
            throw new IllegalArgumentException();
        List<Composite> old_this_parent_children = (LinkedList<Composite>) ((LinkedList<Composite>) this.parent.children).clone();
        List<Composite> old_this_parent_max_child_children = (LinkedList<Composite>) ((LinkedList<Composite>) this.parent.max_child.children).clone();
        List<Composite> old_c_children_1 = (LinkedList<Composite>) ((LinkedList<Composite>) c.children).clone();
        List<Composite> old_this_children_3 = (LinkedList<Composite>) ((LinkedList<Composite>) this.children).clone();
        Object old_this_max_child_2 = this.parent.max_child;
        Object old_c_children = c.children;
        Object old_this_parent_2 = this.parent.max_child.parent;
        Object old_c_ancestors = c.ancestors;
        int old_this_init_value = this.init_value;
        Object old_c_max_child = c.max_child;
        Object old_c_2 = c.ancestors.getClass().getName();
        Object old_this_6 = this.children.getClass().getName();
        Object old_this_5 = this.ancestors.getClass().getName();
        Object old_this_children_2 = this.parent.max_child.children;
        Object old_this_4 = this;
        Object old_this_ancestors_2 = this.parent.max_child.ancestors;
        int old_this_value_1 = this.value;
        int old_c_init_value = c.init_value;
        Object old_this_ancestors_1 = this.parent.ancestors;
        Object old_this_max_child_1 = this.parent.max_child.max_child;
        Object old_this_max_child = this.max_child;
        Object old_this_parent_1 = this.parent.parent;
        Object old_this_children_1 = this.parent.children;
        int old_c_value = c.value;
        Object old_this_ancestors = this.ancestors;
        Object old_this_3 = this.parent.max_child.children.getClass().getName();
        Object old_this_2 = this.parent.children.getClass().getName();
        Object old_this_1 = this.parent.max_child.ancestors.getClass().getName();
        Object old_this = this.parent.ancestors.getClass().getName();
        int old_this_value = this.parent.value;
        Object old_this_children = this.children;
        Object old_this_parent = this.parent;
        Object old_c_1 = c.children.getClass().getName();
        Composite old_c = c;
        if ((c == this) || (c.parent != null) || (!c.children.isEmpty()))
            throw new IllegalArgumentException();
        c.setParent(this);
        children.add(c);
        update(c);
        if (!(((this.children == this.max_child.parent.children) && (this.children == c.parent.children) && (this.children == old_this_children) && (this.children == old_this_children_2) && (this.children.getClass().getName() == c.children.getClass().getName()) && (this.children.getClass().getName() == c.parent.children.getClass().getName()) && (this.children.getClass().getName() == old_this_6) && (this.children.getClass().getName() == old_c_1) && (this.parent == this.max_child.parent.parent) && (this.parent == c.parent.parent) && (this.parent == old_this_parent) && (this.parent == old_this_parent_2) && (this.parent.children == old_this_children_1) && (pairwiseEqual(this.parent.children, old_this_parent_children)) && (this.parent.children.getClass().getName() == old_this_2) && (this.parent.children.getClass().getName() == old_this_3) && (this.parent.parent == old_this_parent_1) && (this.parent.parent == old_this_max_child) && (this.parent.value == this.value) && (this.parent.value == c.value) && (this.parent.ancestors == old_this_ancestors_1) && (this.parent.ancestors.getClass().getName() == old_this) && (this.parent.ancestors.getClass().getName() == old_this_1) && (this.parent.max_child == this.max_child) && (this.parent.max_child == old_c) && (this.parent.max_child.children == c.children) && (pairwiseEqual(this.parent.max_child.children, old_this_parent_max_child_children)) && (this.parent.max_child.parent == c.parent) && (this.parent.max_child.parent == old_this_4) && (this.parent.max_child.parent == old_this_max_child_2) && (this.parent.max_child.ancestors == c.ancestors) && (this.parent.max_child.max_child == old_this_max_child_1) && (this.value == this.max_child.value) && (this.value == c.parent.value) && (this.init_value == this.max_child.parent.init_value) && (this.init_value == c.parent.init_value) && (this.init_value == old_this_value) && (this.init_value == old_this_value_1) && (this.init_value == old_this_init_value) && (this.ancestors == this.max_child.parent.ancestors) && (this.ancestors == c.parent.ancestors) && (this.ancestors == old_this_ancestors_2) && (this.ancestors == old_this_ancestors) && (this.ancestors.getClass().getName() == c.parent.ancestors.getClass().getName()) && (this.ancestors.getClass().getName() == c.ancestors.getClass().getName()) && (this.ancestors.getClass().getName() == old_this_5) && (this.ancestors.getClass().getName() == old_c_2) && (this.max_child == c.parent.max_child) && (this.max_child.children == c.children) && (this.max_child.parent == c.parent) && (this.max_child.parent == old_this_4) && (this.max_child.parent.children == old_this_children_2) && (this.max_child.parent.parent == old_this_parent_2) && (this.max_child.parent.value == this.max_child.value) && (this.max_child.parent.init_value == old_this_value) && (this.max_child.parent.ancestors == old_this_ancestors_2) && (this.max_child.parent.max_child == old_c) && (this.max_child.value == this.max_child.init_value) && (this.max_child.value == c.value) && (this.max_child.ancestors == c.ancestors) && (this.max_child.max_child == old_this_max_child) && (c.children == old_c_children) && (pairwiseEqual(c.children, old_c_children_1)) && (c.parent == old_this_4) && (c.value == c.init_value) && (c.value == old_c_value) && (c.value == old_c_init_value) && (c.ancestors == old_c_ancestors) && (c.max_child == old_c_max_child) && (size(this.children) - 1 == size(old_this_children_3)) && (pairwiseEqual(typeArray(this.children), new String[] { "examples.Composite" })) && (this.parent.children != null) && (pairwiseEqual(typeArray(this.parent.children), new String[] { "examples.Composite" })) && (this.parent.parent == null) && (this.parent.value == 1) && (this.parent.init_value == -2210) && (this.parent.ancestors != null) && (this.parent.max_child != null) && (this.parent.max_child.children != null) && (pairwiseEqual(typeArray(this.parent.max_child.children), new String[] {})) && (this.parent.max_child.parent != null) && (this.parent.max_child.ancestors != null) && (pairwiseEqual(typeArray(this.max_child.children), new String[] {})) && (this.max_child.max_child == null) && (pairwiseEqual(typeArray(c.children), new String[] {})) && (pairwiseEqual(typeArray(c.parent.children), new String[] { "examples.Composite" })) && (eltsEqual(typeArray(c.parent.children), "examples.Composite")) && (c.max_child == null) && (size(this.children) == 1) && (size(this.parent.children) == 1) && (size(c.parent.children) == 1) && (this.children.getClass().getName() == this.parent.children.getClass().getName()) && (this.children.getClass().getName() == this.parent.parent.children.getClass().getName()) && (this.children.getClass().getName() == this.parent.max_child.children.getClass().getName()) && (this.children.getClass().getName() == this.max_child.children.getClass().getName()) && (this.children.getClass().getName() == this.max_child.max_child.children.getClass().getName()) && (this.parent == this.parent.parent.max_child) && (this.parent.children.getClass().getName() == this.parent.parent.children.getClass().getName()) && (this.parent.children.getClass().getName() == this.parent.max_child.children.getClass().getName()) && (this.parent.children.getClass().getName() == this.max_child.children.getClass().getName()) && (this.parent.parent == this.max_child.max_child) && (this.parent.parent.value == this.parent.value) && (this.parent.parent.value == this.parent.init_value) && (this.parent.parent.ancestors.getClass().getName() == this.parent.ancestors.getClass().getName()) && (this.parent.parent.ancestors.getClass().getName() == this.ancestors.getClass().getName()) && (this.parent.value == this.parent.max_child.value) && (this.parent.value == this.max_child.value) && (this.parent.value == this.max_child.init_value) && (this.parent.ancestors.getClass().getName() == this.parent.max_child.ancestors.getClass().getName()) && (this.parent.ancestors.getClass().getName() == this.ancestors.getClass().getName()) && (this.parent.ancestors.getClass().getName() == this.max_child.ancestors.getClass().getName()) && (this.parent.max_child == this.max_child.parent.max_child) && (this.parent.max_child.children == this.max_child.children) && (this.parent.max_child.children.getClass().getName() == this.max_child.children.getClass().getName()) && (this.parent.max_child.parent == this.max_child.parent) && (this.parent.max_child.value == this.value) && (this.parent.max_child.value == this.max_child.value) && (this.parent.max_child.value == this.max_child.init_value) && (this.parent.max_child.ancestors == this.max_child.ancestors) && (this.parent.max_child.ancestors.getClass().getName() == this.ancestors.getClass().getName()) && (this.parent.max_child.ancestors.getClass().getName() == this.max_child.ancestors.getClass().getName()) && (this.value == this.max_child.init_value) && (this.ancestors.getClass().getName() == this.max_child.ancestors.getClass().getName()) && (this.ancestors.getClass().getName() == this.max_child.max_child.ancestors.getClass().getName()) && (this.max_child == this.max_child.parent.max_child) && (this.max_child == this.max_child.max_child.parent) && (this.max_child.children.getClass().getName() == this.max_child.parent.children.getClass().getName()) && (this.max_child.children.getClass().getName() == this.max_child.max_child.children.getClass().getName()) && (this.max_child.parent.value == this.max_child.init_value) && (this.max_child.parent.ancestors.getClass().getName() == this.max_child.ancestors.getClass().getName()) && (this.max_child.parent.max_child == this.max_child.max_child.parent) && (this.max_child.value == this.max_child.max_child.value) && (this.max_child.ancestors.getClass().getName() == this.max_child.max_child.ancestors.getClass().getName()) && (this.children != null) && (eltsNotEqual(this.children, null)) && (eltsEqual(typeArray(this.children), "examples.Composite")) && (pairwiseEqual(typeArray(this.children), new String[] {}) || pairwiseEqual(typeArray(this.children), new String[] { "examples.Composite" })) && (this.children.getClass().getName() == java.util.LinkedList.class.getName()) && (eltsNotEqual(this.parent.children, null)) && (eltsEqual(typeArray(this.parent.children), "examples.Composite")) && (pairwiseEqual(typeArray(this.parent.children), new String[] {}) || pairwiseEqual(typeArray(this.parent.children), new String[] { "examples.Composite" })) && (this.parent.children.getClass().getName() == java.util.LinkedList.class.getName()) && (this.parent.parent.children != null) && (eltsNotEqual(this.parent.parent.children, null)) && (pairwiseEqual(typeArray(this.parent.parent.children), new String[] { "examples.Composite" })) && (eltsEqual(typeArray(this.parent.parent.children), "examples.Composite")) && (this.parent.parent.children.getClass().getName() == java.util.LinkedList.class.getName()) && (this.parent.parent.parent == null) && (this.parent.parent.value == 0) && (this.parent.parent.init_value == -2210) && (this.parent.parent.ancestors != null) && (this.parent.parent.ancestors.getClass().getName() == java.util.HashSet.class.getName()) && (this.parent.parent.max_child != null) && (this.parent.value <= 1) && (this.parent.ancestors.getClass().getName() == java.util.HashSet.class.getName()) && (eltsNotEqual(this.parent.max_child.children, null)) && (eltsEqual(typeArray(this.parent.max_child.children), "examples.Composite")) && (pairwiseEqual(typeArray(this.parent.max_child.children), new String[] {}) || pairwiseEqual(typeArray(this.parent.max_child.children), new String[] { "examples.Composite" })) && (this.parent.max_child.children.getClass().getName() == java.util.LinkedList.class.getName()) && (this.parent.max_child.value == 0 || this.parent.max_child.value == 1) && (this.parent.max_child.ancestors.getClass().getName() == java.util.HashSet.class.getName()) && (this.parent.max_child.max_child == null) && (this.value <= 1) && (this.init_value <= 1) && (this.ancestors != null) && (this.ancestors.getClass().getName() == java.util.HashSet.class.getName()) && (eltsNotEqual(this.max_child.children, null)) && (eltsEqual(typeArray(this.max_child.children), "examples.Composite")) && (pairwiseEqual(typeArray(this.max_child.children), new String[] {}) || pairwiseEqual(typeArray(this.max_child.children), new String[] { "examples.Composite" })) && (this.max_child.children.getClass().getName() == java.util.LinkedList.class.getName()) && (pairwiseEqual(typeArray(this.max_child.parent.children), new String[] { "examples.Composite" })) && (eltsEqual(typeArray(this.max_child.parent.children), "examples.Composite")) && (this.max_child.parent.init_value == -2210 || this.max_child.parent.init_value == 0) && (this.max_child.value == 0 || this.max_child.value == 1) && (this.max_child.init_value == 0 || this.max_child.init_value == 1) && (this.max_child.ancestors.getClass().getName() == java.util.HashSet.class.getName()) && (this.max_child.max_child.children != null) && (pairwiseEqual(typeArray(this.max_child.max_child.children), new String[] {})) && (this.max_child.max_child.children.getClass().getName() == java.util.LinkedList.class.getName()) && (this.max_child.max_child.parent != null) && (this.max_child.max_child.value == 1) && (this.max_child.max_child.ancestors != null) && (this.max_child.max_child.ancestors.getClass().getName() == java.util.HashSet.class.getName()) && (this.max_child.max_child.max_child == null) && (size(this.children) == 0 || size(this.children) == 1) && (size(this.parent.children) == 0 || size(this.parent.children) == 1) && (size(this.parent.parent.children) == 1) && (size(this.parent.max_child.children) == 0 || size(this.parent.max_child.children) == 1) && (size(this.max_child.children) == 0 || size(this.max_child.children) == 1) && (size(this.max_child.parent.children) == 1) && (this.children.getClass().getName() != this.parent.ancestors.getClass().getName()) && (this.children.getClass().getName() != this.ancestors.getClass().getName()) && (memberOf(this.max_child.max_child.children.getClass().getName(), typeArray(this.parent.children))) && (memberOf(this.max_child.max_child.ancestors.getClass().getName(), typeArray(this.parent.children))) && (this.parent.children.getClass().getName() != this.parent.ancestors.getClass().getName()) && (this.parent.children.getClass().getName() != this.ancestors.getClass().getName()) && (memberOf(this.parent.children.getClass().getName(), typeArray(this.max_child.max_child.children))) && (this.parent.value >= this.parent.init_value) && (memberOf(this.parent.ancestors.getClass().getName(), typeArray(this.max_child.max_child.children))) && (memberOf(this.max_child.max_child.children.getClass().getName(), typeArray(this.parent.max_child.children))) && (memberOf(this.max_child.max_child.ancestors.getClass().getName(), typeArray(this.parent.max_child.children))) && (memberOf(this.parent.max_child.children.getClass().getName(), typeArray(this.max_child.max_child.children))) && (memberOf(this.parent.max_child.ancestors.getClass().getName(), typeArray(this.max_child.max_child.children))) && (this.value >= this.init_value) && (this.max_child.init_value == this.value * this.value) && (this.value == this.max_child.init_value * this.max_child.init_value)))) {
            int mm = 2;
            assert (3 > mm);
        }
        ;
    }

    /**
     * Sets `parent' to `p'.
     */
    private void setParent(Composite p) {
        if (p == null)
            throw new IllegalArgumentException();
        parent = p;
        ancestors.addAll(p.ancestors);
        ancestors.add(p);
    }

    /**
     * Updates `value' of this node and its ancestors taking into account an updated child `c'.
     */
    private void update(Composite c) {
        if (c == null)
            throw new IllegalArgumentException();
        if (value < c.value) {
            value = c.value;
            max_child = c;
            if (parent != null) {
                parent.update(c);
            }
        }
    }

    private String[] typeArray(Object[] seq) {
        if (seq == null) {
            return null;
        }
        String[] retval = new String[seq.length];
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] == null) {
                retval[i] = null;
            } else {
                retval[i] = seq[i].getClass().toString();
            }
        }
        return retval;
    }

    private String[] typeArray(Object seq) {
        if (seq == null) {
            return null;
        }
        return typeArray(toObjArray(seq));
    }

    private Object[] toObjArray(Object o) {
        if (o == null) {
            return null;
        }
        if (o instanceof java.util.AbstractCollection<?>) {
            @SuppressWarnings({ "unchecked" }) AbstractCollection<Object> ac = (AbstractCollection<Object>) o;
            Object[] result = ac.toArray(new java.lang.Object[] {});
            return result;
        } else if (o.getClass().isArray()) {
            return (Object[]) o;
        } else {
            throw new IllegalArgumentException("not an array or collection: " + o);
        }
    }

    private int size(Object o) {
        if (o == null) {
            // return default value
            return Integer.MAX_VALUE;
        }
        java.lang.Class<?> c = o.getClass();
        if (c.isArray()) {
            return java.lang.reflect.Array.getLength(o);
        } else if (o instanceof Collection<?>) {
            return ((Collection<?>) o).size();
        } else {
            // return default value
            return Integer.MAX_VALUE;
        }
    }

    private int size(Collection<?> o) {
        if (o == null) {
            // return default value
            return Integer.MAX_VALUE;
        }
        return o.size();
    }

    private boolean memberOf(String elt, String[] arr) {
        if (arr == null) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (eq(arr[i], elt)) {
                return true;
            }
        }
        return false;
    }

    private boolean eq(String x, String y) {
        return x == y;
    }

    private boolean eltsEqual(String[] arr, String elt) {
        if (arr == null) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (ne(arr[i], elt)) {
                return false;
            }
        }
        return true;
    }

    private boolean eltsNotEqual(Object[] arr, Object elt) {
        if (arr == null) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (eq(arr[i], elt)) {
                return false;
            }
        }
        return true;
    }

    private boolean eq(Object x, Object y) {
        return x == y;
    }

    private boolean eltsNotEqual(Object arr, Object elt) {
        if (arr == null) {
            return false;
        }
        return eltsNotEqual(toObjArray(arr), elt);
    }

    private boolean pairwiseEqual(List<Composite> seq1, List<Composite> seq2) {
        if (seq1 == null) {
            return false;
        }
        if (seq2 == null) {
            return false;
        }
        // cast is redundant (except in JSR 308)
        @SuppressWarnings("cast") Object[] seq1a = (Object[]) seq1.toArray();
        Object[] seq2a = (Object[]) seq2.toArray();
        return pairwiseEqual(seq1a, seq2a);
    }

    private boolean pairwiseEqual(Object[] seq1, Object[] seq2) {
        if (!sameLength(seq1, seq2)) {
            return false;
        }
        for (int i = 0; i < seq1.length; i++) {
            if (ne(seq1[i], seq2[i])) {
                return false;
            }
        }
        return true;
    }

    private boolean sameLength(Object[] seq1, Object[] seq2) {
        return ((seq1 != null) && (seq2 != null) && seq1.length == seq2.length);
    }

    private boolean ne(Object x, Object y) {
        return x != y;
    }

    private boolean pairwiseEqual(String[] seq1, String[] seq2) {
        if (!sameLength(seq1, seq2)) {
            return false;
        }
        for (int i = 0; i < seq1.length; i++) {
            if (ne(seq1[i], seq2[i])) {
                return false;
            }
        }
        return true;
    }

    private boolean sameLength(String[] seq1, String[] seq2) {
        return ((seq1 != null) && (seq2 != null) && seq1.length == seq2.length);
    }

    private boolean ne(String x, String y) {
        return x != y;
    }
}
