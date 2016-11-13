package domain;

import java.util.Date;
import java.util.LinkedList;

/**
 * Created by kosty on 11/7/2016.
 */
public class Main {
    public static void main(String[] args){
        LinkedList<ProfileCategory> categories = new LinkedList<ProfileCategory>();
        categories.add(new ProfileCategory(ProfileCategory.CategoryNames.C));
        categories.add(new ProfileCategory(ProfileCategory.CategoryNames.F));
        categories.add(new ProfileCategory(ProfileCategory.CategoryNames.D));
        Profile test = new Profile("a","b",new Date(),"c", Profile.Sex.F,"somesing@gmail.com",categories.get(0));
        Profile test2 = new Profile("z","b",new Date(),"c", Profile.Sex.F,"somesing@gmail.com",categories.get(0));
    }
}
