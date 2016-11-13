package domain;

/**
 * Created by kosty on 11/7/2016.
 */
public class Characteristic {
    private String name;
    private String comment;
    private String mesurementUnits;

    public Characteristic(String name, String comment, String mesurementUnits) {
        this.name = name;
        this.comment = comment;
        this.mesurementUnits = mesurementUnits;
    }

    public String getMesurementUnits() {
        return mesurementUnits;
    }

    public void setMesurementUnits(String mesurementUnits) {
        this.mesurementUnits = mesurementUnits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
