package domain;

/**
 * Created by kosty on 11/7/2016.
 */
public class ProfileCategory {
    public ProfileCategory(CategoryNames name) {
        this.name = name;
    }
    enum  CategoryNames{
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

}
