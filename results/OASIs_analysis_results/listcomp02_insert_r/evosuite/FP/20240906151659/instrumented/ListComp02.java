package examples;

import java.util.AbstractCollection;
import java.util.Collection;

public class ListComp02 {

    private java.util.ArrayList<R> _var49;

    private java.util.ArrayList<S> _var50;

    public  ListComp02() {
        clear();
    }

    public  ListComp02(java.util.ArrayList<R> Rs, java.util.ArrayList<S> Ss) {
        _var49 = Rs;
        _var50 = Ss;
    }

    public void clear() {
        _var49 = new java.util.ArrayList<R>();
        _var50 = new java.util.ArrayList<S>();
    }

    public Integer q() {
        Integer _sum159130 = 0;
        for (R _r159132 : _var49) {
            for (S _s159133 : _var50) {
                {
                    _sum159130 = (_sum159130 + (((_r159132).getA()) * ((_s159133).getC())));
                }
            }
        }
        return _sum159130;
    }

    public void insert_r(R r) {
        //invalid pre: (daikon.Quant.pairwiseEqual(daikon.Quant.typeArray(this._var49), new String[] {  })) && (r.getB().toString().equals("JZJ#a%+7cdh") || r.getB().toString().equals("oSU|O_z$_}a")) && (daikon.Quant.eltsNotEqual(this._var50, null)) && (daikon.Quant.eltsEqual(daikon.Quant.typeArray(this._var50), "examples.S")) && (daikon.Quant.pairwiseEqual(daikon.Quant.typeArray(this._var50), new String[] {  }) || daikon.Quant.pairwiseEqual(daikon.Quant.typeArray(this._var50), new String[] { "examples.S" })) && (daikon.Quant.size(this._var49) == 0 || daikon.Quant.size(this._var49) == 1) && (daikon.Quant.size(this._var50) == 0 || daikon.Quant.size(this._var50) == 1)
        java.util.ArrayList<R> old_this__var49_1 = new java.util.ArrayList(this._var49);
        java.util.ArrayList<S> old_this__var50_1 = new java.util.ArrayList(this._var50);
        Object old_r = r.getB().toString();
        Object old_this__var49 = this._var49;
        String old_r_B = r.getB();
        Integer old_r_A = r.getA();
        Object old_this__var50 = this._var50;
        {
            _var49.add(r);
        }
        ;
        ;
        if (!(((this._var49 == old_this__var49) && (this._var50 == old_this__var50) && (pairwiseEqualS(this._var50, old_this__var50_1)) && (r.getA() == old_r_A) && (r.getB() == old_r_B) && (r.getB().toString().equals(old_r)) && (size(this._var49) - 1 == size(old_this__var49_1)) && (pairwiseEqual(typeArray(this._var49), new String[] { null }) || pairwiseEqual(typeArray(this._var49), new String[] { "examples.R" })) && (r.getB().toString().equals("JZJ#a%+7cdh") || r.getB().toString().equals("oSU|O_z$_}a")) && (size(this._var49) == 1) && (eltsNotEqual(this._var50, null)) && (eltsEqual(typeArray(this._var50), "examples.S")) && (pairwiseEqual(typeArray(this._var50), new String[] {}) || pairwiseEqual(typeArray(this._var50), new String[] { "examples.S" })) && (size(this._var49) == 0 || size(this._var49) == 1) && (size(this._var50) == 0 || size(this._var50) == 1)))) {
            int mm = 2;
            assert (3 > mm);
        }
        ;
    }

    public void insert_s(S s) {
        {
            _var50.add(s);
        }
    }

    private boolean pairwiseEqualS(AbstractCollection<S> seq1, AbstractCollection<S> seq2) {
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
}
