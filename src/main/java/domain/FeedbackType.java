package domain;

/**
 * Created by kosty on 11/7/2016.
 */
public class FeedbackType {
    /**
     * Name of the feedback type
     */
    private String name;

    public FeedbackType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
