package domain;

import java.util.Date;
import java.util.List;

/**
 * Created by kosty on 11/7/2016.
 */
public class Order {
    private List<Position> positions;
    private Date creatingDate;
    private Date deliveryDate;

    public Order(List<Position> positions, Date creatingDate) {
        this.positions = positions;
        this.creatingDate = creatingDate;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    public Date getCreatingDate() {
        return creatingDate;
    }

    public void setCreatingDate(Date creatingDate) {
        this.creatingDate = creatingDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
