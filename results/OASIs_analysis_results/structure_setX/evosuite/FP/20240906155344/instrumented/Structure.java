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
        //invalid pre: (this.var62 <= 2) && (y == -1 || y == 1) && (this.var62 == -963 || this.var62 == 1) &&
        if (!((this != null))) {
            return;
        }
        var62 = ((y) + 1);
        if (!(((this.var62 <= 2) && (this.var62 == 0 || this.var62 == 2)))) {
            int mm = 2;
            assert (3 > mm);
        }
    }
}
