package domain;

/**
 * Created by kosty on 11/7/2016.
 */
public class Specification {
    private int value;
    private Characteristic characteristic;

    public Specification(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(Characteristic characteristic) {
        this.characteristic = characteristic;
    }
}
