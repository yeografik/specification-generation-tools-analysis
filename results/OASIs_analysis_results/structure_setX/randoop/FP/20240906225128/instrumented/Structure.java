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
        return var62;
    }

    public void setX(int y) {
        int old_y = y;
        var62 = ((y) + 1);
        if (!(((this.var62 - old_y - 1 == 0)))) {
            int mm = 2;
            assert (3 > mm);
        }
    }
}
