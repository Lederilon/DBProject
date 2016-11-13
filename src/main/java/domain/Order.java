package domain;

import java.util.Date;
import java.util.List;

/**
 * Contains informatin about an Order
 * @author KostyaHrishenko
 */
public class Order {
    private List<Position> positions;
    private Date creatingDate;
    private Date deliveryDate;

    /**
     * Create new order that coantains given positions an created on given creationDate
     * @param positions all  positions in this order
     * @param creatingDate when order was created
     */
    public Order(List<Position> positions, Date creatingDate) {
        this.positions = positions;
        this.creatingDate = creatingDate;
    }

    /**
     *
     * @return All positions in this order
     */
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
