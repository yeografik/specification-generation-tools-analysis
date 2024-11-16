package examples;

import java.util.Map;
import java.util.HashMap;

public class Polyupdate implements java.io.Serializable {

    //instrumentation
    private static Map<Integer, HashMap<String, Object>> instrMap = new HashMap<Integer, HashMap<String, Object>>();

    //instrumentation
    private static int jjj = 0;

    private int _var23;

    private int _var426;

    public  Polyupdate() {
        clear();
    }

    /*
  public void add0(Integer s) {
	  java.util.ArrayList<Integer> x = new java.util.ArrayList<>();
	  _var23 = s;
	  Integer _sum345639 = 0;
	  for (Integer _x345640 : x) {
		  _sum345639 = (_sum345639 + _x345640);
	  }
	  _var426 = _sum345639;
  }

  public void add1(Integer x1, Integer s) {
	  java.util.ArrayList<Integer> x = new java.util.ArrayList<>();
	  x.add(x1);
	  _var23 = s;
	  Integer _sum345639 = 0;
	  for (Integer _x345640 : x) {
		  _sum345639 = (_sum345639 + _x345640);
	  }
	  _var426 = _sum345639;
  }

  public void add2(Integer x1, Integer x2, Integer s) {
	  java.util.ArrayList<Integer> x = new java.util.ArrayList<>();
	  x.add(x1);
	  x.add(x2);
	  _var23 = s;
	  Integer _sum345639 = 0;
	  for (Integer _x345640 : x) {
		  _sum345639 = (_sum345639 + _x345640);
	  }
	  _var426 = _sum345639;
  }
  */
    public void add3(int x1, int x2, int x3, int s) {
        java.util.ArrayList<Integer> x = new java.util.ArrayList();
        x.add(x1);
        x.add(x2);
        x.add(x3);
        _var23 = s;
        Integer _sum345639 = 0;
        for (Integer _x345640 : x) {
            _sum345639 = (_sum345639 + _x345640);
        }
        _var426 = _sum345639;
    }

    public  Polyupdate(java.util.ArrayList<Integer> x, int s) {
        _var23 = s;
        Integer _sum345639 = 0;
        for (Integer _x345640 : x) {
            _sum345639 = (_sum345639 + _x345640);
        }
        _var426 = _sum345639;
    }

    public void clear() {
        _var23 = 0;
        int _sum345641 = 0;
        _var426 = _sum345641;
    }

    public int sm() {
        return (_var23 + _var426);
    }

    public void a1(int y) {
        int old_this__var23 = this._var23;
        int old_this__var426 = this._var426;
        int old_y = y;
        int _conditional_result345643 = 0;
        if ((y > 0)) {
            _conditional_result345643 = (_var23 + y);
        } else {
            _conditional_result345643 = _var23;
        }
        int _var345637 = _conditional_result345643;
        int _var345638 = (_var426 + y);
        _var23 = _var345637;
        _var426 = _var345638;
        //instrumentation
        HashMap<String, Object> map0 = new HashMap<String, Object>();
        //instrumentation
        map0.put("assert_result0", ((this._var23 >= old_this__var23) && (this._var426 - old_this__var426 - old_y == 0)));
        //instrumentation
        map0.put("_var345638", _var345638);
        //instrumentation
        map0.put("_var345637", _var345637);
        //instrumentation
        map0.put("_conditional_result345643", _conditional_result345643);
        //instrumentation
        map0.put("old_y", old_y);
        //instrumentation
        map0.put("old_this__var426", old_this__var426);
        //instrumentation
        map0.put("old_this__var23", old_this__var23);
        //instrumentation
        map0.put("y", y);
        //instrumentation
        map0.put("this._var426", this._var426);
        //instrumentation
        map0.put("this._var23", this._var23);
        //instrumentation
        instrMap.put(jjj, map0);
        //instrumentation
        jjj = jjj + 1;
    }
}
