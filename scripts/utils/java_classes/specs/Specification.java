package java_classes.specs;

/**
 * Represents a specification with preconditions and postconditions.
 * <p>This class provides methods to retrieve, update, and clone preconditions and postconditions,
 * the specification is represented in Java Modeling Language (JML) and Java Language.
 */
public class Specification {

    private String preCondition;
    private String postCondition;

    /**
     * Constructs a new {@code Specification} instance with the provided precondition and postcondition.
     *
     * @param pre  the precondition string
     * @param post the postcondition string
     */
    public Specification(String pre, String post) {
        setPreCondition(pre);
        setPostCondition(post);
    }

    /**
     * Creates a new, independent copy of this {@code Specification} instance.
     *
     * @return a new {@code Specification} instance with identical precondition and postcondition values
     */
    public Specification copy() {
        return new Specification(preCondition, postCondition);
    }

    /**
     * Retrieves the precondition of this specification.
     *
     * @return the precondition as a {@code String}
     */
    public String getPreCondition() {
        return preCondition;
    }

    /**
     * Retrieves the postcondition of this specification.
     *
     * @return the postcondition as a {@code String}
     */
    public String getPostCondition() {
        return postCondition;
    }

    /**
     * Sets a new precondition for this specification.
     *
     * @param condition the new precondition to set
     */
    public void setPreCondition(String condition) {
        preCondition = condition;
    }

    /**
     * Sets a new postcondition for this specification.
     *
     * @param condition the new postcondition to set
     */
    public void setPostCondition(String condition) {
        postCondition = condition;
    }

    /**
     * returns the specification as the precondition and postcondition concatenated into a single string.
     *
     * @return a concatenated {@code String} of the precondition and postcondition
     */
    public String getSpecificationAsString() {
        return preCondition + postCondition;
    }
}
