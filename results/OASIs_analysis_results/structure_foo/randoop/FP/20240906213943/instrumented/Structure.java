package examples;

public class Structure {

    private int var62;

    public  Structure() {
        clear();
    }

    public  Structure(int x) {
        var62 = ((x) + 1);
    }

    public void clear() {
        var62 = ((0) + 1);
    }

    public int foo() {
        int old_this_var62 = this.var62;
        int result = var62;
        if (!(((this.var62 == result) && (result == old_this_var62)))) {
            int mm = 2;
            assert (3 > mm);
        }
        return result;
    }

    public void setX(int y) {
        var62 = ((y) + 1);
    }
}
