package java_classes.specs;

public class Specification {

    private static String preCondition;
    private static String postCondition;

    public Specification(String pre, String post) {
        preCondition = pre;
        postCondition = post;
    }

    public Specification clone() {
        Specification spec = new Specification(preCondition, postCondition);
        return spec;
    }

    public String getPreCondition() {
        return preCondition;
    }

    public String getPostCondition() {
        return postCondition;
    }

    public void setPostCondition(String condition) {
        postCondition = condition;
    }

    public String getSpecificationAsString() {
        return preCondition + postCondition;
    }
}
