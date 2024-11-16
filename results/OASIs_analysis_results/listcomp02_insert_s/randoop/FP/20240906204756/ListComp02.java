package examples;

import java.util.AbstractCollection;
import java.util.Collection;

public class ListComp02 {

    private java.util.ArrayList<R> _var49;

    private java.util.ArrayList<S> _var50;

    public ListComp02() {
        clear();
    }

    public ListComp02(java.util.ArrayList<R> Rs, java.util.ArrayList<S> Ss) {
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
        {
            _var49.add(r);
        }
    }

    public void insert_s(S s) {
        //invalid pre: (daikon.Quant.eltsNotEqual(this._var49, null)) && (daikon.Quant.eltsEqual(daikon.Quant.typeArray(this._var49), "examples.R")) && (daikon.Quant.eltsNotEqual(this._var50, null)) && (daikon.Quant.eltsEqual(daikon.Quant.typeArray(this._var50), "examples.S")) && (s.getB() != null) && (s.getB().toString().equals("") || s.getB().toString().equals("hi!")) && (s.getC() != null) && 
        if (!((this._var49 != null) && (this._var50 != null))) {
            return;
        }
        java.util.ArrayList<R> old_this__var49_1 = new java.util.ArrayList<>(this._var49);
        java.util.ArrayList<S> old_this__var50_1 = new java.util.ArrayList<>(this._var50);
        Object old_this__var49 = this._var49;
        Integer old_s_C = s.getC();
        Object old_s = s.getB().toString();
        String old_s_B = s.getB();
        Object old_this__var50 = this._var50;
        {
            _var50.add(s);
        }
        assert ((this._var49 == old_this__var49) && (pairwiseEqualR(this._var49, old_this__var49_1)) && (this._var50 == old_this__var50) && (s.getB() == old_s_B) && (s.getB().toString().equals(old_s)) && (s.getC() == old_s_C) && (size(this._var50)-1 == size(old_this__var50_1)) && (this._var49 != null) && (eltsNotEqual(this._var49, null)) && (eltsEqual(typeArray(this._var49), "examples.R")) && (this._var50 != null) && (s.getB() != null) && (s.getB().toString().equals("") || s.getB().toString().equals("hi!")) && (s.getC() != null));
        ;
    }

    private boolean pairwiseEqualR(AbstractCollection<R> seq1, AbstractCollection<R> seq2) {
        if (seq1 == null) {
            return false;
        }
        if (seq2 == null) {
            return false;
        }
        @SuppressWarnings("cast") // cast is redundant (except in JSR 308)
        Object[] seq1a = (Object[]) seq1.toArray();
        Object[] seq2a = (Object[]) seq2.toArray();
        return pairwiseEqual(seq1a, seq2a);
    }
    
    private boolean pairwiseEqual(Object[] seq1, Object[] seq2) {
        if (!sameLength(seq1, seq2)) {
            return false;
        }
        for (int i = 0 ; i < seq1.length ; i++) {
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

    private int size(Object o) {
        if (o == null) {
            return Integer.MAX_VALUE; // return default value
        }
        java.lang.Class<?> c = o.getClass();
        if (c.isArray()) {
            return java.lang.reflect.Array.getLength(o);
        } else if (o instanceof Collection<?>) {
            return ((Collection<?>)o).size();
        } else {
            return Integer.MAX_VALUE; // return default value
        }
    }
    
    private int size(Collection<?> o) {
        if (o == null) {
            return Integer.MAX_VALUE; // return default value
        }
        return o.size();
    }

    private String[] typeArray(Object[] seq) {
        if (seq == null) {
            return null;
        }
        String[] retval = new String[seq.length];
        for (int i = 0 ; i < seq.length ; i++) {
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
            @SuppressWarnings({"unchecked"})
            AbstractCollection<Object> ac = (AbstractCollection<Object>)o;
            Object [] result = ac.toArray(new java.lang.Object []{});
            return result;
        } else if (o.getClass().isArray()) {
            return (Object[])o;
        } else {
            throw new IllegalArgumentException("not an array or collection: " + o);
        }
    }
    
    private boolean eltsNotEqual(Object[] arr, Object elt) {
        if (arr == null) {
            return false;
        }
        for (int i = 0 ; i < arr.length ; i++) {
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
        for (int i = 0 ; i < arr.length ; i++) {
            if (ne(arr[i], elt)) {
                return false;
            }
        }
        return true;
    }
}
