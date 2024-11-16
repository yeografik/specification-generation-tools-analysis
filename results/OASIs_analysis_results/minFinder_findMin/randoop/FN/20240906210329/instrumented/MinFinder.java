package examples;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class MinFinder {

    //instrumentation
    private static Map<Integer, HashMap<String, Object>> instrMap = new HashMap<Integer, HashMap<String, Object>>();

    //instrumentation
    private static int jjj = 0;

    private java.util.ArrayList<T> _var88;

    private T _var811;

    public  MinFinder() {
        clear();
    }

    public void add(T x) {
        _var88.add(x);
        T _min293242 = null;
        Boolean _first293243 = true;
        for (T _x293244 : _var88) {
            Boolean _v293245;
            if (_first293243) {
                _v293245 = true;
            } else {
                _v293245 = ((_x293244).getVal() < (_min293242).getVal());
            }
            if (_v293245) {
                _first293243 = false;
                _min293242 = _x293244;
            }
        }
        _var811 = _min293242;
    }

    public  MinFinder(java.util.ArrayList<T> xs) {
        _var88 = xs;
        T _min293242 = null;
        Boolean _first293243 = true;
        for (T _x293244 : xs) {
            Boolean _v293245;
            if (_first293243) {
                _v293245 = true;
            } else {
                _v293245 = ((_x293244).getVal() < (_min293242).getVal());
            }
            if (_v293245) {
                _first293243 = false;
                _min293242 = _x293244;
            }
        }
        _var811 = _min293242;
    }

    public void clear() {
        _var88 = new java.util.ArrayList<T>();
        T _min293246 = null;
        Boolean _first293247 = true;
        _var811 = _min293246;
    }

    public T findMin() {
        if (!((this._var88 != null))) {
            //instrumentation
            return null;
        }
        Object old_this__var88 = this._var88;
        java.util.ArrayList<T> old_this__var88_1 = new ArrayList(this._var88);
        int old_this_val = this._var811.val;
        Object old_this__var811 = this._var811;
        T result = _var811;
        //instrumentation
        HashMap<String, Object> map0 = new HashMap<String, Object>();
        //instrumentation
        map0.put("assert_result0", ((this._var88 == old_this__var88) && (pairwiseEqual(this._var88, old_this__var88_1)) && (this._var811 == result) && (this._var811.val == result.val) && (result == old_this__var811) && (result.val == old_this_val) && (this._var88 != null)));
        //instrumentation
        map0.put("result", result);
        //instrumentation
        map0.put("old_this__var811", old_this__var811);
        //instrumentation
        map0.put("old_this_val", old_this_val);
        //instrumentation
        map0.put("old_this__var88_1", old_this__var88_1);
        //instrumentation
        map0.put("old_this__var88", old_this__var88);
        //instrumentation
        map0.put("this._var811", this._var811);
        //instrumentation
        map0.put("this._var88", this._var88);
        //instrumentation
        instrMap.put(jjj, map0);
        //instrumentation
        jjj = jjj + 1;
        //instrumentation
        return result;
    }

    public void chval(T x, int nv) {
        T _min293249 = null;
        Boolean _first293250 = true;
        for (T _x293251 : _var88) {
            int _conditional_result293252 = 0;
            if ((java.util.Objects.equals(_x293251, x))) {
                _conditional_result293252 = nv;
            } else {
                _conditional_result293252 = (_x293251).getVal();
            }
            int _conditional_result293253 = 0;
            if ((java.util.Objects.equals(_min293249, x))) {
                _conditional_result293253 = nv;
            } else {
                _conditional_result293253 = (_min293249).getVal();
            }
            Boolean _v293254;
            if (_first293250) {
                _v293254 = true;
            } else {
                _v293254 = (_conditional_result293252 < _conditional_result293253);
            }
            if (_v293254) {
                _first293250 = false;
                _min293249 = _x293251;
            }
        }
        _var811 = _min293249;
        {
        // (x).getVal() = nv;
        }
    }

    public static class T {

        private int val;

        public int getVal() {
            return val;
        }

        public  T(int _v293255) {
            this.val = _v293255;
        }

        @Override
        public boolean equals(Object other) {
            if (!(other instanceof T))
                return false;
            T o = (T) other;
            return o.val == val;
        }

        @Override
        public int hashCode() {
            return val;
        }
    }

    private boolean pairwiseEqual(ArrayList<T> seq1, ArrayList<T> seq2) {
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
}
