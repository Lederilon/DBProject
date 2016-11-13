package domain;

/**
 * Created by kosty on 11/7/2016.
 */
public class ProfileCategory {
    private final int id;
    public ProfileCategory(int id, CategoryNames name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public enum  CategoryNames{
        F("Catering facilities"),
        D("Delivery Service"),
        C("Consumer");
        private String name;

        CategoryNames(String  name) {
            this. name = name;
        }

        public String getName() {
            return  name;
        }

    };
    private CategoryNames name;
    public String toString(){
        return id + " " +name.getName();
}

}
