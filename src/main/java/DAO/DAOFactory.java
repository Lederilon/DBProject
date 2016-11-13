package DAO;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 */
public interface DAOFactory {
  public ProfileDAO getProfileDAO() throws SQLException;
  public Connection getConnection() throws SQLException;

}
