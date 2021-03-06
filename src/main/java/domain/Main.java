package domain;

import DAO.DAOFactory;
import DAO.DAOFactoryMySQL;
import DAO.ProfileDAO;

import java.sql.Driver;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author KostyaHrishenko
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        DAOFactory factory = new DAOFactoryMySQL("jdbc:mysql://localhost:3306/payeatpray?" +
        "user=root&password=FICTIO53");
        ProfileDAO  profileDAO = factory.getProfileDAO();
     //  profileDAO.createProfile("dasd","asdad",new Date(),"asda", Profile.Sex.M,"@dasd",new ProfileCategory(1,ProfileCategory.CategoryNames.D)) ;
        Profile profile1 = profileDAO.getById(3);
        List<Profile> profiles = profileDAO.getAll();
        profileDAO.deleteById(7);
     //   System.out.println(profile1);
        for(Profile profile : profiles){
            System.out.println(profile);
        }
    }
}
