package examples;

import java.util.Arrays;
import java.util.HashSet;

public class SimpleMethods {

    /**
     * Add element to non-null set
     * @param intSet set of integers
     * @param element integer value to add to set
     */
    public void addElementToSet(HashSet<Integer> intSet, int element) {
        //invalid pre: (element == 0 || element == 377) && 
        if (intSet != null) {
            intSet.add(element);
        }
        if (!((true))) {
            int mm = 2;
            assert (3 > mm);
        }
    }
}
