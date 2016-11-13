package domain;

import DAO.DAOFactory;
import DAO.DAOFactoryMySQL;
import DAO.ProfileDAO;

import java.sql.Driver;
import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;

/**
 * Created by kosty on 11/7/2016.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        DAOFactory factory = new DAOFactoryMySQL("jdbc:mysql://localhost:3306/payeatpray?" +
        "user=root&password=FICTIO53");
        ProfileDAO  profileDAO= factory.getProfileDAO();

    }
}
