package domain;

/**
 * Created by kosty on 11/7/2016.
 */
public class Position {
    private Goods goods;
    private int count;
    public Position(Goods goods ,int count) {
        setGoods(goods);
        setCount(count);
    }
    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
