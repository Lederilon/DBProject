package DAO;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by I on 13.11.2016.
 */
public class DAOFactoryMySQL implements DAOFactory {
    private String connectionString;
    public DAOFactoryMySQL(String connectionString){
        this.connectionString = connectionString;
    }
    public ProfileDAO getProfileDAO() throws SQLException {       ;
        return new ProfileDAOMySQL(DriverManager.getConnection(connectionString));
    }
}
