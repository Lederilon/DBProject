package domain;

import java.util.Date;

/**
 * Created by kosty on 11/7/2016.
 */
public class Offer {
    private int price;
    private Date creationDate;
    private Goods goods;
    private Profile creator;

    public Offer(int price, Date creationDate, Goods goods, Profile creator) {
        this.price = price;
        this.creationDate = creationDate;
        this.goods = goods;
        this.creator = creator;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Profile getCreator() {
        return creator;
    }

    public void setCreator(Profile creator) {
        this.creator = creator;
    }
}
