package domain;

/**
 * Created by kosty on 11/7/2016.
 */
public class Feedback {
    private String text;
    private int mark;
    private Profile creator;
    private Profile acceptor;
    private FeedbackType type;

    public Feedback(String text, int mark, Profile creator, Profile acceptor, FeedbackType type) {
        this.text = text;
        this.mark = mark;
        this.creator = creator;
        this.acceptor = acceptor;
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Profile getCreator() {
        return creator;
    }

    public void setCreator(Profile creator) {
        this.creator = creator;
    }

    public Profile getAcceptor() {
        return acceptor;
    }

    public void setAcceptor(Profile acceptor) {
        this.acceptor = acceptor;
    }

    public FeedbackType getType() {
        return type;
    }

    public void setType(FeedbackType type) {
        this.type = type;
    }
}
