package domain;

import java.util.LinkedList;

/**
 * Created by kosty on 11/7/2016.
 */
public class Goods {
    private String name;
    private LinkedList<Specification> specification;

    public Goods(String name) {
        this.name = name;
        specification = new LinkedList<Specification>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addSpecification(Specification spec){
        specification.add(spec);
    }
}
