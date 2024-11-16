package examples;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class MaxBag {

    //instrumentation
    private static Map<Integer, HashMap<String, Object>> instrMap = new HashMap<Integer, HashMap<String, Object>>();

    //instrumentation
    private static int jjj = 0;

    private Integer _var587;

    private HashMap<Integer, Boolean> _var721;

    private Boolean _var1457;

    private _Type328393 _var4384;

    private Integer _var5992;

    private ArrayList<Integer> _var66253;

    public  MaxBag() {
        clear();
    }

    public  MaxBag(ArrayList<Integer> l) {
        Integer _max328394 = 0;
        Boolean _first328395 = true;
        for (Integer _x328396 : l) {
            Boolean _v328397;
            if (_first328395) {
                _v328397 = true;
            } else {
                _v328397 = (_x328396 > _max328394);
            }
            if (_v328397) {
                _first328395 = false;
                _max328394 = _x328396;
            }
        }
        _var587 = _max328394;
        HashMap<Integer, Boolean> _map328398 = new HashMap<Integer, Boolean>();
        for (Integer _var686 : l) {
            Boolean _v328399 = _map328398.getOrDefault(_var686, false);
            _v328399 = true;
            _map328398.put(_var686, _v328399);
        }
        _var721 = _map328398;
        Boolean _v328400 = true;
        _label328401: do {
            for (Integer _x328402 : l) {
                _v328400 = false;
                break _label328401;
            }
        } while (false);
        _var1457 = (!(_v328400));
        Integer[] _heap_elems328389;
        _heap_elems328389 = new Integer[0];
        _Type328393 _var328388 = new _Type328393(0, _heap_elems328389);
        Integer _heap_size328390 = 0;
        Integer _sum328403 = 0;
        for (Integer _x328405 : l) {
            {
                _sum328403 = (_sum328403 + 1);
            }
        }
        for (; ; ) {
            Boolean _v328407;
            if ((((_heap_size328390 + _sum328403) - 1) >= 0)) {
                Boolean _v328408;
                if ((((_heap_size328390 + _sum328403) - 1) >= 0)) {
                    _v328408 = (((_heap_size328390 + _sum328403) - 1) < ((_var328388)._1.length));
                } else {
                    _v328408 = false;
                }
                _v328407 = (!(_v328408));
            } else {
                _v328407 = false;
            }
            if ((!(_v328407))) {
                break;
            }
            Integer[] _new_array328406 = new Integer[(((_var328388)._1.length) << 1) + 1];
            System.arraycopy((_var328388)._1, 0, _new_array328406, 0, ((_var328388)._1.length));
            (_var328388)._1 = _new_array328406;
        }
        for (Integer _x328392 : l) {
            (_var328388)._0 = ((_var328388)._0 + 1);
            (_var328388)._1[_heap_size328390] = _x328392;
            Integer _i328391 = _heap_size328390;
            for (; ; ) {
                Boolean _v328409;
                if ((_i328391 > 0)) {
                    _v328409 = (!(((_var328388)._1[((_i328391 - 1) >> 1)] >= (_var328388)._1[_i328391])));
                } else {
                    _v328409 = false;
                }
                if ((!(_v328409))) {
                    break;
                }
                Integer _swap_tmp328410 = (_var328388)._1[((_i328391 - 1) >> 1)];
                (_var328388)._1[((_i328391 - 1) >> 1)] = (_var328388)._1[_i328391];
                (_var328388)._1[_i328391] = _swap_tmp328410;
                _i328391 = ((_i328391 - 1) >> 1);
            }
            _heap_size328390 = (_heap_size328390 + 1);
        }
        _var4384 = _var328388;
        Integer _sum328411 = 0;
        for (Integer _x328413 : l) {
            {
                _sum328411 = (_sum328411 + 1);
            }
        }
        _var5992 = _sum328411;
        _var66253 = l;
    }

    public void clear() {
        Integer _max328414 = 0;
        Boolean _first328415 = true;
        _var587 = _max328414;
        HashMap<Integer, Boolean> _map328417 = new HashMap<Integer, Boolean>();
        _var721 = _map328417;
        Boolean _v328419 = true;
        _label328420: do {
        } while (false);
        _var1457 = (!(_v328419));
        Integer[] _heap_elems328389;
        _heap_elems328389 = new Integer[0];
        _Type328393 _var328388 = new _Type328393(0, _heap_elems328389);
        Integer _heap_size328390 = 0;
        Integer _sum328422 = 0;
        for (; ; ) {
            Boolean _v328426;
            if ((((_heap_size328390 + _sum328422) - 1) >= 0)) {
                Boolean _v328427;
                if ((((_heap_size328390 + _sum328422) - 1) >= 0)) {
                    _v328427 = (((_heap_size328390 + _sum328422) - 1) < ((_var328388)._1.length));
                } else {
                    _v328427 = false;
                }
                _v328426 = (!(_v328427));
            } else {
                _v328426 = false;
            }
            if ((!(_v328426))) {
                break;
            }
            Integer[] _new_array328425 = new Integer[(((_var328388)._1.length) << 1) + 1];
            System.arraycopy((_var328388)._1, 0, _new_array328425, 0, ((_var328388)._1.length));
            (_var328388)._1 = _new_array328425;
        }
        _var4384 = _var328388;
        Integer _sum328428 = 0;
        _var5992 = _sum328428;
        _var66253 = new ArrayList<Integer>();
    }

    public Integer getMax() {
        return _var587;
    }

    public void add(Integer x) {
        Integer _conditional_result328431 = 0;
        if (_var1457) {
            Integer _conditional_result328432 = 0;
            if ((_var587 > x)) {
                _conditional_result328432 = _var587;
            } else {
                _conditional_result328432 = x;
            }
            _conditional_result328431 = _conditional_result328432;
        } else {
            _conditional_result328431 = x;
        }
        Integer _var328366 = _conditional_result328431;
        Integer _var328367 = (_var5992 + 1);
        _var587 = _var328366;
        _var1457 = true;
        Integer _heap_size328371 = _var5992;
        Integer _heap_size328376 = _var5992;
        for (; ; ) {
            Boolean _v328434;
            if ((((_heap_size328376 + 1) - 1) >= 0)) {
                Boolean _v328435;
                if ((((_heap_size328376 + 1) - 1) >= 0)) {
                    _v328435 = (((_heap_size328376 + 1) - 1) < ((_var4384)._1.length));
                } else {
                    _v328435 = false;
                }
                _v328434 = (!(_v328435));
            } else {
                _v328434 = false;
            }
            if ((!(_v328434))) {
                break;
            }
            Integer[] _new_array328433 = new Integer[(((_var4384)._1.length) << 1) + 1];
            System.arraycopy((_var4384)._1, 0, _new_array328433, 0, ((_var4384)._1.length));
            (_var4384)._1 = _new_array328433;
        }
        {
            (_var4384)._0 = ((_var4384)._0 + 1);
            (_var4384)._1[_heap_size328376] = x;
            Integer _i328377 = _heap_size328376;
            for (; ; ) {
                Boolean _v328436;
                if ((_i328377 > 0)) {
                    _v328436 = (!(((_var4384)._1[((_i328377 - 1) >> 1)] >= (_var4384)._1[_i328377])));
                } else {
                    _v328436 = false;
                }
                if ((!(_v328436))) {
                    break;
                }
                Integer _swap_tmp328437 = (_var4384)._1[((_i328377 - 1) >> 1)];
                (_var4384)._1[((_i328377 - 1) >> 1)] = (_var4384)._1[_i328377];
                (_var4384)._1[_i328377] = _swap_tmp328437;
                _i328377 = ((_i328377 - 1) >> 1);
            }
            _heap_size328376 = (_heap_size328376 + 1);
        }
        {
            _var66253.add(x);
        }
        _var5992 = _var328367;
        {
            Boolean _var1233 = _var721.getOrDefault(x, false);
            _var1233 = true;
            _var721.put(x, _var1233);
        }
    }

    public void remove(Integer x) {
        if (!((this._var587 != null) && (this._var721 != null) && (this._var1457 != null) && (this._var5992 != null) && (this._var66253 != null) && (x != null) && (this._var4384._0 == this._var5992) && (this._var4384._0 != null) && (this._var4384._1 != null) && (this._var4384._1.getClass().getName() == java.lang.Integer[].class.getName()) && (eltsNotEqual(this._var66253, null)) && (eltsEqual(typeArray(this._var66253), "java.lang.Integer")))) {
            //instrumentation
            return;
        }
        _Type328393 old_Type328393 = copyType328393();
        ArrayList<Integer> old_this__var66253_1 = new ArrayList(this._var66253);
        Object old_this__var4384_1 = this._var4384._1;
        Object old_this__var1457 = this._var1457;
        Object old_this__var721 = this._var721;
        Object old_this = this._var4384._1.getClass().getName();
        Object old_this__var4384 = this._var4384;
        Object old_this__var66253 = this._var66253;
        Integer _conditional_result328438 = 0;
        if ((Objects.equals(x, _var587))) {
            Integer _var328379 = 0;
            switch((_var4384)._0) {
                case 0:
                    _var328379 = 0;
                    break;
                case 1:
                    _var328379 = 0;
                    break;
                case 2:
                    _var328379 = (_var4384)._1[1];
                    break;
                default:
                    Integer _conditional_result328439 = 0;
                    if (((_var4384)._1[1] > (_var4384)._1[2])) {
                        _conditional_result328439 = (_var4384)._1[1];
                    } else {
                        _conditional_result328439 = (_var4384)._1[2];
                    }
                    _var328379 = _conditional_result328439;
            }
            _conditional_result328438 = _var328379;
        } else {
            _conditional_result328438 = _var587;
        }
        Integer _var328368 = _conditional_result328438;
        Integer _sum328440 = 0;
        if (_var721.containsKey(x)) {
            {
                {
                    _sum328440 = (_sum328440 + 1);
                }
            }
        }
        Integer _var328369 = (_var5992 - _sum328440);
        ArrayList<Integer> _conditional_result328443 = new ArrayList<Integer>();
        if (_var721.containsKey(x)) {
            ArrayList<Integer> _singleton328448 = new ArrayList<Integer>();
            _singleton328448.add(x);
            _conditional_result328443 = _singleton328448;
        } else {
            _conditional_result328443 = new ArrayList<Integer>();
        }
        ArrayList<Integer> _var328370 = _conditional_result328443;
        _var587 = _var328368;
        Integer _conditional_result328444 = 0;
        ArrayList<Integer> _singleton328449 = new ArrayList<Integer>();
        _singleton328449.add(x);
        if (((_var66253 == _singleton328449))) {
            _conditional_result328444 = 1;
        } else {
            _conditional_result328444 = 0;
        }
        _var1457 = (_var5992 > _conditional_result328444);
        Integer _heap_size328380 = _var5992;
        if (_var721.containsKey(x)) {
            {
                (_var4384)._0 = ((_var4384)._0 - 1);
                Integer _i328381 = (Arrays.asList((_var4384)._1).indexOf(x));
                Integer _swap_tmp328450 = (_var4384)._1[_i328381];
                (_var4384)._1[_i328381] = (_var4384)._1[(_heap_size328380 - 1)];
                (_var4384)._1[(_heap_size328380 - 1)] = _swap_tmp328450;
                _stop_bubble_down328383: do {
                    for (; ; ) {
                        if ((!((((_i328381 << 1) + 1) < (_heap_size328380 - 1))))) {
                            break;
                        }
                        Integer _child_index328384 = ((_i328381 << 1) + 1);
                        Boolean _v328451;
                        if ((((_i328381 << 1) + 2) < (_heap_size328380 - 1))) {
                            _v328451 = (!(((_var4384)._1[((_i328381 << 1) + 1)] >= (_var4384)._1[((_i328381 << 1) + 2)])));
                        } else {
                            _v328451 = false;
                        }
                        if (_v328451) {
                            _child_index328384 = ((_i328381 << 1) + 2);
                        }
                        if ((!(((_var4384)._1[_i328381] >= (_var4384)._1[_child_index328384])))) {
                            Integer _swap_tmp328452 = (_var4384)._1[_i328381];
                            (_var4384)._1[_i328381] = (_var4384)._1[_child_index328384];
                            (_var4384)._1[_child_index328384] = _swap_tmp328452;
                            _i328381 = _child_index328384;
                        } else {
                            break _stop_bubble_down328383;
                        }
                    }
                } while (false);
                _heap_size328380 = (_heap_size328380 - 1);
            }
        }
        Integer _sum328445 = 0;
        if (_var721.containsKey(x)) {
            {
                {
                    _sum328445 = (_sum328445 + 1);
                }
            }
        }
        Integer _heap_size328385 = (_var5992 - _sum328445);
        for (; ; ) {
            Boolean _v328454;
            if ((((_heap_size328385 + 0) - 1) >= 0)) {
                Boolean _v328455;
                if ((((_heap_size328385 + 0) - 1) >= 0)) {
                    _v328455 = (((_heap_size328385 + 0) - 1) < ((_var4384)._1.length));
                } else {
                    _v328455 = false;
                }
                _v328454 = (!(_v328455));
            } else {
                _v328454 = false;
            }
            if ((!(_v328454))) {
                break;
            }
            Integer[] _new_array328453 = new Integer[(((_var4384)._1.length) << 1) + 1];
            System.arraycopy((_var4384)._1, 0, _new_array328453, 0, ((_var4384)._1.length));
            (_var4384)._1 = _new_array328453;
        }
        if (_var721.containsKey(x)) {
            {
                _var66253.remove(x);
            }
        }
        _var5992 = _var328369;
        for (Integer _var3237 : _var328370) {
            _var721.remove(_var3237);
        }
        //instrumentation
        HashMap<String, Object> map0 = new HashMap<String, Object>();
        //instrumentation
        map0.put("assert_result0", ((this._var721 == old_this__var721) && (this._var1457 == old_this__var1457) && (this._var4384 == old_this__var4384) && (this._var4384._1 == old_this__var4384_1) && (this._var4384._1.getClass().getName() == old_this) && (this._var66253 == old_this__var66253) && (size(this._var4384._1) == size(old_Type328393._1)) && (this._var587 != null) && (this._var721 != null) && (this._var1457 != null) && (this._var4384 != null) && (this._var5992 != null) && (this._var66253 != null) && (size(this._var66253) <= size(old_this__var66253_1)) && (size(this._var66253) >= size(old_this__var66253_1) - 1) && (size(this._var66253) - 1 <= size(old_this__var66253_1) - 1) && (this._var4384._0 == this._var5992) && (this._var4384._0 != null) && (this._var4384._1 != null) && (this._var4384._1.getClass().getName() == java.lang.Integer[].class.getName()) && (eltsNotEqual(this._var66253, null)) && (eltsEqual(typeArray(this._var66253), "java.lang.Integer"))));
        //instrumentation
        map0.put("_heap_size328385", _heap_size328385);
        //instrumentation
        map0.put("_sum328445", _sum328445);
        //instrumentation
        map0.put("_heap_size328380", _heap_size328380);
        //instrumentation
        map0.put("_singleton328449", _singleton328449);
        //instrumentation
        map0.put("_conditional_result328444", _conditional_result328444);
        //instrumentation
        map0.put("_var328370", _var328370);
        //instrumentation
        map0.put("_conditional_result328443", _conditional_result328443);
        //instrumentation
        map0.put("_var328369", _var328369);
        //instrumentation
        map0.put("_sum328440", _sum328440);
        //instrumentation
        map0.put("_var328368", _var328368);
        //instrumentation
        map0.put("_conditional_result328438", _conditional_result328438);
        //instrumentation
        map0.put("old_this__var66253", old_this__var66253);
        //instrumentation
        map0.put("old_this__var4384", old_this__var4384);
        //instrumentation
        map0.put("old_this", old_this);
        //instrumentation
        map0.put("old_this__var721", old_this__var721);
        //instrumentation
        map0.put("old_this__var1457", old_this__var1457);
        //instrumentation
        map0.put("old_this__var4384_1", old_this__var4384_1);
        //instrumentation
        map0.put("old_this__var66253_1", old_this__var66253_1);
        //instrumentation
        map0.put("old_Type328393", old_Type328393);
        //instrumentation
        map0.put("x", x);
        //instrumentation
        map0.put("this._var66253", this._var66253);
        //instrumentation
        map0.put("this._var1457", this._var1457);
        //instrumentation
        map0.put("this._var587", this._var587);
        //instrumentation
        map0.put("this._var721", this._var721);
        //instrumentation
        map0.put("this._var5992", this._var5992);
        //instrumentation
        map0.put("this._var4384", this._var4384);
        //instrumentation
        instrMap.put(jjj, map0);
        //instrumentation
        jjj = jjj + 1;
        ;
    }

    private _Type328393 copyType328393() {
        int length = this._var4384._1.length;
        Integer[] array = new Integer[length];
        System.arraycopy(this._var4384._1, 0, array, 0, length);
        return new _Type328393(this._var4384._0, array);
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

    private boolean ne(String x, String y) {
        return x != y;
    }
}
